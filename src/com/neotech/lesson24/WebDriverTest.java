package com.neotech.lesson24;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		//You cannot create an object of the interface
		//Camera c = new Camera();
		
		//Create a ChromeDriver object
		ChromeDriver ch = new ChromeDriver();
		ch.openBrowser();
		ch.closeBrowser();
		ch.maximizeWindow();
		ch.findElement();
		ch.takePicture();
		
		System.out.println("----------------------------------");
		
		//Create a FireFoxDriver object
		FirefoxDriver fd = new FirefoxDriver();
		fd.openBrowser();
		fd.closeBrowser();
		fd.maximizeWindow();
		fd.findElement();
		fd.takePicture();
		
		System.out.println("----------------------------------");
		
		//We created an object of ChromeDriver
		ChromeDriver cd = new ChromeDriver();
		
		//We are up-casting
		WebDriver wd = cd;
		
		wd.openBrowser();
		wd.closeBrowser();
		wd.maximizeWindow();
		wd.findElement();
		//wd.takePicture();
		
		//We are casting the object and store it as a camera
		Camera camera = (Camera) wd;
		camera.takePicture();
		
		System.out.println("*********************************");
		
		//This is a real example
		String browser = "Chrome";
		
		WebDriver driver;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		
		driver.openBrowser();
		driver.findElement();
		driver.closeBrowser();
	}

}
