package com.saddy.research;

import com.saddy.reporting.Failed;
import com.saddy.reporting.Passed;
import com.saddy.reporting.Skipped;
import com.saddy.reporting.TestResult;

public class TestReport {
    public String report (TestResult result) {
        return switch (result) {
            case Passed p -> "Passed in: " + p.durationMs() + "ms";
            case Failed e -> "Failed: " + e.reason();
            case Skipped s -> "Skipped: " + s.cause();
        };
    }
}
