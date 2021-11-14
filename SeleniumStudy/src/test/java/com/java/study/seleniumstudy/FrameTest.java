package com.java.study.seleniumstudy;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameTest {

    @BeforeAll
    public static void initData(){
       ChromeDriver driver = new ChromeDriver();
        driver.get("");

    }
}
