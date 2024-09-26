Feature: Cart related functionality

  @cart
  Scenario: Applying discount on a product - 1
    Given the product price is 100
    When a discount of 10.5% is applied
    Then the final price should be 89.5

  @cart
  Scenario: Applying discount on a product - 2
    Given the product price is 100
    When a discount of 10% is applied
    Then the final price should be 90

  @cartDataDrivenTest
  Scenario Outline: Adding different items to the cart
    Given the user adds "<item>" to the cart
    When the user proceeds to checkout
    Then the cart should contain "<item>" and the total should be "<price>"

    Examples:
      | item       | price |
      | Laptop     | 1000  |
      | Headphones | 100   |
      | Smartphone | 800   |

  @cartDataTableTest
  Scenario: Multiple items added to the cart
    Given the user adds the following items to the cart:
      | item       | price |
      | Laptop     | 1000  |
      | Headphones | 100   |
      | Mouse      | 50    |
    Then the total price should be 1150