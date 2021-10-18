Feature: Feature to check Login Functionality 

@regression
Scenario: Validate the Login Functionality with valid credentials 

	Given user is on Login Page 
	When user entering valid "admin@yourstore.com" and valid "admin" 
	And Clicking on Login button 
	Then Navigated to Homepage and check the Title 

@smoketest
Scenario Outline: 
	Validate the Login Functionality with valid and Invalid credentials 

	Given user is on Login Page 
	When user entering valid "<username>" and valid "<password>" 
	And Clicking on Login button 
	Then Navigated to Homepage and check the Title 
	
	Examples: 
		| username | password |
		| admin@yourstore.com | amin |
		| admin@yourstre.com |admin |
		| admin@yourstore.com |admin |
		| admin@yourstoe.com | admn |