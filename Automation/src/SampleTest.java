


import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTest {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://accounts.google.com/signin";

        driver.get(url);

       

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
		

	}

}

