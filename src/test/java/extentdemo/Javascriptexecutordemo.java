package extentdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("chgfh");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		d.get("https://rightstartmath.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("document.querySelector('#search-3 > div > form > input.s.search-input').value='abc'");
		

	}

}
