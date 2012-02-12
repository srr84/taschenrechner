Narrative:
With the Calculator it should be possible to do basic mathematical operations

Scenario: Click a number
Given the calculator is in default state
When a 5 is clicked
Then 5 is shown inside the input field

Scenario: Delete a value
Given the calculator has values inside the input field
When C is clicked
Then the input field is empty