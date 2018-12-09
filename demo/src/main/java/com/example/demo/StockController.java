package com.example.demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@RequestMapping("/Scrape")
	public static ArrayList<String> main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1366,768");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://login.yahoo.com");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("seanscrap25");
        username.submit();
        
        WebElement element = (new WebDriverWait(driver, 5))
        		   .until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));
                
        WebElement password = driver.findElement(By.id("login-passwd"));
        password.sendKeys("Potatosalad33");
        password.sendKeys(Keys.ENTER);
        
        driver.get("https://finance.yahoo.com/portfolio/p_1/view/v1");
        
        WebElement element1 = (new WebDriverWait(driver, 5))
     		   .until(ExpectedConditions.elementToBeClickable(By.id("main")));
                
        WebElement table = driver.findElement(By.tagName("tbody"));
        
        ArrayList<String> stocks = new ArrayList<String>();
        
        for(WebElement row: table.findElements(By.tagName("tr"))) {
        	stocks.add(row.getText());
        }
        
        driver.quit();
       
        return stocks;       
        
        
    }
}
