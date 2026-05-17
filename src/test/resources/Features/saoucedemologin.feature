@LoginTest
Feature: login feature of sauce demo file
Scenario Outline: check the ligin functionality

Given user open the webpage
And user in on logign page
When selects the enters the <username> and <password>
And user is on login 
Then user is navigated to the test page

Examples:
|username 				| password|
|standard_user			|secret_sauce|
|locked_out_user		|secret_sauce|
|problem_user			|secret_sauce|
|performance_glitch_user|secret_sauce|
|error_user				|secret_sauce|
|visual_user			|secret_sauce|
