Feature: Ticket Reservation

  Scenario: Ticket reservation check
    Given: Departure airport: RIX
    And   Destination airport: MEL
    And User data is:
      | name           | John     |
      | surname        | Black  |
      | discountCode   | Hello      |
      | travellerCount | 3          |
      | childrenCount  | 0          |
      | luggageCount   | 3          |
      | nextFlight     | 14-05-2019 |
    And seatNumber is: 27

    And we are on the home page

    When we are selecting airports
    And pressing on the GOGOGO button
    Then registration page appears

    When we are filling the registration form
    And we are pressing on the Get Price button
    Then our price will be 3070 EUR

    When we are pressing on the Book! button
    Then we can choose the seat

    When we are selecting our seat number: predefined
    And we are clicking Book! button
    Then we are receiving successful registration page

    When we are requesting reservation list
    Then we can see our reservation in the list

    When we are deleting our reservation ticket
    And requesting the reservation list again