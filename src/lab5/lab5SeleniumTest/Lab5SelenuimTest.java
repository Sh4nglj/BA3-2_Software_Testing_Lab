package lab5.lab5SeleniumTest;
//package lab5.Lab5OnceTest;// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.*;
import java.util.*;

@RunWith(Parameterized.class)

public class Lab5SelenuimTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    private String[] datas;


    public Lab5SelenuimTest(String data) {
        this.datas = data.split(",");
    }

    @Parameterized.Parameters
    public static List<String> parameters() throws IOException {
        String filename = "src\\lab5\\lab5SeleniumTest\\user_info.csv";
        ArrayList<String> result =  new ArrayList<>(readLines(filename));
        result.remove(0);
        return result;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void lab5once() {
        driver.get("http://118.178.137.170:8080/");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(datas[1]);
        driver.findElement(By.cssSelector(".btn")).click();
        assertThat(driver.findElement(By.cssSelector("td:nth-child(3)")).getText(), is(datas[0]));
        driver.close();
    }

    public static List<String> readLines(String fsrc) throws IOException {

        try (InputStream in = new FileInputStream(fsrc);
             Reader reader = new InputStreamReader(in, "UTF-8");
             LineNumberReader lineReader = new LineNumberReader(reader);) {
            String line = lineReader.readLine();
            List<String> lines = new ArrayList<String>();
            while (line != null) {
                lines.add(line);
                line = lineReader.readLine();
            }
            return lines;
        }
    }
}
