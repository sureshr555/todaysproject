package com.selenium.baseclass;

import org.junit.After;
import org.junit.Before;



public class Hooks {
	@Before
    public void beforeScenario(){
        System.out.println("*************Before Scenario***********");
    }

	@After
    public void afterScenario(){
        System.out.println("############After Scenario##########");
    }
}
