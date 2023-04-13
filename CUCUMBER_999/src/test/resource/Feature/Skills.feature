Feature: Iam doing automation of Add Skills in Orange HRM


Background: CommonSteps
Given User launch chrome browser
Then User launch application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"



Scenario:
Given User enters Username as "Admin" and Password as "admin123"
Then User creats Skills record
  |SkillName|SkillDescription|
  |USA1     |USA1 desc       |
  |USA2     |USA2 desc       |
When User logout 
Then User close browser
