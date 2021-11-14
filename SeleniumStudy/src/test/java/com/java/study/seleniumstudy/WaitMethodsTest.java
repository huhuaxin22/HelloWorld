package com.java.study.seleniumstudy;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class WaitMethodsTest {

    static ChromeDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        driver.get("https://ceshiren.com/");
//        //隐式等待实现
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

//        //显示等待的准备工作：设置显示等待的超时时长。在后续测试用例中，单个调用了wait.until方法的webElement才会触发显示等待
//        wait = new WebDriverWait(driver,5);
    }

    @Test
    public void login(){

//        //显示等待第一种实现
//        WebElement webElement = wait.until(new ExpectedCondition<WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("search-button"));
//            }
//        });
//        webElement.click();
//        //显示等待第二种实现
//        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("search-button")));
//        webElement.click();

        driver.findElement(By.id("search-button")).click();

    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}
