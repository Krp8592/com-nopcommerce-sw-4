package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class ElectronicsTest extends BaseTest {

    String email;
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    LoginPage loginPage = new LoginPage();

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //Mouse Hover on “Electronics”Tab
        homePage.mouseHoverToElectronicTab();
        //Mouse Hover on “Cell phones” and click
        homePage.mouseHoverToCellPhonesAndClick();
        //Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";
        //Mouse Hover on “Electronics” Tab
        homePage.mouseHoverToElectronicTab();
        //Mouse Hover on “Cell phones” and click
        homePage.mouseHoverToCellPhonesAndClick();
        //Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //Click on List View Tab
        cellPhonePage.clickOnListViewIcon();
        //Click on product name “Nokia Lumia 1020” link
        cellPhonePage.selectPhoneFromList("Nokia Lumia 1020");
        //Verify the text “Nokia Lumia 1020”
        expectedMessage = "Nokia Lumia 1020";
        actualMessage = cellPhonePage.getProductNameText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //Verify the price “$349.00”
        expectedMessage = "$349.00";
        actualMessage = cellPhonePage.getPriceText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //Change quantity to 2
        cellPhonePage.updateQuantity("2");
        //Click on “ADD TO CART” tab
        cellPhonePage.clickOnAddToCart();
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        expectedMessage = "The product has been added to your shopping cart";
        actualMessage = cellPhonePage.getSuccessfullAddedToCartText();
        Assert.assertEquals(actualMessage, expectedMessage);
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        cellPhonePage.closeNotificationBar();
        shoppingCartPage.mouseHoverToShoppingCard();
        shoppingCartPage.mouseHoverToGoToCardAndClick();
        //Verify the message "Shopping cart"
        expectedMessage = "Shopping cart";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualMessage, expectedMessage);
        //Verify the quantity is 2
        expectedMessage = "2";
        actualMessage = shoppingCartPage.getNumberOfQuantityValue();
        Assert.assertEquals(actualMessage, expectedMessage);
        //Verify the Total $698.00
        expectedMessage = "$698.00";
        actualMessage = shoppingCartPage.getPriceText();
        Assert.assertEquals(actualMessage, expectedMessage);
        //click on checkbox “I agree with the terms of service”
        shoppingCartPage.selectTermsAndCondition();
        //Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //Verify the Text “Welcome, Please Sign In!”
        expectedMessage = "Welcome, Please Sign In!";
        actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //Click on “REGISTER” tab
        homePage.clickOnRegisterTab();
        //Fill the mandatory fields
        registerPage.enterFirstname("Prime");
        registerPage.enterLastname("Testing");
        registerPage.enterEmail(email);
        registerPage.enterPassword("Admin@123");
        registerPage.enterConfirmPassword("Admin@123");
        //Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //Verify the message “Your registration completed”
        expectedMessage = "Your registration completed";
        actualMessage = registerPage.getRegistrationCompletedText();
        Assert.assertEquals(expectedMessage, actualMessage);

        System.out.println("-----------------Fail because of bug--------------------------");
        System.out.println("=================================================================");
        System.out.println("-----------------Shopping cart is getting empty--------------------------");

    }
}
