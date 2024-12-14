Feature: verifying OMRBranch Hotel Book

  @book
  Scenario Outline: verifying hotel book
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should add the GST details "<registrationNo>","<companyName>","<companyAddress>"
    And user should add the special request as "<specialRequest>"
    And user  should add the payment details proceed with card type "<cardType>"
      | select card | cardNo           | cardName | month | year | CVV |
      | Visa        | 5555555555552222 | sugumar  | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | sugumar  | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | sugumar  | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | sugumar  | July  | 2024 | 123 |
    And user should verify after booking success message "Booking is Confirmed" and save the order ID
    And user should verify the the booking ID
    Then user should save the booked hotel name  and booking order ID is present or not

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | registrationNo | companyName            | companyAddress | specialRequest     | cardType   |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-07-20  | 2024-07-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | extend Vacate time | Debit Card |

  @book_creditcard_specialrequest
  Scenario Outline: verifying hotel book_card(creditcard_VIAS) with special request
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should add the GST details "<registrationNo>","<companyName>","<companyAddress>"
    And user should add the special request as "<specialRequest>"
    And user  should add the payment details proceed with card type "<cardType>"
      | select card | cardNo           | cardName | month | year | CVV |
      | Visa        | 5555555555552223 | sugumar  | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | sugumar  | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | sugumar  | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | sugumar  | July  | 2024 | 123 |
    And user should verify after booking success message "Booking is Confirmed" and save the order ID

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | registrationNo | companyName            | companyAddress | specialRequest     | cardType    |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-20  | 2024-06-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | extend Vacate time | Credit Card |

  @book_Debitcard_Withoutspecialrequest
  Scenario Outline: verifying hotel book_card(Debitcard_VIAS) without special request
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should add the GST details "<registrationNo>","<companyName>","<companyAddress>"
    And user should not add the special request as "<specialRequest>"
    And user  should add the payment details proceed with card type "<cardType>"
      | select card | cardNo           | cardName | month | year | CVV |
      | Visa        | 5555555555552222 | sugumar  | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | sugumar  | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | sugumar  | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | sugumar  | July  | 2024 | 123 |
    And user should verify after booking success message "Booking is Confirmed" and save the order ID

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | registrationNo | companyName            | companyAddress | specialRequest | cardType   |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-20  | 2024-06-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   |                | Debit Card |

  @book_Creditcard_Withoutspecialrequest
  Scenario Outline: verifying hotel book_card(creditcard_VIAS) without special request
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should add the GST details "<registrationNo>","<companyName>","<companyAddress>"
    And user should not add the special request as "<specialRequest>"
    And user  should add the payment details proceed with card type "<cardType>"
      | select card | cardNo           | cardName | month | year | CVV |
      | Visa        | 5555555555552223 | sugumar  | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | sugumar  | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | sugumar  | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | sugumar  | July  | 2024 | 123 |
    And user should verify after booking success message "Booking is Confirmed" and save the order ID

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | registrationNo | companyName            | companyAddress | specialRequest | cardType    |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-20  | 2024-06-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   |                | Credit Card |

  @book_W/O_GST_Debitcard_specialrequest
  Scenario Outline: verifying hotel book_W/Ocard(Debitcard_VIAS) without special request
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should not add the GST details
    And user should add the special request as "<specialRequest>"
    And user  should add the payment details proceed with card type "<cardType>"
      | select card | cardNo           | cardName | month | year | CVV |
      | Visa        | 5555555555552222 | sugumar  | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | sugumar  | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | sugumar  | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | sugumar  | July  | 2024 | 123 |
    And user should verify after booking success message "Booking is Confirmed" and save the order ID

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | specialRequest     | cardType   |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-20  | 2024-06-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com | extend Vacate time | Debit Card |

  @book_includeGST_UPID_specialrequest
  Scenario Outline: verifying hotel book_IncludeGST(UPID) with special request
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"
    And user should search hotel  "<hotelState>","<hotelCity>","<roomType>","<checkInDate>","<checkOutDate>","<no of Rooms>","<no of Adults>","<no of Children>"
    And user should verify after the search hotel success message as "Select Hotel"
    And user should save the first hotel name and hotel price
    And user should  select the first hotel name and price
    And user should accept the booking popup alert
    And user should verify the booking confirmation message as "Book Hotel"
    And user should add the guest details "<select salutation>","<firstName>","<lastName>","<mobileNo>","<email>"
    And user should add the GST details "<registrationNo>","<companyName>","<companyAddress>"
    And user should add the special request as "<specialRequest>"
    And user  should add the payment details proceed with payment option as UPID "<UPIid>"
    And user should verify after booking success message "Booking is Confirmed" and save the order ID

    Examples: 
      | userName          | password    | hotelState | hotelCity | checkInDate | checkOutDate | no of Rooms | no of Adults | no of Children | select salutation | firstName | lastName | mobileNo   | email             | registrationNo | companyName            | companyAddress | specialRequest     | UPIid                |
      | sugubsk@gmail.com | Greens@2020 | Karnataka  | Mysuru    | 2024-06-20  | 2024-06-26   | 3-Three     | 3-Three      |              3 | Mr                | sugumar   | B        | 9944929274 | sugubsk@gmail.com |     9043592058 | Greens Tech OMR Branch | Thoraipakkam   | extend Vacate time | seleniumtraining@vbc |
