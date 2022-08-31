package com.melnac.pages;

import com.melnac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id="find-a-booking")
    public WebElement manageBookingButton;


}
