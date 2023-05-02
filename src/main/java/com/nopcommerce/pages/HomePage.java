package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By computerTabOnTopMenu= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsTabOnTopMenu= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By thankYouText= By.xpath("//h1[normalize-space()='Thank you']");
    By continueButton= By.xpath("//button[normalize-space()='Continue']");
    By welcomeStoreText= By.xpath("//h2[normalize-space()='Welcome to our store']");
    By successfulText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By registerTab = By.xpath("//button[@class='button-1 register-button']");


    /**
     * click On Computer Tab
     */
    public void clickOnComputerTab(){
        clickOnElement(computerTabOnTopMenu);
    }

    /**
     * get Thank You Text
     * @return
     * @throws InterruptedException
     */
    public String getThankYouText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(thankYouText);
    }

    /**
     * get Successful Text
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successfulText);
    }

    /**
     * click On Continue
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * get Welcome Store Text
     * @return
     * @throws InterruptedException
     */
    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(welcomeStoreText);
    }

    /**
     * mouse Hover To Electronic Tab
     */
    public void mouseHoverToElectronicTab(){
        mouseHoverToElement(electronicsTabOnTopMenu);
    }

    /**+
     * mouseHover ToCell Phones AndC lick
     */
    public void mouseHoverToCellPhonesAndClick(){
        mouseHoverToElementAndClick(cellPhone);
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
}
