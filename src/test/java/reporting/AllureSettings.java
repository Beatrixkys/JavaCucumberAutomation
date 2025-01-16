package reporting;
import io.qameta.allure.Allure;

public class AllureSettings {

    public static void logToReport(String message){
        Allure.step(message);
        System.out.println(message);
    }
}
