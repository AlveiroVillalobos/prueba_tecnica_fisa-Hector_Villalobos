@playVirtualPiano
Feature: Play virtual piano

  @playVirtualPiano1 @regression @smokeTest
  Scenario: Play first sequence
    Given User navigates to the virtual piano app
    When User plays the first sequence on virtual piano
    Then User listens to the melody

  @playVirtualPiano2 @regression
  Scenario: Play first sequence twice
    Given User navigates to the virtual piano app
    When User plays the first sequence twice on virtual piano
    Then User listens to the melody

  @playVirtualPiano3
  Scenario: Play second and first sequences
    Given User navigates to the virtual piano app
    When User plays the second and first sequence on virtual piano
    Then User listens to the melody

  @playVirtualPiano4 @regression
  Scenario: Play second and first sequences corrected
    Given User navigates to the virtual piano app
    When User plays the second and first sequence corrected on virtual piano
    Then User listens to the melody

  @playVirtualPiano5
  Scenario: Play virtual piano with clicks
    Given User navigates to the virtual piano app
    When User plays on virtual piano
    Then User listens to the melody