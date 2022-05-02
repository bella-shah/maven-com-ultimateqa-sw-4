package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signinLink = By.xpath("//@href[@='/users/sign_in']");
    By welcomeText = By.xpath("page__heading");

    public void clickOnSignInLink(){
        clickOnElement(signinLink);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}
