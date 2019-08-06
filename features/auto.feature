Feature: Launch adactin testcasess practise page
Scenario: user opens adactin
Then User launch adactin
Then user enters username and password
And user click on login button




Scenario Outline:
Then now the user  select '<location>' in search hotel page
Then user select Hotels select data
Then user select roomtype
Then user select noof room
Then user enter in '<CheckInDate>'
And  user enter out '<CheckOutDate>'
Then user select adult room
Then user select children
And user click on search button
Examples:
|CheckInDate|CheckOutDate|
|07/08/2019|05/08/2019|
|02/08/2019|05/08/2019|


Scenario Outline: now user should verify location is sydney at hotel page
Then  user should click on radio button
Then user must verify location '<location>' must match in  previous location selected 
And user clicks on continue button
Examples:
|location|
|Sydney|



Scenario Outline: No-of-rooms should be displayed and match with number of rooms in search hotel page
Then now the user  select location in search hotel page
Then user select Hotels select data
Then user select roomtype
Then user select noof room
Then user enter in '<CheckInDate>'
And  user enter out '<CheckOutDate>'
Then user select adult room
Then user select children
And user click on search button

Then user should check no of rooms matched with droop down value

Then user select No-of-rooms:3

Then user select noof room 1
Then user select adult room 1
Then user select children
Examples:
|CheckInDate|CheckOutDate|
|02/08/2019|05/08/2019|