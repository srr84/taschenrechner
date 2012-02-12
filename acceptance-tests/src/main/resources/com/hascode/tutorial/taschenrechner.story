Narrative:
With the Calculator it should be possible to do basic mathematical operations

Scenario: Click a number
Given the calculator is in default state
When the user clicks number 0 Button
And the user clicks number 1 Button
And the user clicks number 2 Button
And the user clicks number 3 Button
And the user clicks number 4 Button
And the user clicks number 5 Button
And the user clicks number 6 Button
And the user clicks number 7 Button
And the user clicks number 8 Button
And the user clicks number 9 Button
And the user clicks dot Button
Then the result is 0123456789.

Scenario: Delete a value
Given the calculator has values inside the input field
When C is clicked
Then the input field is empty

Scenario: Add two values
Given the calculator is in default state
And a 5 is shown
And a + is shown
And a 5 is shown
When the user clicks = Button
Then the result is 10

Scenario: Subtract two values
Given the calculator is in default state
And a 9 is shown
And a - is shown
And a 5 is shown
When the user clicks = Button
Then the result is 4

Scenario: Multiply two values
Given the calculator is in default state
And a 9 is shown
And a * is shown
And a 5 is shown
When the user clicks = Button
Then the result is 45

Scenario: Division of two values
Given the calculator is in default state
And a 10 is shown
And a / is shown
And a 5 is shown
When the user clicks = Button
Then the result is 2

Scenario: Pow of a value
Given the calculator is in default state
And a 9 is shown
When the user clicks pow Button
Then the result is 81

Scenario: Squareroot of a value
Given the calculator is in default state
And a 9 is shown
When the user clicks sqrt Button
Then the result is 3

Scenario: Logaritmus of a value
Given the calculator is in default state
And a 1 is shown
When the user clicks ln Button
Then the result is 0