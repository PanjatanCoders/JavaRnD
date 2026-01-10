package com.saddy;

import com.saddy.reporting.Failed;
import com.saddy.reporting.Passed;
import com.saddy.reporting.TestResult;
import com.saddy.research.TestReport;

public class ReportTest {
    static void main() {
        TestReport report = new TestReport();

        TestResult result = new Passed(1200);
        String res = report.report(result);
        IO.println("Result: " + res);
        IO.println("*".repeat(20));

        TestResult result2 = new Failed("link not working");
        String res2 = report.report(result2);
        IO.println("Result: " + res2);

    }
}
