Feature: To validate the account creation of amazon application
Scenario: To create new account
Given To launch the chrome browser and maximize the window
When To launch url of the amazon application
And To mouse hover the sign in button
And To click the start here button
# One Dimentional Map Data
And To pass the name in name text box
|name1|raja|
|name2|vignesh|
|name3|vikram|
And To pass the number in number text box
# Two Dimentional Map Data
And To pass the password in password text box
|password1|password2|password3|
|12345|asfdas|SD@adfa1|
|gfdgghg|145455|fgsads|
And To click the continue button
Then To close the chrome browser

