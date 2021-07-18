Feature: Look at a neat gif (Example1.feature)


  ####################
  ## Neat Gif Tests ##
  ####################
  @Web @NeatGifTest
  Scenario: Looks at neat gif 1 (Example1.feature)
    Given the user navigates to Giphy
    And enters "Neat Keanu Reeves" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage

  @Web @NeatGifTest
  Scenario: Looks at neat gif 2 (Example1.feature)
    Given the user navigates to Giphy
    And enters "Neat Kangaroo" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage

  @Web @NeatGifTest
  Scenario: Looks at neat gif 3 (Example1.feature)
    Given the user navigates to Giphy
    And enters "Neat Blondie" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage