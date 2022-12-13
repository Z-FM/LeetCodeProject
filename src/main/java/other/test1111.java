package other;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class test1111 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        // 得到所有的脚本引擎工厂
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        // 这是Java SE 5 和Java SE 6的新For语句语法
        for (ScriptEngineFactory factory : factories) {
// 打印脚本信息
            System.out.printf("Name: %s%n" + "Version: %s%n" + "Language name: %s%n" + "Language version: %s%n" + "Extensions: %s%n" + "Mime types: %s%n" + "Names: %s%n",
                    factory.getEngineName(),
                    factory.getEngineVersion(),
                    factory.getLanguageName(),
                    factory.getLanguageVersion(),
                    factory.getExtensions(),
                    factory.getMimeTypes(),
                    factory.getNames());

        }
    }
}
