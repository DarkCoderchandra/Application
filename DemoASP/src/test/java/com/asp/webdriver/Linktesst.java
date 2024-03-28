package com.asp.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktesst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		
		driver.get("https://www.amazon.in/");
		
		
		
		driver.close();
		
		
	}

}
