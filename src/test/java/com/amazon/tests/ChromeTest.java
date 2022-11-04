package com.amazon.tests;

import com.amazon.utilities.Assertions;
import com.amazon.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeTest  {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(2000);

        driver.close();

    }
}
