package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {

	public static WebDriver driver;
	
	public static Actions ac;
	public static Robot r;
	public static JavascriptExecutor jr;
	public static Alert a;
	public static Select s;
	public static Scanner scan;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}

	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void dateAndTime() {
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void toMinimize() {
		driver.manage().window().minimize();
	}
	
	public static void sendKeys(WebElement ele, String s) {
		ele.sendKeys(s);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String togetText(WebElement ele) {
		String title = ele.getText();
		return title;
	}

	public static String togetAttribute(WebElement ele) {
		String title = ele.getAttribute("value");
		return title;
	}
	
	public static void moveToElement(WebElement ele) {
		ac = new Actions(driver);
		ac.moveToElement(ele).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();
	}

	public static void doubleClick(WebElement ele) {
		ac = new Actions(driver);
		ac.doubleClick(ele).perform();
	}

	public static void rightClick(WebElement ele) {
		ac = new Actions(driver);
		ac.contextClick(ele).perform();
	}

	public static void actionSendKeys(WebElement ele, String s) {
		ac = new Actions(driver);
		ac.sendKeys(ele, s).perform();
	}

	public static void actionClick(WebElement ele) {
		ac = new Actions(driver);
		ac.click(ele);
	}

	public static void modifierShift(WebElement ele, String s) {
		ac = new Actions(driver);
		ac.keyDown(ele, Keys.SHIFT).sendKeys(ele, s).keyUp(ele, Keys.SHIFT).build().perform();
	}

	public static void toCopy() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toPaste() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toCut() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toDown() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void toUp() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_UP);

		r.keyPress(KeyEvent.VK_UP);
	}

	public static void toEsc() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ESCAPE);

		r.keyPress(KeyEvent.VK_ESCAPE);
	}

	public static void toEnter() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void toSendKeysJavascript(int i, WebElement ele, String s) {
		jr = (JavascriptExecutor) driver;

		jr.executeScript("arguments[" + i + "].setAttribute('value','" + s + "')", ele);
	}

	public static String toGetAttributeJavascript(int i, WebElement ele) {
		jr = (JavascriptExecutor) driver;

		Object getValue = jr.executeScript("return arguments[" + i + "].getAttribute('value')", ele);
		String name = (String) getValue;
		return name;
	}

	public static void toClickJavascript(WebElement ele, int i) {
		jr = (JavascriptExecutor) driver;

		jr.executeScript("arguments[" + i + "].click()", ele);
	}

	public static void toScrollDown(WebElement ele, int i) {
		jr = (JavascriptExecutor) driver;

		jr.executeScript("arguments[" + i + "].scrollIntoView(true)", ele);
	}

	public static void toScrollUp(WebElement ele, int i) {
		jr = (JavascriptExecutor) driver;

		jr.executeScript("arguments[" + i + "].scrollIntoView(false)", ele);
	}

	public static void toTakeSnap(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;

		File screen = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(screen, dest);
	}

	public static void alertAccept() {
		a = driver.switchTo().alert();

		a.accept();
	}

	public static void alertDismiss() {
		a = driver.switchTo().alert();

		a.dismiss();
	}

	public static void alertSendKeys(String s) {
		a = driver.switchTo().alert();

		a.sendKeys(s);
	}

	public static String alertGetText(String s) {
		a = driver.switchTo().alert();

		String text = a.getText();
		return text;
	}

	public static List<WebElement> frameCount(String s) {
        List<WebElement> fe = driver.findElements(By.tagName(s));
        return fe;
        
	}
	
	public static void switchToFrameIntex(int i) {
		driver.switchTo().frame(i);
	}
	
	public static void switchToFrameString(String s) {
		driver.switchTo().frame(s);
	}
	
	public static void switchToFrameWebElement(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public static void htmlMainFrame() {
        driver.switchTo().defaultContent();
	}
	
	public static void parentFrame() {
        driver.switchTo().parentFrame();
	}
	
	public static void dropDownSelecByIndex(WebElement ele,int i) {
		s = new Select(ele);
		
		s.selectByIndex(i);
	}
	
	public static void dropDownSelecByValue(WebElement ele,String st) {
		s = new Select(ele);
		
		s.selectByValue(st);
	}
	
	public static void dropDownSelecByVisibleText(WebElement ele,String st) {
		s = new Select(ele);
		
		s.selectByValue(st);
	}
	
	public static void implicitWaits(long s) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	public static void unconditionalWaits(long s) throws InterruptedException {
        Thread.sleep(s);
	}
	
	public static String scannerInput() {
		scan = new Scanner(System.in);
		System.out.println("Enter the Value");
		String value = scan.nextLine();
		
		return value;
	}
	
	public static String readFromExcel(String fName,String shName,int rowNo,int cellNo,String dFormat) throws IOException {
        File fi = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\external\\"+fName+".xlsx");
        
        FileInputStream fin = new FileInputStream(fi);
        
        Workbook book = new XSSFWorkbook(fin);
        
        Sheet sh = book.getSheet(shName);
        
        Row r = sh.getRow(rowNo);
        
        Cell c = r.getCell(cellNo);
        
        int type = c.getCellType();
        
        String value;
        if(type==1) {
        	value = c.getStringCellValue();
        }
        else if (DateUtil.isCellDateFormatted(c)) {
        	Date d = c.getDateCellValue();
        	SimpleDateFormat sim = new SimpleDateFormat(dFormat);
        	value = sim.format(d);
		}
        else {
			double dou = c.getNumericCellValue();
			long l = (long)dou;
			value = String.valueOf(l);
		}
        return value;
	}
	
public static String toWriteTheExcel(String fName,String shName) throws IOException {
		
		File fi = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\external\\"+fName+".xlsx");
		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.createSheet(shName);
		
		scan = new Scanner(System.in);
		System.out.println("Enter the Number Rows.");
		int rows = scan.nextInt();
		
		System.out.println("Enter the Number Columns.");
		int cells = scan.nextInt();
		scan.nextLine();
		
		String value ="";
		for (int i = 0; i < rows; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < cells; j++) {
				Cell cell = row.createCell(j);
				System.out.println("Give the Value for Row Number "+i+"and Column Number"+j+".");
			    value = scan.nextLine();
				cell.setCellValue(value);
			}
		}
		
		FileOutputStream fin = new FileOutputStream(fi);
		book.write(fin);
		scan.close();
		return value;
	}
}

	



