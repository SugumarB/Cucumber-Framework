Feature: Verifying Swiggy search food items

 
  Scenario Outline:  verifying Swiggy search food iteam as snackes
    Given: user is on the Swiggy search page
    When: user search the snackes
    |Mixture|
    |Coolberg Peach|
    |Coolberg Cranberry|
    Then: user should verify all product listed

