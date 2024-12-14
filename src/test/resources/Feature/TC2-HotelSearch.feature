Feature: verifying OMRBranch Hotel search

  Scenario Outline: verifying hotel search with valid datas
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"

    Examples: 
      | userName          | password    | hotelState | hotelCity | roomType | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | Deluxe   | 2024-06-10  | 2024-06-15   | 3-Three     | 3-Three      |              3 |

  Scenario Outline: verifying hotel search with valid datas and only mandatory fields
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>"

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-10  | 2024-06-15   | 3-Three     | 3-Three      |

  Scenario Outline: verifying hotel search without datas and clicking search button
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should click the search button without clicking any field
    Then user should verify error messages "<stateErrorMsg>","<cityErrorMsg>","<checkInErrormsg>","<checkoutErrorMsg>","<noOfRoomsErrorMSg>","<noOfAdultsErrorMsg>"
    Then user Should verify error messages as "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName          | password    | stateErrorMsg       | cityErrorMsg       | checkInErrormsg             | checkoutErrorMsg             | noOfRoomsErrorMSg          | noOfAdultsErrorMsg          |
      | sugubsk@gmail.com | Greens@2020 | Please select state | Please select city | Please select Check-in date | Please select Check-out date | Please select no. of rooms | Please select no. of adults |
@lowtohigh
  Scenario Outline: verifying hotel search  and click the price sort by low to high
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    Then user should verify after the search hotel success message as "Select Hotel"
    Then user should click the price sort by low to high button

    Examples: 
      | userName          | password    | hotelState | hotelCity | roomType | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | Deluxe   | 2024-06-13  | 2024-06-15   | 3-Three     | 3-Three      |              3 |
