Feature: Iam doing automation functionality of Add Jobs in Orange HRM


Background: CommonSteps
Given User launch chromebrowser
Then User launch application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario:
Given User enters Username as "Admin" and Password as "admin123"
Then User creates Jobs record
|Job112  |Job112desc|Job112 Note|
|Job113  |Job113desc|Job113 Note|
|Job114  |Job114desc|Job114 Note|
Then User close browser
