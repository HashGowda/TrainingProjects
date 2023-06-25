package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomizeReport {

    //to customize report

    @Test
    public void customizeReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Customized Report.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Selenium Report");

        ExtentTest test = extent.createTest("Login Test").assignAuthor("Harish Gowda").assignCategory("Sanity").assignDevice("Chrome");
        test.pass("Login Test Started");
        test.info("Username Entered");
        test.info("Password Entered");
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("ball");
        list.add("camel");
        test.pass(MarkupHelper.createOrderedList(list));

        Map<String, String> map = new HashMap<>();
        map.put("Name","Harish");
        map.put("Place","Bengaluru");
        map.put("Gender","Male");
        test.pass(MarkupHelper.createOrderedList(map).getMarkup());
        test.pass("Login test completed");
        test.pass(MarkupHelper.createLabel("Login test completed", ExtentColor.GREEN));

        ExtentTest test1 = extent.createTest("Home Page Test").assignAuthor("Hash").assignCategory("Smoke").assignDevice("Firefox");
        test1.pass("Home Page Test Started");
        test1.info("Navigated to Home Page");
        test1.info("Validated Home Page");
        test1.fail("Home Page Test Failed");
        test1.fail(MarkupHelper.createLabel("Home Page Test Failed", ExtentColor.RED));

        extent.flush();

        //to open the report automatically by default browser

        Desktop.getDesktop().browse(new File("ExtentReport/CustomizedReport.html").toURI());
    }
}
