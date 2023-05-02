package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By priceText = By.xpath("//span[@class='value-summary']//strong");
    By quantity = By.xpath("//input[contains(@id,'itemquantity')]");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By shopingCart =By.xpath("//span[@class='cart-label']");
    By goToCart =By.xpath("//button[normalize-space()='Go to cart']");
    By quantityValue =By.xpath("//input[contains(@id,'itemquantity')]");

    /**
     * get Shopping CartText
     * @return
     * @throws InterruptedException
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get PriceText
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    /**
     * change Value Of Quantity
     * @param value
     * @throws InterruptedException
     */
    public void changeValueOfQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(quantity,value);
    }

    /**
     * update Shopping Cart
     * @throws InterruptedException
     */
    public void updateShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(updateShoppingCart);
    }

    /**
     * select Terms And Condition
     * @throws InterruptedException
     */
    public void selectTermsAndCondition() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(termsAndCondition);
    }

    /**
     * click On CheckOut
     * @throws InterruptedException
     */
    public void clickOnCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }

    /**
     * mouse Hover To Shopping Card
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCard() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(shopingCart);
    }

    /**
     * mouse Hover To GoTo Card And Click
     * @throws InterruptedException
     */
    public void mouseHoverToGoToCardAndClick() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * get Number Of Quantity Value
     * @return
     * @throws InterruptedException
     */
    public String getNumberOfQuantityValue() throws InterruptedException {
        Thread.sleep(1000);
        return getAttributeValueFromElement(quantityValue);
    }

}
