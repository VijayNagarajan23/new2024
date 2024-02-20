Feature: Orange Hrm Application

Scenario: To verify the login functionality of the application
Given user launch the browser
When User enter the username as "Admin"
And User enter the password as "admin123"
When user click the login button
Then user should navigate to the dashboard page
