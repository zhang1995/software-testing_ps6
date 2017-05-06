package pset6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MinWebTestGenerator {
	private static final String fileName = "C:/Users/tony zhang/Desktop/EE 422C/problemset6/src/pset6/MinWebTestSuite.java";

	public static void main(String[] a) {
		String suite = new MinWebTestGenerator().createTestSuite();
		/* output the test suite to the minwebtestsuite.java */
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName))) {
			bWriter.write(suite);
			bWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		// System.out.println(suite);

	}

	String createTestSuite() {
		StringBuilder sb = new StringBuilder();
		sb.append(packageDecl());
		sb.append("\n");
		sb.append(imports());
		sb.append("\n");
		sb.append(testsuite());
		return sb.toString();
	}

	String packageDecl() {
		return "package pset6;\n";
	}

	String imports() {
		return "import static org.junit.Assert.*;\n\n" + "import org.junit.Test;\n\n"
				+ "import org.openqa.selenium.By;\n" + "import org.openqa.selenium.WebDriver;\n"
				+ "import org.openqa.selenium.WebElement;\n" + "import org.openqa.selenium.firefox.FirefoxDriver;\n"
				+ "import org.junit.BeforeClass;\n" + "import org.junit.AfterClass;\n";
	}

	String testsuite() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class MinWebTestSuite {\n");
		// your code goes here
		sb.append(variableDecl());
		sb.append(beforeTest());

		//blocks
		String[] numBlocks = { "six", "-2", "0", "8" };
		String[] buttonBlocks = { "\t\twe.click();\n", "" };
		
		int test_count = 0;
		/* generate the test cases */
		for (String x : numBlocks) {
			for (String y : numBlocks) {
				for (String z : numBlocks) {
					for (String b : buttonBlocks) {
						sb.append("\t@Test\n");
						sb.append("\tpublic void test" + test_count + "() {\n");
						sb.append("\t\twe = wd.findElement(By.id(\"x\"));\n");
						sb.append("\t\twe.sendKeys(\""+ x +"\");\n");
						sb.append("\t\twe = wd.findElement(By.id(\"y\"));\n");
						sb.append("\t\twe.sendKeys(\""+ y +"\");\n");
						sb.append("\t\twe = wd.findElement(By.id(\"z\"));\n");
						sb.append("\t\twe.sendKeys(\""+ z +"\");\n");
						
						sb.append("\t\twe = wd.findElement(By.id(\"computeButton\"));\n");
						sb.append(b);
						
						sb.append("\t\tresult = wd.findElement(By.id(\"result\"));\n");
						sb.append("\t\toutput = result.getText();\n");
						
						if(x == "six" || y == "six" || z == "six" || b.length() == 0) {
							if(b.length() != 0) {
								String error = "Please enter integer values only!";
								sb.append("\t\tassertEquals(\""+ error +"\", output);\n");
								
							}
						} else {
								String minimun = Integer.toString(Math.min(Math.min(Integer.parseInt(x), Integer.parseInt(y)), Math.min(Integer.parseInt(y), Integer.parseInt(z))));
								
								sb.append("\t\tassertEquals(\"min("+ x + ", "+ y +", "+ z +") = " + minimun +"\", output);\n");
							
						}
						
						sb.append("\t\twd.navigate().refresh();\n");
						
						sb.append("\t}\n\n");
						
						test_count += 1;
					}
				}
			}

		}

		sb.append(afterTest());
		sb.append("}\n");
		return sb.toString();
	}
	// implement any helper methods that you need in this class

	String variableDecl() {

		return "\tprivate static WebDriver wd;\n" + "\tprivate WebElement we;\n" + "\tprivate WebElement result;\n"
				+ "\tprivate String output;\n\n";

	}

	String beforeTest() {

		return "\t@BeforeClass\n" + "\tpublic static void initialize() {\n"
				+ "\t\t/*System.setProperty(\"webdriver.gecko.driver\", \"C:/Users/tony zhang/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe\");*/\n"
				+ "\t\twd = new FirefoxDriver();\n"
				+ "\t\twd.get(\"file:///C:/Users/tony zhang/Desktop/EE 422C/problemset6/min.html\");\n"
				+ "\t}\n\n";

	}

	String afterTest() {
		return "\t@AfterClass\n" + "\tpublic static void teardown() {\n" + "\t\twd.quit();\n" + "\t}\n";

	}
}