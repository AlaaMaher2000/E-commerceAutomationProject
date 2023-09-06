@Add_to_Card
Feature:this feature will allow users to can add product to the shopping cart
    Scenario:The user can add the product to the shopping cart directly
      Given  User have a list of products from search results or from navigating list of products in home page
      And  User add the product to the shopping cart
      And  User can navigate to the shopping cart to confirm that the product is added
      Then User can update the quantity from the shopping cart
