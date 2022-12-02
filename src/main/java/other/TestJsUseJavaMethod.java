package main.java.other;

import org.apache.commons.io.IOUtils;
import other.TestPrintFromJs;

import javax.script.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class TestJsUseJavaMethod {

    public static void main(String[] args) {
//获取脚本引擎管理器
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        List<ScriptEngineFactory> engineFactories = scriptEngineManager.getEngineFactories();
        //获取指定脚本的引擎管理器
        ScriptEngine js = scriptEngineManager.getEngineByName("JavaScript");
        js.put("testClass", new TestPrintFromJs());
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/test.js");
            String data = IOUtils.toString(fis, "UTF-8");
            //执行脚本
            js.eval(data);
            if (js instanceof Invocable) {
                //将脚本引擎转换Invocable
                Invocable invocable = (Invocable) js;
                // 将js代码转换为该接口的实现，Method是自定义的接口，用来存放加密算法
                main.java.other.Methods executeMethod = invocable.getInterface(main.java.other.Methods.class);
                // 执行指定的js方法
                String result = executeMethod.encodeInp(data);
                System.out.println(result);
            }
        } catch (ScriptException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String testPrint(String name) {
        System.out.format("this is java code , %s" + name);
        return "thank you";
    }

    private static File readFilePath(String filePath) {
        File file = new File(filePath);
        return file;
    }

}
