import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by cher1 on 5/3/17.
 */
public class RetryAnalyzer implements IRetryAnalyzer{

    int counter = 0;
    int retryLimit = 1;


    public boolean retry(ITestResult iTestResult) {
        if(counter < retryLimit) {
            counter++;
            return true;
        }
        return false;
    }
}
