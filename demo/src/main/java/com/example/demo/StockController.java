package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@RequestMapping("/")
	public static String main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("seanscrap25");
        username.submit();
        
        
                
        WebElement password = driver.findElement(By.id("login-passwd"));
        password.sendKeys("Potatosalad33");
        password.submit();
        
        driver.get("https://finance.yahoo.com/portfolio/p_1/view/v1");
        

        return "Page title is: " + driver.getTitle();        
    }
}
