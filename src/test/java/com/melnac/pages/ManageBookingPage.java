package com.melnac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageBookingPage extends BasePage {

    @FindBy(id="find-a-booking")
    public WebElement manageBookingButton;

    @FindBy(id="booking-reference-input")
   public WebElement bookingReferenceInputBox;


    @FindBy(id="booking-surname-input")
    public WebElement bookingSurnameInputBox;

}
