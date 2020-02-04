Feature: Login Functionality
Scenario: Login to TestMeApp  and Report show on Jenkins
		
		Given user open TestMeApp
		When user click signin button
		And enter credentials as
		|lalitha|
		|Password123|
		Then click on login 
		
	
