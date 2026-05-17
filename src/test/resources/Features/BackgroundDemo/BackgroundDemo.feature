Feature: Check homepage feature

Background: user is logged in
Given  user is on loginpage
When user enters username andpasssword 
And clicks on login_button
Then user is navigated to the_homepage

Scenario: Check logout link
When user clicks on welcome_link
Then logout link is_displayed


Scenario: Verify quicklaunch toolbar is present
When user clicks on dashboardlink
Then quick launch toolbar isdisplayed

