package devilstudio.com.farmerfriend

import android.os.Bundle
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.provider.MediaStore
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*;
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {
    private lateinit var mClassifier: Classifier
    private lateinit var mBitmap: Bitmap

    lateinit var myDialog: Dialog


    private var pname:String?=""
    private var pSymptoms:String?=""
    private var pManage:String?=""

    private var NameV:TextView?=null
    private var SymptomsV: TextView? =null
    private var ManageV:TextView?=null

    private val mCameraRequestCode = 0
    private val mInputSize = 200 //224
    private val mModelPath = "model.tflite"
    private val mLabelPath = "labels.txt"

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContentView(R.layout.activity_main)
        mClassifier = Classifier(assets, mModelPath, mLabelPath, mInputSize)

        myDialog= Dialog(this)

        disease_info.setOnClickListener {
            customDialog()
        }


        mCameraButton.setOnClickListener {
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(callCameraIntent, mCameraRequestCode)
        }
//        mResultTextView.setOnClickListener{
//            val callDetailsIntent = Intent(this, DetailsActivity::class.java)
//            startActivity(callDetailsIntent)
//        }
        val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(callCameraIntent, mCameraRequestCode)
    }

    private fun customDialog() {
        myDialog.setContentView(R.layout.detail_dailog_act)
        myDialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialog.show()


        NameV=myDialog.findViewById(R.id.pltd_name) as TextView
        SymptomsV=myDialog.findViewById(R.id.symptoms) as TextView
        ManageV=myDialog.findViewById(R.id.management) as TextView

        NameV!!.text=mResultTextView.text

        val Sname=NameV!!.text.toString()

        try
        {
            val obj= JSONObject(loadJSONFromAsset())
            val jArray= obj.getJSONArray("plant_disease")
            for (i in 0 until jArray.length()){
                val plant=jArray.getJSONObject(i)
                pname=plant.getString("name")

                if (Sname.equals(pname)){
                    pSymptoms=plant.getString("symptoms")
                    pManage=plant.getString("management")
                }
                SymptomsV!!.text="$pSymptoms"
                ManageV!!.text="$pManage"
                Log.d(SymptomsV.toString(), ManageV.toString())
            }

        }
        catch (e:IOException) {
            e.printStackTrace()
        }
    }


    private fun loadJSONFromAsset(): String? {
        var json: String? = null
        try {
            var inputStream: InputStream = this.assets.open("data.json")
            val size=inputStream.available()
            val buffer=ByteArray(size)
            val charset:Charset=Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json=String(buffer,charset)
        }
        catch (e:IOException){
            e.printStackTrace()
            return null
        }
        return json
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == mCameraRequestCode){
            if(resultCode == Activity.RESULT_OK && data != null) {
                mBitmap = data.extras!!.get("data") as Bitmap
                mBitmap = scaleImage(mBitmap)
                mPhotoImageView.setImageBitmap(mBitmap)
                val model_output = mClassifier.recognizeImage(scaleImage(mBitmap)).firstOrNull()
                mResultTextView.text = model_output?.title
                //mResultTextView.text = model_output?.title + "\n" + model_output?.confidence
                // ADD CONFIDENCE TO ANOTHER TEXTVIEW FOR EASIER CODING
                mResultTextView_2.text = model_output?.confidence.toString()
            }
        }
    }

    fun scaleImage(bitmap: Bitmap?): Bitmap {
        val width = bitmap!!.width
        val height = bitmap.height
        val scaledWidth = mInputSize.toFloat() / width
        val scaledHeight = mInputSize.toFloat() / height
        val matrix = Matrix()
        matrix.postScale(scaledWidth, scaledHeight)
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true)
    }
}

