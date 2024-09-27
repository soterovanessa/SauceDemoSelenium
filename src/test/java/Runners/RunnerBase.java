package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class RunnerBase{
static WebDriver driver;


public static WebDriver getDriver() {

    if (driver == null){
        getDriverEdge();
    }
    return driver;
}

public static WebDriver getDriverEdge() {

    EdgeOptions options = new EdgeOptions();
    driver = new EdgeDriver(options);

    return driver;
}
}