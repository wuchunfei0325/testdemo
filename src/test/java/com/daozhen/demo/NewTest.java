package com.daozhen.demo;

import org.testng.annotations.Test;

import com.sun.jna.Native.ffi_callback;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.sql.Time;

import org.apache.bcel.generic.AALOAD;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test(enabled = false)
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.95.54.229/jeecms/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// 鼠标悬浮门户“未登录”
		WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		// 点击登录
		driver.findElement(By.xpath("//*[@id='userInfoMenu']/li/a")).click();
		// 进入到登录界面
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("360bda123");
		driver.findElement(By.xpath("//*[@id='login']/div[3]/input[3]")).click();
		Thread.sleep(3000);
		// 点击主动防控
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul[1]/li[1]/a")).click();

	}

	@Test
	public void ff() throws InterruptedException {
		Thread.sleep(15000);
		System.out.println("测试测试");
	}

	@Test
	public void fff() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test fffff");
	}
	
	@Test
	public void aa() throws InterruptedException{
		Thread.sleep(10000);
		System.out.println("aaaaaaa");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
