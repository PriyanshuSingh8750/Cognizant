Feature: Searching and Filtering Web Development Courses

  Scenario: Filter Web Development Courses by Level and Language
    Given the user is on the homepage of the Coursera website
    When the user searches for web development courses
    And the user filters the courses for English language
    And the user filters the courses for beginners level
    And the user selects the first course displayed to take its title, rating, and duration
    And the user selects the second course displayed to take its title, rating, and duration
  
