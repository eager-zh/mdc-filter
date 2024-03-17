# mdc-filter

This is a small POC to illustrate a discussion on StackOverflow question [Logback: using a ScopedValue inside a log message](https://stackoverflow.com/questions/78142173/logback-using-a-scopedvalue-inside-a-log-message).

To see a MDC-bound value in the console log, run Spring Boot `com.github.mdcfilter.MdcFilterApplication` and run a [request to a controller](http://localhost:8080/handle) in a browser.  