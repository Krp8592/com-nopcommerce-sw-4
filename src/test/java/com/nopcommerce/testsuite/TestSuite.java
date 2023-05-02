package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    LoginPage loginPage = new LoginPage();

    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //Click on Computer Menu
        homePage.clickOnComputerTab();
        //Click on Desktop
        computersPage.clickOnDesktop();
        //Verify the Product will arrange in Descending order.
        String actualOrder = computersPage.sortDesktopByPositionZtoA().toString();
        String ExceptedOrder = computersPage.getAllProductNamesAfterShorting().toString();
        Assert.assertTrue(ExceptedOrder.contains(actualOrder));

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        String expectedMessage = "Build your own computer";
        //Click on Computer Menu.
        homePage.clickOnComputerTab();
        //Click on Desktop
        computersPage.clickOnDesktop();
        //Select Sort By position "Name: A to Z"
        computersPage.selectValueFromShortingDropDown("Name: A to Z");
        //Click on "Add To Cart"
        computersPage.clickAddtoCartByProductName("Build your own computer");
        //Verify the Text "Build your own computer"
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on add to card");
        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        //Select "8GB [+$60.00]" using Select class
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        //Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectHDD("400 GB [+$100.00]");
        //Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOs("Vista Premium");
        //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectMicrosoftOfficeSoftwareOption();
        buildYourOwnComputerPage.selectTotalCommanderSoftwareOption();
        //Verify the price "$1,475.00"
        expectedMessage = "$1,475.00";
        actualMessage = buildYourOwnComputerPage.getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Wrong Configuration");
        //Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddtoCart();
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        expectedMessage = "The product has been added to your shopping cart";
        actualMessage = buildYourOwnComputerPage.getSuccessfullAddedToCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not added in cart");
        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.closeNotificationBar();
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverToShoppingCartAndClickOnCart();
        //Verify the message "Shopping cart"
        expectedMessage = "Shopping cart";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on cart");
        //Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeValueOfQuantity("2");
        shoppingCartPage.updateShoppingCart();
        //Verify the Total"$2,950.00
        expectedMessage = "$2,950.00";
        actualMessage = shoppingCartPage.getPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Price not Updated");
        //click on checkbox “I agree with the terms of service”
        shoppingCartPage.selectTermsAndCondition();
        //Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //Verify the Text “Welcome, Please Sign In!”
        expectedMessage = "Welcome, Please Sign In!";
        actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.clickOnGuestCheckout();
        //Fill the all mandatory field
        checkOutPage.enterFirstname("Prime");
        checkOutPage.enterLastname("Testing");
        checkOutPage.enterEmail("primetesting@gmail.com");
        checkOutPage.selectCountry("India");
        checkOutPage.enterCity("Mehsana");
        checkOutPage.enterAddress1("Tintodan");
        checkOutPage.enterZipCode("382865");
        checkOutPage.enterPhoneNumber("9898989898");
        checkOutPage.clickOnContinue();
        checkOutPage.selectNextDayAir();
        checkOutPage.clickOnShippingContinue();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinue();
        checkOutPage.selectCreditCardType("Master card");
        checkOutPage.enterCardHolderName("Prime testing");
        checkOutPage.enterCardNumber("5573615091331588");
        checkOutPage.selectExpirationDate("05", "2025");
        checkOutPage.enterCardCode("123");
        checkOutPage.clickOnPaymentInfoContinue();
        //Click on “CONTINUE”
        //Verify “Payment Method” is “Credit Card”
        expectedMessage = "Credit Card";
        actualMessage = checkOutPage.getPaymentTypeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        //Verify “Shipping Method” is “Next Day Air”
        expectedMessage = "Next Day Air";
        actualMessage = checkOutPage.getShippingMethodText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        //Verify Total is “$2,950.00”
        expectedMessage = "$2,950.00";
        actualMessage = checkOutPage.getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        //Click on “CONFIRM”
        checkOutPage.clickOnConfirm();
        //Verify the Text “Thank You”
        expectedMessage = "Thank you";
        actualMessage = homePage.getThankYouText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        //Verify the message “Your order has been successfully processed!”
        expectedMessage = "Your order has been successfully processed!";
        actualMessage = homePage.getSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
        homePage.clickOnContinue();
        //Verify the text “Welcome to our store”
        expectedMessage = "Welcome to our store";
        actualMessage = homePage.getWelcomeStoreText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");

    }

}
