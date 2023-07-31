package org.August15;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendedRPT {
    public static void main(String[] args) {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("src/main/java/org/August15/Report.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        ExtentTest extentTest = extentReports.createTest("OneSteps");
        extentTest.fail("failedinfirststep");
        extentTest.pass("passInFirstSteps");
        extentReports.flush();
    }
}
