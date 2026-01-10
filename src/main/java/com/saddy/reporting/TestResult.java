package com.saddy.reporting;


sealed public interface TestResult permits Passed, Failed, Skipped {}
