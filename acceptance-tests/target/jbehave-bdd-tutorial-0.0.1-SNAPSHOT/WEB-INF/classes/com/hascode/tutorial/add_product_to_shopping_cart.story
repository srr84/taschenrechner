Scenario: When a user adds a product to the shopping cart, the product should be included in the user's shopping cart.

Given a user
Given a shopping cart
Given a product
When the user adds the product to the shopping cart
Then the product must be included in the list of the shoppingcart's entries