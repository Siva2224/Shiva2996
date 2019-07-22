
Feature: Title 
  


  
  Scenario: TestMe App 
  	Given Launch chrome and load TestMeApp
  	And navigate to signup
  	And enter the credentials
  		| userName        |firstName  |lastName  |password |Confirm password|Gender|Email               |MobileNumber |DOB       |Address                |SecurityQuestion        |Answer|
  		| vivophone    |shiva      |magaraj   |shiva2994|shiva2994       |Male  |sivaaathyu@gmail.com|9677037980   |12/29/1996|149,kodambakkam,chennai|What is your birth place?|ngl|
  	Then click on register button	