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
# (Comments)
#Sample Feature Definition Template
Feature: I want to add a new affiliate

  @affiliatePage
  Scenario Outline: Add a new affiliate
    Given Select the affiliate tab
    When Click on the Add Affiliate button
    Then Should be able to enter <First Name>
    Then Should enter the <Last Name>
    Then pass the <Email>
    Then provide the <Phone Number>
    Then Select the affiliate status
    Then Select the portal access
    Then Submit the affiliate details
    Then Check affiliate created or not

    Examples: 
      | First Name | Last Name | Email                          | Phone Number |
      | New        | Affiliate | newaffiliate199820@yopmail.com |   9090909099 |
