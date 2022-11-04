package com.amazon.tests;

import com.amazon.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestCase {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com.tr/");
        Thread.sleep(2000);
        System.out.println("driver.getTitle()="+driver.getTitle());

        String title="Google | ";

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(title)){
            System.out.println("Baslik bekledigi gibi geldi.Dogrulama gecti");
        }else {
            System.out.println("Baslik beklendigi gibi GELMEDI. Dogrulama GECMEDI");
        }

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(2000);
        System.out.println("driver.getTitle()="+driver.getTitle());

        String title1="Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        String actualTitle1= driver.getTitle();

        if (actualTitle1.equals(title1)){
            System.out.println("Baslik bekledigi gibi geldi.Dogrulama gecti");
        }else {
            System.out.println("Baslik beklendigi gibi GELMEDI. Dogrulama GECMEDI");
        }

        driver.navigate().back();
        Thread.sleep(2000);

        String title2=driver.getTitle();
        if (title.equals(title2)){
            System.out.println("Aynı");
        }else {
            System.out.println("Aynı değil");
        }

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();


        String title3=driver.getTitle();
        if (title1.equals(title3)){
            System.out.println("Aynı");
        }else {
            System.out.println("Aynı değil");
        }


    }

    }

