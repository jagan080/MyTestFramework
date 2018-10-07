package com.myselenium.modules;

import org.openqa.selenium.WebDriver;

import com.myselenium.common.ExcelUtils;
import com.myselenium.pom.Home_Page;
import com.myselenium.pom.LogIn_Page;

//Now this method does not need any arguments

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception{

		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);

		Home_Page.lnk_MyAccount(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

		LogIn_Page.btn_LogIn(driver).click();

    }

}