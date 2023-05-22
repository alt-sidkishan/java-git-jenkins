Feature: Login to customer portal

Scenario: successful login when user logs in with valid credentials

	Given I am on customer login page
	When I enter valid login credentials
	And I clicked on login button
	Then I verified that i am successfully redirected to the homepage