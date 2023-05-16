package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		prop = new Properties();
		String path = System.getProperty("user.dir") +
		"//src//test//resources//configFile//config.properties";
		FileInputStream fin;
		try {
			fin = new FileInputStream(path);
			prop = new Properties();
			prop.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initialize() {
		
	String strBrowser = prop.getProperty("browser");
	if (strBrowser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if (strBrowser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();	
		}	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));

}
	
	}

