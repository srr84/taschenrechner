Scenario: Search for the hascode.com website on Google

Given The Google homepage
When I search for "site:hascode.com"
Then the text "hasCode.com » 2011 » March" is present
When I click the link "hasCode.com"
Then the text "Recent Articles" is present
And the page's URL should be "http://www.hascode.com/"