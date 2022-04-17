package com.ornghooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.orng.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class My_Hook extends BaseClass{
	//@Before
	@Given("Login Page")
	public void login_page() {
	   browserLaunch();
	}
	
	@After
	public void tear_down() {
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("location" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()) + ".jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	}

