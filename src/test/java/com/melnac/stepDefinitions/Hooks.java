package com.melnac.stepDefinitions;

import com.melnac.utilities.ConfigurationReader;
import com.melnac.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setupScenarioForLogins(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @After
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }


}
