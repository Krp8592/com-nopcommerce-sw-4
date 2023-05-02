package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By paymentInfoContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By selectMonth = By.xpath("//select[@id='ExpireMonth']");
    By selectYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By paymentTypeMessage = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodText = By.xpath("//span[normalize-space()='Next Day Air']");
    By totalPriceText = By.xpath("//span[@class='product-subtotal']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    /**
     * enter Firstname
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName,value);
    }

    /**
     * enter Lastname
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName,value);
    }

    /**
     * enter Email
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email,value);
    }

    /**
     * select Country
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country,value);
    }

    /**
     * enter City
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(city,value);
    }

    /**
     * enter Address1
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(address1,value);
    }

    /**
     * enter ZipCode
     * @param value
     * @throws InterruptedException
     */
    public void enterZipCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(zipCode,value);
    }

    /**
     * enter Phone Number
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(phoneNumber,value);
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
     * select Next DayAir
     * @throws InterruptedException
     */
    public void selectNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(nextDayAir);
    }

    /**
     * click On Shipping Continue
     * @throws InterruptedException
     */
    public void clickOnShippingContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shippingContinueButton);
    }

    /**
     * click On CreditCard
     * @throws InterruptedException
     */
    public void clickOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(creditCard);
    }

    /**
     * click On Payment Continue
     * @throws InterruptedException
     */
    public void clickOnPaymentContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(paymentContinueButton);
    }

    /**
     * select CreditCard Type
     * @param value
     * @throws InterruptedException
     */
    public void selectCreditCardType(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(creditCardType,value);
    }

    /**
     * enter Card Holder Name
     * @param value
     * @throws InterruptedException
     */
    public void enterCardHolderName(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardHolderName,value);
    }

    /**
     * enter CardNumber
     * @param value
     * @throws InterruptedException
     */
    public void enterCardNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardNumber,value);
    }

    /**
     * select Expiration Date
     * @param month
     * @param year
     * @throws InterruptedException
     */
    public void selectExpirationDate(String month,String year) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectMonth,month);
        selectByVisibleTextFromDropDown(selectYear,year);
    }

    /**
     * enter CardCode
     * @param value
     * @throws InterruptedException
     */
    public void enterCardCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardCode,value);
    }

    /**
     * get Payment Type Text
     * @return
     * @throws InterruptedException
     */
    public String getPaymentTypeText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(paymentTypeMessage);
    }

    /**
     * get Shipping Method Text
     * @return
     * @throws InterruptedException
     */
    public String getShippingMethodText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shippingMethodText);
    }

    /**
     * get Total PriceText
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(totalPriceText);
    }

    /**
     * click On Confirm
     * @throws InterruptedException
     */
    public void clickOnConfirm() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(confirmButton);
    }

    /**
     * click On Payment Info Continue
     * @throws InterruptedException
     */
    public void clickOnPaymentInfoContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(paymentInfoContinueButton);
    }
}
