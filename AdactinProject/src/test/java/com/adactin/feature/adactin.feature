@AdactinTest
Feature: To verify the login page of adactin hotel page


@TC-101 
Scenario: validate login funtion with Invalid Credentials
Given user launch chrome browser with adactin url
And user enter valid user name 
And user enter valid password
Then click loginbutton to login



@TC-102
Scenario: To Search Hotel in Adactin Page
Given User select the location
And User Select Hotel name
And User select Hotel Type
And User select Room type
And User select check in date and check out date
And User select number of person in the in hotel room
And User Click Search page

@TC-103
Scenario:
Given Check click check buuton and click continue

@TC-104
Scenario: User Book Hotel
Given User give their name and Address details to Book hotel

@Tc-105
Scenario: My Itenary Page
Given user Scroll the window and click My Itenary Button
And click check In Box
And user Click Alert Box


@Tc-106
Scenario: Logout Hotel Page
Given User click Logout Button







