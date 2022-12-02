package main.java.other;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.List;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class TestScriptEngine {

    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        //实现类是NashornScriptEngine
        ScriptEngine js = scriptEngineManager.getEngineByName("javascript");
        String str = "function add(a,b){return a+b;}";
        js.eval(str);
        Invocable js1 = (Invocable) js;
        Object add = js1.invokeFunction("add", new Object[]{1, 2});
        System.out.println(add);
        String jsCode = "var list=java.util.Arrays.asList(\" a\", \" b\")";
        //Strina isCode = "var list=iava.util.Arravs.asList("al".!"b)")"
        js.eval(jsCode);
        List<String> list = (List<String>) js.get("list");
        System.out.println(list);
    }

}
