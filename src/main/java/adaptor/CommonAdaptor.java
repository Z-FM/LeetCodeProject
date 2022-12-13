package adaptor;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import other.RunScript;

import javax.script.Invocable;
import javax.script.ScriptException;
import java.io.FileNotFoundException;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class CommonAdaptor {

    private static final Logger logger = LoggerFactory.getLogger(CommonAdaptor.class);

    private static RunScript rs;

    static void init() {
        rs = new RunScript("src/main/resources/CommonAdaptor.js");
        rs.setVar("common_log", logger);
    }

    public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
        init();
        StringBuilder script = new StringBuilder();
//        script.append("let obj = new Object();");
        script.append("function process(name){ COM.LOGGER.info(\'logger.info.test:{}\',name);}");
        rs.getScriptEngine().eval(script.toString());
        rs.start();
        Invocable inv = rs.getInvocable();
        Object o = inv.invokeFunction("process", "test function result");
        System.out.println(o);
    }

}
