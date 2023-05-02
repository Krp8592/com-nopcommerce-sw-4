package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsTabText = By.xpath("//h1[normalize-space()='Electronics']");
    public String getElectronicsHeaderText(){
        return getTextFromElement(electronicsTabText);
    }

    /**
     * This method select menu on top menu
     * @param menu
     */
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}
