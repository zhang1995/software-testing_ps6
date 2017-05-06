package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class MinAndMaxWebTestSuite {
	private static WebDriver wd;
	private WebElement we;
	private WebElement result;
	private String output;

	@BeforeClass
	public static void initialize() {
		/*System.setProperty("webdriver.gecko.driver", "C:/Users/tony zhang/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");*/
		wd = new FirefoxDriver();
		wd.get("file:///C:/Users/tony zhang/Desktop/EE 422C/problemset6/min.html");
	}

	@Test
	public void test0() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test1() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test2() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test3() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test4() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test5() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test6() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test7() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test8() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test9() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test10() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test11() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test12() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test13() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test14() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test15() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test16() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test17() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test18() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test19() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test20() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test21() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test22() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test23() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test24() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test25() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test26() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test27() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test28() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test29() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test30() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test31() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test32() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test33() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test34() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test35() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test36() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test37() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test38() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test39() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test40() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test41() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test42() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test43() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test44() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test45() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test46() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test47() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test48() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test49() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test50() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test51() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test52() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test53() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test54() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test55() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test56() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test57() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test58() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test59() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test60() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test61() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test62() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test63() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test64() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test65() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test66() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test67() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test68() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test69() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test70() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test71() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test72() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test73() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test74() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test75() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test76() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test77() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test78() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test79() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test80() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test81() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test82() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test83() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test84() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test85() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test86() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test87() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test88() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test89() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, -2, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test90() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test91() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test92() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test93() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, -2, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test94() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test95() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test96() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test97() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test98() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test99() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test100() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test101() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 0, -2) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test102() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test103() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test104() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test105() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test106() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test107() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test108() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test109() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 0, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test110() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test111() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test112() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test113() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test114() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test115() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test116() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test117() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 8, -2) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test118() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test119() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test120() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test121() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 8, 0) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test122() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test123() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test124() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test125() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(-2, 8, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test126() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test127() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test128() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test129() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test130() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test131() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test132() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test133() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test134() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test135() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test136() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test137() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test138() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test139() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test140() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test141() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test142() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test143() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test144() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test145() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test146() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test147() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test148() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test149() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, -2, -2) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test150() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test151() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test152() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test153() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, -2, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test154() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test155() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test156() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test157() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, -2, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test158() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test159() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test160() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test161() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test162() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test163() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test164() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test165() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 0, -2) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test166() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test167() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test168() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test169() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test170() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test171() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test172() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test173() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 0, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test174() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test175() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test176() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test177() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test178() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test179() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test180() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test181() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 8, -2) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test182() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test183() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test184() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test185() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 8, 0) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test186() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test187() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test188() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test189() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(0, 8, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test190() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test191() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test192() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test193() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test194() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test195() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test196() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test197() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test198() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test199() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test200() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test201() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test202() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test203() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test204() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test205() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test206() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test207() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test208() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test209() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test210() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test211() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test212() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test213() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, -2, -2) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test214() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test215() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test216() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test217() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, -2, 0) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test218() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test219() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test220() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test221() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, -2, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test222() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test223() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test224() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test225() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test226() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test227() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test228() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test229() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 0, -2) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test230() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test231() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test232() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test233() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 0, 0) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test234() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test235() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test236() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test237() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 0, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test238() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test239() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test240() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test241() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test242() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test243() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test244() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test245() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 8, -2) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test246() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test247() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test248() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test249() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 8, 0) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test250() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test251() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test252() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test253() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("max(8, 8, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test254() {
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test255() {
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@AfterClass
	public static void teardown() {
		wd.quit();
	}
}
