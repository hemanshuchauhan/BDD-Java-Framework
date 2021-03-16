# BDD-Java-Framework

*Example*

```gherkin
    Given I am a JSON API consumer
      And I am executing test "RSJ2"
     When I request GET "/json/users"
     Then I should get a status code of 200
      And the response value of "users[0].email" should equal "Sincere@april.biz"
      And the response value of "users[0].address.city" should not equal "Boston"
```