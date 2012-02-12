Scenario: When users are added to the repository they must be found afterwards in the repository

Given a user repository
When the user adds 3 users to the user repository
Then the user repository must contain 3 users