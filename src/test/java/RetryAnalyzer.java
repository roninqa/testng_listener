import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

    int counter = 0;
    int retryLimit = 1; // Starts at 0. It will retry 2 times


    public boolean retry(ITestResult iTestResult) {
        if(counter < retryLimit) {
            counter++;
            return true;
        }
        return false;
    }
}
