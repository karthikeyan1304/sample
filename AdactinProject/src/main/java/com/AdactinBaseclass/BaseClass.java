package com.AdactinBaseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	
	//browserlaunch
	public static WebDriver browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
				
		}else if (value.equalsIgnoreCase("gecko")) {
			
		}else if (value.equalsIgnoreCase("edge")) {
			
		}
		driver.manage().window().maximize();
		return driver;
	}
	//urllaunch
	public static void launchUrl(String Value) {
		driver.get(Value);
		
	}
	//gettitle
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
	}
	//getURL
	public static void getUrL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	//navigateTo
	public static void navigateTo(String value) {
		driver.navigate().to(value);
	}
	//navigateback
	public static void navigateBack() {
		driver.navigate().back();
	}
	//navigateforward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	//referesh
	private void referesh() {
		driver.navigate().refresh();
	}
	//isEnabled
	public static void enableElement(WebElement element) {
		boolean enable = element.isEnabled();
		System.out.println(enable);	
	}
	//isDisplayed
	public static void displayElement(WebElement element) {
		boolean display = element.isDisplayed();
		System.out.println(display);
	}
	//isSelected
	public static void selectElement(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
	}
	//GetAttribute
	public static void getAttribute(WebElement element, String value) {
		String text = element.getAttribute(value);
		System.out.println(text);
	}
	
	//threadsleep
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	//Implicitywait
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//ExplicityWait
	public void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	//userinput
	public static void userInput(WebElement element, String Value) {
		element.sendKeys(Value);
	}
	
	//click
	public static void clickonElement(WebElement element) {
		element.click();
		}
	
	//clear
	public static void clearElement(WebElement element) {
		element.clear();
		}
	//select
	public static void selectCase(WebElement element, String value, String text) {
		Select sc = new Select(element);
		if (value.equalsIgnoreCase("index")) {
			int a = Integer.parseInt(text);
			sc.selectByIndex(a);
			
		}else if (value.equalsIgnoreCase("text")) {
			sc.selectByVisibleText(text);
			
		}else if (value.equalsIgnoreCase("value")) {
			sc.selectByValue(text);
		}		
		
	}
	//de-select
	public static void deselectCase(WebElement element, String value, String text) {
		Select sc = new Select(element);
		if (value.equalsIgnoreCase("text")) {
			sc.deselectAll();
			
		}else if (value.equalsIgnoreCase("index")) {
			int a = Integer.parseInt(text);
			sc.deselectByIndex(a);
			
		}else if (value.equalsIgnoreCase("text")) {
			sc.deselectByVisibleText(value);
			
		}else if (value.equalsIgnoreCase("value")) {
			sc.deselectByValue(value);
		}
	}
	//Robot
	public static void keyEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void downKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	//Actions
	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public static void ActionClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click().perform();
	}
	public static void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element);
	}
	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element);
	}
	public static void dragAndDrop(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop);
	}
	//Alert
	public static void alertAcept() {
		Alert ac = driver.switchTo().alert();
		ac.accept();
	}
	public static void alertDismiss() {
		Alert ac = driver.switchTo().alert();
		ac.dismiss();
	}
	public static void promptAlert(String value) {
		Alert ac = driver.switchTo().alert();
		ac.getText();
		ac.sendKeys(value);
		ac.accept();
	}
	//Frames
	public static void singleFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}
	//Windowshandling
	public static void singleWindow() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	public static void multipleWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
		}

	}
	//javaScript Excecuter
	public static void scrollIntoView( WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void JSSendkey(WebElement element, String strValue) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("arguments[0].value=arguments[1]", element, strValue);
		//element.sendKeys(strValue);
}

   public static void JSclick(WebElement element) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	
}
	//TakesScreenshot
	
	public static void TakesScreenshot() throws IOException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String format = sdf.format(date);
		String picture = format.replaceAll("[^0-9]", "");
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinProject\\Screenshots\\"+picture+".png");
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, des);

	}
	
	//workbook reader
	
	public static void Testdatadriven(String value, int row, int cell) throws Throwable {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinProject\\target\\Adactin.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet(value);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType cellType = c.getCellType();
		String value1 =null;
		if (cellType.equals(cellType.STRING)) {
			value = c.getStringCellValue();
			
		}else if (cellType.equals(cellType.NUMERIC)) {
			double v = c.getNumericCellValue();
			value = String.valueOf((int)v);
			
			
		}
				

	}
	//Getdata
	public static void getData() throws Throwable {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinProject\\target\\Adactin.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		
		
		int rowsize = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row2 = s.getRow(i);
			int cellsize = row2.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				row2.getCell(j);
				CellType cellType = c.getCellType();
				String value1 =null;
				if (cellType.equals(cellType.STRING)) {
					value1 = c.getStringCellValue();
					
				}else if (cellType.equals(cellType.NUMERIC)) {
					double v = c.getNumericCellValue();
					value1 = String.valueOf((int)v);
				
			}
			
		}
		

	}


	}
}
	
	
	
	
	
	
	

