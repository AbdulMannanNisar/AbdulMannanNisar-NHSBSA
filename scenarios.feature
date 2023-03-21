Feature: As a citizen of the UK
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need
  @Chrome
  Scenario: UK Test Ticket
    Given  I am a citizen of the UK
    When I put my circumstances into the Checker tool
    Then  I should get a result of whether I will get help or not

  @Firefox
  Scenario: A UK Test Ticket
    Given  I am a citizen of UK
    When I put my circumstances into Checker tool
    Then  I should get result of whether I will get help or not


  @Mobile
  Scenario: A UK Test Ticket
    Given  I am a  citizen of UK
    When I put my  circumstances into Checker tool
    Then  I should  get result of whether I will get help or not

