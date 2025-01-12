<h1 align="center">Plant-Disease-Detection-and-Solution</h1>
<div align="center" width="100%">
<code><img height="25" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/python/python.png"></code>
<code><img height="25" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/tensorflow/tensorflow.png"></code>
<code><img height="25" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/android/android.png"></code>
<code><img height="25" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/kotlin/kotlin.png"></code>
</div>


<p align="center">Project on Plant Disease detection and Solutions using Image Classification technique.</p>
<br>

<div align="center" width="100%">

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
<br>

![conda-python]
![conda-tensorflow]
![conda-keras]
</div>

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Language Used](#language-used)
  * [Files Required](#files-required)
  * [Files](#files)
  * [Inspiration](#inspiration)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
  * [Working](#working)
* [How We Build It](#how-we-build-it)
    * [The AI Model](#the-ai-model)
    * [The Android App](#the-android-app)
* [Usage](#usage)
* [Challenges And Accomplishments](#challenges-and-accomplishments)
  * [Challenges](#challenges)
  * [Accomplishments](#accomplishments)
* [Improvising And Upgrading Task](#improvising-and-upgrading-task)
  * [What we learned](#what-we-learned)
  * [Whats next](#whats-next)
  * [Future Task](#future-task)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)


<!-- ABOUT THE PROJECT -->
## About The Project

This project is based on Plant Disease Detection using Image Classification with Solution for detected disease of plant. This project comprises of Machine Learning part and Android Application Development part. On Machine Learning side, we developed a well-trained model for image classification which will help to classify the disease of the infected plant. On Android App Dev. part, we click images of infected plant and compare with our classification model, then it detects disease of infected plant and also provides solutions for disease of infected plant.

### Language Used

This project is built using **_Python_** for Machine Learning and **_Kotlin_** for Android App Development. It’s required to have adequate knowledge about language used in project.
* **_PYTHON_** : [Learn Python][learn-python] OR [Python from W3School][python-w3]
* **_KOTLIN_** : [Learn Kotlin][kotlin]

### Files Required

* The dataset file used is given here :
> [newplantvillage.zip][dataset-onedrive]

* The json file used is given below: 
> [data.json][json-drive]

### Files

* **_data.json_** – This file holds the solution for infected plant, it is used for providing solution when disease match is found and then solution is provided.
  
> **`Note: This file is to kept inside project assets folder. Path to the:`** **_`FarmerFriendApp\app\src\main\assets`_**
* **_Plant_Disease_Detection_Classification.ipynb_** - Notebook for training and testing the models.
* **_FarmerFriendApp/outputs/apk/debug/app-debug.apk_** - APK you can directly install and get started.

### Inspiration

In support of Plant Village Project, we aim to help smallholder farmers grow more food. Farmers who don't have the outreach to beat crop diseases usually feel helpless or become ignorant. The result of this is a lower than average yield of crop production.

## Getting Started

From here the overall setup of project starts

### Prerequisites

Here, are some software & tools required that are used for building and enhancing our performance for project.

* [Python][python-down]
* [Anaconda Individual Edition][conda-ie]
* Jupyter Notebook: (It’s packed in anaconda)
* [VS Code][vscode-down]
* [Pycharm Community][pycharm-down]

>    **_`OR`_**

* **_Google Colab_**

    `Note: I have built this project using Google Colab. Due to low performance of my system.`

### Installation

1. Download and Install Python from above link if not installed.
1. Download Anaconda from above link if not installed.
1. For Installing Anaconda, Follow steps performed from below given Video Link. 
    * [Setup Anaconda][setup-anaconda]
1. After Installing, open Anaconda and launch Jupyter Notebook.
1. Now open notebook files from project folder.

### Working

The android application developed for the purpose provides the services while keeping in mind the ease for the user to interact with it. The application provides a handy camera integration to allow the farmer to click an image of the crop he wishes to diagnose. This image is processed in the backend using a deep learning model to classify the plant disease. The classification includes a class "background" exclusively to alert the user that the camera frame did not capture the infected area of the plant properly. It can detect any disease on the plant leaves. Further, it gives information about the parent plant and recommendations on how to improve the plant health and along with information of the natural breeding environment of the plant. If there is any confusion left by the AI, then the app also gives information on symptoms of the disease. This is pretty helpful from the farmer's point of view as information’s like these help the farmer to catch early disease symptoms, recognize current infections and also guides how these diseases can be cured. What's more to this is that the application is built using Tensorflow lite technology to improve memory and time efficiency of the application. With the help of this, the AI processes the image within seconds without affecting the other processes of the device.

## How We Build It

### The AI Model

We used convolution networks for image classification of the disease classes. We converted the model and optimized it using the Tensorflow lite format to be used on the android application in memory and time-efficient manner. The Tensorflow lite converts the large heavy deep learning models to a smaller and mobile hardware supportive format. It also quantizes the parametric learning weights to reduce the model file size. For example, we converted our convolution model file of 2mb to 200kbs without compromising on the performance of the model. All the database for this app is stored locally to avoid the requirement of internet connection for its usage. The user just needs to click the image of his plant and the app helps them out with the rest.

### The Android App

The android application was developed using the android studio framework. The different phases of the application involve a live camera feed in the beginning. The user clicks an image from the camera feed. The application sends this image for preprocessing from where it is pushed as input to the AI model. The AI model outputs the class of the plant and disease. We use this to pull out information about this plant and disease from our knowledge base. The application then displays all the relevant information about the prediction for the farmer's help.

## Usage

Below screen provides usage of our android app demo.

<div align="center" width="100%">
<img src="usage/usage.gif" alt="App Usage showcase gif" title="App Usage showcase gif" width="400"/>
</div>

## Pre-compiled version

`Note: This Pre-compiled version contains files which we received after computing but We have added these as If computing is not possible for system user's .`

> [Pre-Compiled version](https://sahilthakur27.gumroad.com/l/plant_diseas_premade_version)


## Challenges And Accomplishments

### Challenges
    Setting up a real-time environment in the android application.

### Accomplishments

1. Creating an application where there is access to a camera which is practical enough for a normal user's usage.
1. The time and memory-efficient AI model implementation which would help this application to be used on lower level android applications.
1. The display of possible symptoms to catch the disease at an early stage which might be predicted with low confidence by the AI model. Sometimes such low confidence predictions which don't have visual support to prove are ignored by users. Pointing out the symptoms would give a strong support to diagnose a hidden disease at an early stage.
1. Information on how to cure the disease detected. Guides the user with a path for action too instead of just identification and detection.

    `With all these accomplishments.`

## Improvising And Upgrading Task

### What we learned
> **_`With even simple impactful applications we can improve a lot indirectly.`_**

### Whats next

Integrating a Chatbot for more advice and interaction with the user. Adding links to e-commerce website so farmers can order pesticides. Adding climate data integration for alternative crop-weather recommendations. Using the crop propagation data and weather change analysis for pointing out how the climate change has agriculture pattern and hence creating an awareness alongside.

### Future Task

* Chatbot for personalized help.
* Ordering fertilizer from ecommerce site.
* Setting reminder for pesticides/watering etc.
* Advising on best practices.

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

* Fork the [Project][fork].
>    *`OR`*
* Please read [CONTRIBUTING][contributing], for details on our code of conduct, and the process for submitting pull requests to us.


<!-- LICENSE -->
## License

Distributed under the MIT License. See [***`LICENSE`***][license-url] for more information.

<!-- CONTACT -->
## Contact

* [*Twitter*](https://twitter.com/devil_2708)
* [*Gmail*](sahilthakur376@gmail.com)

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [W3school](https://www.w3schools.com/)
* [Learn Kotlin](https://developer.android.com/kotlin/campaign/learn)
* [Learn Python](https://www.learnpython.org/)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/DevilStudio27/Plant-Disease-Detection-and-Solution?color=cyan&label=Contributors&logo=github&logoColor=cyan&style=flat-square
[contributors-url]: https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Devilstudio27/Plant-Disease-Detection-and-Solution?color=cyan&label=Forks&logo=github&logoColor=cyan&style=flat-square
[forks-url]: https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/network/members
[stars-shield]: https://img.shields.io/github/stars/DevilStudio27/Plant-Disease-Detection-and-Solution?color=cyan&label=Stars&logo=github&logoColor=cyan&style=flat-square
[stars-url]: https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/stargazers
[issues-shield]: https://img.shields.io/github/issues/DevilStudio27/Plant-Disease-Detection-and-Solution?color=cyan&label=Issues&logo=github&logoColor=cyan&style=flat-square
[issues-url]: https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/issues
[license-shield]: https://img.shields.io/github/license/devilstudio27/Plant-Disease-Detection-and-Solution?color=cyan&label=MIT%20License&logo=github&logoColor=cyan&style=flat-square
[license-url]: https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/blob/main/LICENSE


[contributing]:https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/graphs/contributors
[fork]:https://github.com/DevilStudio27/Plant-Disease-Detection-and-Solution/network/members


[conda-python]:https://img.shields.io/conda/v/anaconda/python?color=cyan&label=Python&logo=python&style=flat-square
[conda-tensorflow]:https://img.shields.io/conda/v/anaconda/tensorflow?color=cyan&label=Tensorflow&logo=Tensorflow&style=flat-square
[conda-keras]:https://img.shields.io/conda/v/anaconda/keras?color=cyan&label=Keras&logo=keras&logoColor=ff0000&style=flat-square

[learn-python]:https://www.learnpython.org/
[python-w3]:https://www.w3schools.com/python/
[kotlin]:https://developer.android.com/kotlin/campaign/learn

[dataset-onedrive]:https://bit.ly/PlantDiseaseDatasetRequest
[json-drive]:https://sahilthakur27.gumroad.com/l/plant_disease_data_json

[python-down]:http://bit.ly/PythonDown
[conda-ie]:http://bit.ly/CondaDown
[vscode-down]:http://bit.ly/VSCodeDown
[pycharm-down]:http://bit.ly/PycharmDown
[setup-anaconda]:http://bit.ly/setupConda
