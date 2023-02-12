Feature: login functionality of FB
Scenario: correct email and password
Given user is on FB login page
And username and password fields are enabled
When user enters correct credentials
And click on login button
Then user is navigated to home page