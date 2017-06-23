import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

    int counter = 0;
    int retryLimit = 1; // Starts at 0. It will retry 2 times


    public boolean retry(ITestResult iTestResult) {
        // Get the throwable message
        Throwable cause = iTestResult.getThrowable();

        // If assertion failure, then do not retry
        if(cause.fillInStackTrace().toString().contains("Assert")) {
            return false;
        } else if (counter < retryLimit){ // Anything other issues it will retry
            counter++;
            return true;
        }

        return false;
    }
}
