#Author: Guna-23-8-2022

@Login
Feature: Validate Login Feature

@ValidLogin
Scenario: Validate Login Feature with valid data

Given Open Browser
When Enter URL
When Click Login Link
Then Verify Login Page Loaded or Not
When Enter Username
And Enter Password
When Click Login button
Then Verify Login Success or Not
