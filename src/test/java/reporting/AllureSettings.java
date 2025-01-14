package reporting;

import io.qameta.allure.model.TestResult;

public class AllureSettings {

    public void logToReport(String message){
        Allure.step(message);
        System.out.println(message);
    }
}
