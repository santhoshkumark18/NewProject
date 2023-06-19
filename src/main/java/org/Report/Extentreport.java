package org.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
    public static void main(String[] args) {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html"); //blank html template
        ExtentReports extentReports= new ExtentReports(); //actual report
        extentReports.attachReporter(reporter); //attaching a report
        ExtentTest test = extentReports.createTest("TC001-Search Product");//TestPageLanch Cases
        test.log(Status.FAIL,"Enter the product");
        test.pass("Enter the string");
        test.pass("Enter the value");
        test.fail("Enter the passwd", MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());//TestPageLanch steps

        extentReports.createTest("TC002-name product");
        test.pass("Enter the product");
        test.pass("Enter the string");
        test.pass("Enter the value");
        extentReports.flush();  ///Save the report
    }
}
