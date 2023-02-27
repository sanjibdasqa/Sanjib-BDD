Feature: Internet Quote Testing

  @internet
  Scenario: Create Internet Quote
    Given go to internet quote page
    And click sentra car button
    When Validate get quote page title
    And insert first name 'Sanjib'
    Then insert Zip code '02587502'
    
    @dataDriven @csr-587
 Scenario Outline: Internet Quote with <zipcode>
    Given go to internet quote page
    And click sentra car button
    When Validate get quote page title
    And insert first name 'Sanjib'
    Then insert Zip code <zipcode>
    Examples:
    |zipcode|
    |'25478'|
    |'45897'|
    |'36547'|
    
    