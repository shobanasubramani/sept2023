Feature: salesforce login
Scenario: correct username and password
Given the url
When I enter correct username and correct password
Then click on login button
Then homepage is seen


Scenario: wrong username and wrong password
Given the url
When I enter wrong username and wrong password
Then click on login button
Then error message is displayed


Scenario: correct username and wrong password
Given the url
When I enter correct username and wrong password
Then click on login button
Then error message is displayed


Scenario: correct username and password with remember me
Given the url
When I enter correct username and correct password
Then click remember me button
Then click on login button
Then homepage is seen
Then go to username and logout
Then we see username on usertextbox


Scenario: correct username and forgot password 
Given the url
When I enter correct username 
Then click on login button
Then error message is displayed

