Feature: Look at a neat gif (Example12.feature)


  ####################
  ## Neat Gif Tests ##
  ####################
  @Web @NeatGifTest
  Scenario: Looks at neat gif 4 (Example12.feature)
    Given the user navigates to Giphy
    And enters "Neat Shark" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage

  @Web @NeatGifTest
  Scenario: Looks at neat gif 5 (Example12.feature)
    Given the user navigates to Giphy
    And enters "Neat Panda" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage

  @Web @NeatGifTest
  Scenario: Looks at neat gif 6 (Example12.feature)
    Given the user navigates to Giphy
    And enters "Neat Bowie" text into "Search Input" on ExamplePage
    And clicks "Search" on ExamplePage
    And opens a Neat GIF
    Then waits 5s to verify "Neat Gif" is displayed on ExamplePage