package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.ScriptException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

public class JavascriptTest {

  public static void main(String[] args) throws NoSuchMethodException, ScriptException, IOException {
    new JavascriptTest().testJS();
  }

  @Test
  @Disabled
  void testJS() throws ScriptException, IOException, NoSuchMethodException {
    Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/test.js"), StandardCharsets.UTF_8);
    Context cx = Context.enter();

    Scriptable scope = cx.initStandardObjects();
    cx.evaluateReader(scope, reader, "<cmd>", 1, null);

    Object fObj = scope.get("myFunction", scope);
    if (!(fObj instanceof Function)) {
      System.out.println("myFunction is undefined or not a function.");
    } else {
      Object functionArgs[] = { 2, 21 };
      Function f = (Function) fObj;
      Object result = f.call(cx, scope, scope, functionArgs);
      String report = Context.toString(result);
      System.out.println(report);
    }

  }
}
