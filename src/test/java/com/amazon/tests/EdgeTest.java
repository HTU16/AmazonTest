package com.amazon.tests;

import com.amazon.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class EdgeTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(2000);

        driver.close();

    }
}
