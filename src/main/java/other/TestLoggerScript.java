package other;

import java.util.logging.Logger;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class TestLoggerScript {
    public static void main(String[] args) throws Exception {
        RunScript rs = new RunScript("src/main/resources/testLogger.js");
        rs.setVar("Logger", Logger.getLogger(String.valueOf(TestLoggerScript.class)));
        rs.start();
    }
}
