#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: As a admin i want to delete a affiliate

  Scenario Outline: Delete the affiliate
    Given Navigate to affiliate tab
    #And Search the affiliate by filling the affiliate Email from given sheetname "<SheetName>" and rownumber <RowNumber>
    And Search the affiliate by <Affiliate Email>
    When Click on the menu dropdown
    And Select the delete option
    And Confirm the deletion of affiliate
    Then verify affiliate is deleted or not

Examples:
			|Affiliate Email|
			|NewAffiliate199820@yopmail.com |
    #Examples: 
      #| SheetName | RowNumber |
      #| Affiliate |         0 |
      
