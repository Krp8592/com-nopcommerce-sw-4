package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By guestCheckout = By.xpath("//button[normalize-space()='Checkout as Guest']");

    /**
     * get Welcome Text
     * @return
     */
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
}
