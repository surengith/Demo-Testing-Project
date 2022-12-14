Feature: Checking the register page and alert page functionality 
@Test1
Scenario: Register Page 

	Given user Must Launch The Url 
	When user Enter The First Name In The First Name Field 
	And user Enter The Last Name In The Last Name Field 
	And user Enter The Address In The Address Field 
	And user Enter The Email In The Email Field 
	And user Enter The Phone Number In The Phone Number Field 
	And user Click The Radio Button To Select The Gender 
	And user Click The Checkbox To Select The Hobbies 
	And user Select The Language In The Language Field 
	And user Select The Skills In The Skills Field 
	And user Select The Country In The Country Field 
	And user Select The Country In Select Country Field 
	And user Select The Year In The Year Field 
	And user Select The Month In The Month Field 
	And user Select The Day In The Day Field 
	And user Enter The Password In The Password Field 
	And user Enter The Password In The Confirm Password Field 
	And user Click The Submit Button To Register The Registration 
	Then user Take ScreenShot 
	
@Test2
Scenario: Alert Page 

	When user Click The SwitchTo Option 
	And user Click The Alerts In The SwitchTo Option 
	And user Click The Click The Button To Display An Alert Box Button 
	And user Accept The Popup Alert Message 
	And user Click The Alert With Ok & Cancel Option 
	And user Click The Click The Button To Display A Confirm Box Button 
	And user Dismiss The Popup Alert Message 
	And user Click The Alert With Textbox Option 
	And user Click The Click The Button To Demonstrate The Prompt Box Button 
	And user Enter The Text In Alert Text Field 
	And user Accept The Popup Alert Message 
	Then user Take ScreenShot1