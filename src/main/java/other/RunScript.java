package other;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class RunScript {
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine;
    private String fileName;

    public RunScript(String fileName) {
        engine = manager.getEngineByName("JavaScript");
        this.fileName = fileName;
    }

    /**
     * 设置变量
     *
     * @param varName
     * @param obj
     */
    public void setVar(String varName, Object obj) {
        engine.put(varName, obj);
    }

    /**
     * 启动脚本
     *
     * @throws FileNotFoundException
     * @throws ScriptException
     */
    public void start() throws FileNotFoundException, ScriptException {
        engine.eval(new FileReader(fileName));
    }

}
