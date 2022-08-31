package com.melnac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends BasePage {

    @FindBy(id="booking-reference-input")
   public WebElement bookingReferenceInputBox;


    @FindBy(id="booking-surname-input")
    public WebElement bookingSurnameInputBox;

}
