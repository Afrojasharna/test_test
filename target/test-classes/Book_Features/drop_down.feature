Feature: this is a dropdown feature

@Cloud
Scenario: Verify user can dropdown and search item

Given Launch <"URL"> Bo
Then select Antiques from dropdown
Then Click search button
Then Verify user can dropdown and search item