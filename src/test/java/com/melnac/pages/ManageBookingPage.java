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

    @FindBy(xpath = "(//input[@readonly='readonly'])[3]")
    public WebElement arrivalDateInputBox;

    @FindBy(xpath = "(//img[@aria-label='Next Month'])[2]")
    public WebElement rightArrowButton;

    @FindBy(id="find-booking-form-button")
    public WebElement searchButton;

}
