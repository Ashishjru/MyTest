Feature: Search and place the order for products

#  Scenario: Search experience in both product page and offer page
#
#    Given User is on greenKart landing page
#    When  User searched with ShortName "Tom" and extracted the actual product name
#    Then  User searched with same shortname in offerpage and check if product exists
##    And   It will be validate and check if the product exist or not
  @SearchProduct
  Scenario Outline: Search experience in both product page and offer page

    Given User is on greenKart landing page
    When  User searched with ShortName <Name> and extracted the actual product name
    Then  User searched with same shortname in offerpage and check if product exists
    Examples:
      | Name |
      | Tom  |
      | Pot  |


  @PlaceOrder
  Scenario Outline: Search a product and place a order

    Given User is on greenKart landing page
    When  User searched with ShortName <Name> and extracted the actual product name
    And   Select the <No> of items in the cart
    Then  User processed to the checkout page and the product by <Name> in the cart
    And  Check user is able to place an order or not


    Examples:
      | Name |  | No |
      | Tom  |  | 1  |


