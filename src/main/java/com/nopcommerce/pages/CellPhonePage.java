package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By cellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By ProductName = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By PriceName = By.xpath("//div[@class='product-price']//span[normalize-space()='$349.00']");
    By listView = By.xpath("//a[normalize-space()='List']");
    By updateQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");

    /**
     * get Cell Phone Text
     * @return
     * @throws InterruptedException
     */
    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon(){
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     * @param phone
     * @throws InterruptedException
     */
    public void selectPhoneFromList(String phone) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'"+phone+"')]"));
    }

    /**
     * get Product NameText
     * @return
     * @throws InterruptedException
     */
    public String getProductNameText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(ProductName);
    }

    /**
     * get PriceText
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(PriceName);
    }

    /**
     * update Quantity
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(updateQuantity,value);
    }

    /**
     * click On Add ToCart
     * @throws InterruptedException
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCart);
    }

    /**
     * get Successfull Added To CartText
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(closeNotificationBar);
    }
}
