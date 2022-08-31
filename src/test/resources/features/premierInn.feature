Feature:  Booking functionality

  Background: For the scenarios in the feature file, user is expected to be on home page
    Given user is on the home page

  Scenario Outline:User should be able to change booking date and see the information in the Rooms available

    When customer clicks "Manage booking"
    And customer enters "<BookingReference>"
    And customer enters "<BookingSurname>"
    And customer enters "<ArrivalDate>"
    And customer clicks "search button"
    And customer clicks "Amend booking"
    And customer selects arrival date from amend page
    And customer changes reservation date as "<UpdatedArrival>"
    Then customer sees the information in the Rooms available
    And customer sees reservation details stored in "bookingLogs.csv" file

    Examples:
      | BookingReference | BookingSurname | ArrivalDate | UpdatedArrival |
      | BCVR237241       | Tester         | 22-Sep -22  | 26-Sep -22     |
      | AUUR261388       | Tester         | 25- Sep -22 | 28-Sep -22     |
      | AMOR227074       | Tester         | 28- Sep -22 | 29-Sep -22     |
