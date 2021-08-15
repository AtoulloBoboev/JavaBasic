package com.neotech.lesson25;

public interface WebDriver {
	
	void open();
	
	void close();
	
	String getTitle();
		
}

interface TakeScreenshot {
	void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenshot {
	void navigate();
	
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened!");
		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed!");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Screenshot taken in Chrome!");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to another page in Chrome!");
		
	}
}

class FirefoxDriver implements RemoteWebDriver {
	
	@Override
	public void open() {
		System.out.println("Firefox driver opened!");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed!");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Screenshot taken in Firefox!");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to another page in Firefox!");
		
	}
}

