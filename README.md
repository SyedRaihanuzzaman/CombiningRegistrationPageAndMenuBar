# CombiningRegistrationPageAndMenuBar





![splash](https://github.com/SyedRaihanuzzaman/CombiningRegistrationPageAndMenuBar/assets/142418984/f134417c-2447-402c-a1f1-a4ad8acee6c8)
![main menu](https://github.com/SyedRaihanuzzaman/CombiningRegistrationPageAndMenuBar/assets/142418984/2c692822-557c-421f-9149-012fc2765aa7)
![regpage](https://github.com/SyedRaihanuzzaman/CombiningRegistrationPageAndMenuBar/assets/142418984/bb5ec646-e1f9-4c11-82d0-53f5081594db)
![pass data](https://github.com/SyedRaihanuzzaman/CombiningRegistrationPageAndMenuBar/assets/142418984/a6b97827-17e1-4d5f-9140-818e9e965f80)
![menu$toolbar](https://github.com/SyedRaihanuzzaman/CombiningRegistrationPageAndMenuBar/assets/142418984/92a2aae3-6784-4725-8891-f8a17311bbf3)



Android Splash Screen, Main Page, Registration Page, Menu and Toolbar, and Data Passing Project
This project demonstrates how to create an Android project with a splash screen, a main page, a registration page, a menu and toolbar page, and data passing.

Getting Started
Clone the repository to your local machine.
Open the project in Android Studio.
Run the project on an Android device or emulator.
How It Works
The project has four activities:

The SplashActivity is the starting activity. It displays a splash screen for 2 seconds and then starts the MainActivity.
The MainActivity is the main page. It has two buttons: one to open the RegistrationActivity and the other to open the MenuAndToolbarActivity.
The RegistrationActivity is where users can register for an account. It has a text field where users can enter their username and a password. When the user clicks the "Register" button, the data is passed to the MainActivity.
The MenuAndToolbarActivity is a simple activity with a menu and toolbar.
The data is passed between activities using the Intent object. The Intent object is used to start an activity and can also be used to pass data between activities.

In this project, the data is passed by calling the putExtra() method on the Intent object. The putExtra() method takes two arguments: the name of the key and the value of the key.

The key is a string that is used to identify the data. The value can be any type of data, such as a string, an integer, or an object.

In this project, the key is username and the value is the username that the user entered in the RegistrationActivity.

When the user clicks the "Register" button in the RegistrationActivity, it creates an Intent object and calls the putExtra() method to pass the username to the MainActivity.

The MainActivity receives the username in the onCreate() method. The onCreate() method is called when the activity is created.

To receive the username, the MainActivity calls the getIntent() method. The getIntent() method returns the Intent object that was used to start the activity.

The MainActivity can then access the username by calling the getStringExtra() method. The getStringExtra() method takes the name of the key as an argument and returns the value of the key.

In this project, the MainActivity calls the getStringExtra() method to get the value of the username key.



Author
This project was created by [Syed Raihanuzzaman].








