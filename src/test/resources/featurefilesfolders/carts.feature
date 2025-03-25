@tag
Feature: Carts Page


Scenario: Product Visibility
  
    Given User goes to Url
    
    When User searches a product
    
    And Goes to cart 
    
    Then Cart should be empty
  
  
  @tag1
  Scenario: Product Visibility
  
    Given User goes to Url
    
    When User search a product 
    
    And Add it in the cart
    
    And Goes to cart 
    
    Then Product should be visible in the cart

  
  
