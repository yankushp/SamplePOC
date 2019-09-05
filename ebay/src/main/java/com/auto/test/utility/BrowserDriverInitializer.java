package com.auto.test.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BrowserDriverInitializer{


    public  static WebDriver driver;
    private static String browser;
    private static final String chromePathMac = System.getProperty("user.dir") + "/src/test/resources/browser/chromedriver";
    private static final String chromePathWindows = System.getProperty("user.dir") + "/src/test/resources/browser/chromedriver.exe";
    private final String testConfig = System.getProperty("user.dir") + "/src/test/resources/config/systemConfig.properties";
    private static final String os = System.getProperty("os.name");
    //public static final String USERNAME = "yankush1";
    //public static final String AUTOMATE_KEY = "MMq2sWMNg8zXQ2ZhvuuS";
    public static final String USERNAME = "bigw1";
    public static final String AUTOMATE_KEY = "9JHXhHq3YgEYjDfcmjL3";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    private void getTestConfiguration() {
        Properties properties = new Properties();

        InputStream input = null;

        try {

            input = new FileInputStream(testConfig);

            // load a properties file
            properties.load(input);

            // get the property value and print it out
            browser = properties.getProperty("browser");


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public WebDriver initializeAndGetDriver() {
        String text = System.getProperty("user.dir");
        System.out.println("test of line :: " +text);


        if (driver == null) {
            getTestConfiguration();
            if (browser.equals("chrome")) {
                if (os.equals("Mac OS X")) {
                    System.setProperty("webdriver.chrome.driver", chromePathMac);
                } else {
                    System.setProperty("webdriver.chrome.driver", chromePathWindows);
                }

                if (driver == null) {
                    driver = new ChromeDriver();
                }
            } else if (browser.equals("firefox")) {

                if (driver == null) {
                    driver = new FirefoxDriver();
                }
            } else if (browser.equals("chromeheadless")) {
                if (browser.equals("chromeheadless")) {
                    if (os.equals("Mac OS X")) {
                        System.setProperty("webdriver.chrome.driver", chromePathMac);
                    } else {
                        System.setProperty("webdriver.chrome.driver", chromePathWindows);
                    }

                    if (driver == null) {
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("headless");

                        driver = new ChromeDriver(options);
                    }
                }
            }else if (browser.equals("gridChrome")) {
                if (browser.equals("gridChrome")) {
                    if (driver == null) {
                        DesiredCapabilities desCap = new DesiredCapabilities();
                        desCap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
                        desCap.setCapability(CapabilityType.PLATFORM, Platform.MAC);

                        String hubUrl = "http://localhost:4444/wd/hub";
                        try {
                            driver = new RemoteWebDriver(new URL(hubUrl),desCap);
                        }catch (MalformedURLException e){

                        }

                    }
                }
            }else if (browser.equals("browserstack")) {
                if (browser.equals("browserstack")) {
                    if (driver == null) {
                        DesiredCapabilities caps = new DesiredCapabilities();
                        caps.setCapability("browser", "Chrome");
                        caps.setCapability("browser_version", "62.0");
                        caps.setCapability("os", "Windows");
                        caps.setCapability("os_version", "10");
                        caps.setCapability("resolution", "1024x768");
                        caps.setCapability("name", "Bstack-[Java] Sample Test");

                        try {
                            driver = new RemoteWebDriver(new URL(URL), caps);
                        }catch (MalformedURLException e){

                        }

                    }
                }
            }
        }
        return driver;
    }

    public  static void  closeDriver(){
        driver.close();
        driver.quit();
        driver = null;
    }

}
