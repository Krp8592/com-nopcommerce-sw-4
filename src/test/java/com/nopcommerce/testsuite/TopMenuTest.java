package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    ElectronicsPage electronicsPage = new ElectronicsPage();
    // HomePage homePage = new HomePage();


    @Test
    public void verifyPageNavigation() {
        //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicsPage.selectMenu(menuName);
        //verify the page navigation.
        String actualMessage = electronicsPage.getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on");
    }
}
