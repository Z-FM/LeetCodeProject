//通过Java.type(),这个代码相当于Java代码的import导入类
// var myTestClass = Java.type("other.TestPrintFromJs");
// importClass(main.java.other.TestJsUseJavaMethod);
// var testmathod = new main.java.other.TestJsUseJavaMethod();
// var testClass = new myTestClass();
//有了Java类的原型，就可以调用类中的静态方法了
print(testClass.toString());
// print(testClass.methods);
// var testClass = new myTestClass();
var result = testClass.print("JS invoke");
print(result);
// create Java String array of 5 elements
// var a = java.lang.reflect.Array.newInstance(java.lang.String, 5);
//
// // Accessing elements and length access is by usual Java syntax
// a[0] = "scripting is great!";
// print(a.length);
// Import Java packages and classes
// like import package.*; in Java
// importPackage(java.awt);
// // like import java.awt.Frame in Java
// importClass(java.awt.Frame);
// // Create Java Objects by "new ClassName"
// var frame = new java.awt.Frame("hello");
// // Call Java public methods from script
// frame.setVisible(true);
// // Access "JavaBean" properties like "fields"
// print(frame.title);