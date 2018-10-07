package com.myselenium.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myselenium.common.Constant;
import com.myselenium.common.ExcelUtils;
import com.myselenium.pom.Home_Page;
import com.myselenium.pom.LogIn_Page;

public class Apache_POI_TC {
	 
	private static WebDriver driver = null;

@Test(dataProvider="Authentication")
public void verify(String sUserName,String sPassword)throws Exception {

//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\javs\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get(Constant.URL);

driver.findElement(By.xpath(".//*[@id='account']/a")).click();

LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

System.out.println("Login Successfully, now it is the time to Log Off buddy.");

Home_Page.lnk_LogOut(driver).click(); 

driver.quit();

//This is to send the PASS value to the Excel sheet in the result column.

ExcelUtils.setCellData("Pass", 1, 3);

}

@DataProvider

public Object[][] Authentication() throws Exception{

     Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

     return (testObjArray);

	}

}
