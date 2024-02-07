Feature: Product Selection on Flipkart
  
  As a user
  I want to be able to select products from Flipkart
  So that I can view details and make a purchase

  Scenario: Selecting a product from search results
    Given user launch chrome browser
    When when user open url "https://www.flipkart.com/"
    When I search for "Iphone 12"
    And I select the first result from the search results
    Then I should be taken to the product details page

  Scenario: Viewing product details
    Given I am on the product details page of a selected mobile phone
    When I click on the product name or image
    Then I should be able to view detailed information about the product

  Scenario: Filtering products
    Given I have searched for "laptops"
    And I have applied filters for brand, price range, and specifications
    When I view the search results
    Then only laptops matching the applied filters should be displayed

  Scenario: Comparing products
    Given I am on the product details page of a mobile phone
    And I have added another mobile phone to the comparison list
    When I click on the "Compare" button
    Then I should be able to view a comparison of the selected products

  Scenario: Filtering products
    Given I have searched for "laptops"
    And I have applied filters for brand, price range, and specifications
    When I view the search results
    Then only laptops matching the applied filters should be displayed

  Scenario: Adding product to wishlist
    Given I am on the product details page of a laptop
    When I click on the "Add to Wishlist" button
    Then the product should be added to my wishlist for future reference

  Scenario: Adding a product to the cart
    Given I am on the product details page of a mobile phone
    When I click on the "Add to Cart" button
    Then the product should be added to my shopping cart
