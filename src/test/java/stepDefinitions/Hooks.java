package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario(){
        System.out.println("I am in before scenario and @before hook");
    }

    @After
    public void afterScenario(){
        System.out.println("I am in after scenario and @After hook");
    }
}
