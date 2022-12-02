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

    static void init(){
        rs = new RunScript("src/main/resources/CommonAdaptor.js");
        rs.setVar("Logger", logger);
    }

    public static void main(String[] args) throws ScriptException, FileNotFoundException {
        init();
        StringBuilder script = new StringBuilder();
        script.append("var obj = new Object();");
        script.append("obj.process = function(name){return ( COM.Logger.info(\'logger.info.test:{}\',name);}");
        rs.start();
    }

}
