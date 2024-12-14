Feature: verifying OMRBranch Hotel Login Automation

  Scenario Outline: verifying login with valid credentials
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>"
    Then user Should verify success message after Login "Welcome Sugumar"

    Examples: 
      | userName          | password    |
      | sugubsk@gmail.com | Greens@2020 |

  Scenario Outline: verifying login with valid credentials using ENTER Key
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>" with Enter Key
    Then user Should verify success message after Login "Welcome Sugumar"

    Examples: 
      | userName          | password    |
      | sugubsk@gmail.com | Greens@2020 |

  Scenario Outline: verifying login with Invalid credentials
    Given user is on the OMRBranch Hotel Page
    When user Login "<userName>","<password>" with Enter Key
    Then user Should verify error  message after Login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | userName          | password    |
      | sugubsk@gmail.com | Greens@2022 |
