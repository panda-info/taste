package org.tastedistribution.acceptancetests.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.tastedistribution.models.User;
import org.tastedistribution.services.HelloTeller;

public class HelloStepDefsTest {

    private User user;
    private String sayHelloResult;

    @Autowired
    private HelloTeller helloTeller;

    @Given("Whe have a user name {string}")
    public void wheHaveAUserName(String userName) {
        user = Mockito.when(Mockito.mock(User.class).getName()).thenReturn(userName).getMock();
    }

    @When("The user calls say hello")
    public void theUserCallsSayHello() {
        sayHelloResult = helloTeller.sayHello(user);
    }

    @Then("He gets {string}")
    public void heGets(String sayHelloResult) {
        Assertions.assertThat(this.sayHelloResult).isEqualTo(sayHelloResult);
    }
}
