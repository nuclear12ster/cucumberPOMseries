Feature: Login Page Feature

Scenario: Login Page title
Given user is on login page
When user gets the title of the page
Then page title should be "Account Login"

Scenario: Forgot passoword link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "naveenanimation20@gmail.com"
And user enters password "Selenium12345"
And user clicks on login button
Then user gets the title of the home page
And page title should be "My Account"