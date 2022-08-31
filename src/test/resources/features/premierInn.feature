Feature:  Booking functionality

  Background: For the scenarios in the feature file, user is expected to be on home page
    Given user is on the home page

  Scenario Outline:User should be able to change booking date and see the information in the Rooms available

    When user clicks "Manage booking"
    And user enters "<BookingReference>"
    And user enters "<BookingSurname>"
    And user enters "<ArrivalDate>"
    And user clicks "search button"
    And user clicks "Amend booking"
    And user changes Arrival date to 30-Oct-22
    Then user sees the information in the Rooms available

    Examples:
      | BookingReference | BookingSurname | ArrivalDate |
      | BCVR237241       | Tester  | 22-Sep -22  |
      | AUUR261388       | Tester  | 25- Sep -22 |
      | AMOR227074       | Tester  | 28- Sep -22 |
