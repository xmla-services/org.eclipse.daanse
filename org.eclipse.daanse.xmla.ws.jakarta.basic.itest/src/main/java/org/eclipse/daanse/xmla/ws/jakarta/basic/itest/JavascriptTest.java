package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.junit.jupiter.api.Test;

public class JavascriptTest {

	
	public static void main(String[] args) throws NoSuchMethodException, ScriptException, IOException {
		new JavascriptTest().testJS();
	}
	@Test
	void testJS() throws ScriptException, IOException, NoSuchMethodException {

		ScriptEngineManager manager = new ScriptEngineManager();
		manager.getEngineFactories().forEach(System.out::println);
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		// read script file
		engine.eval(Files.newBufferedReader(Paths.get(
				"/home/stbischof/dev/git/org.eclipse.daanse.xmla/org.eclipse.daanse.xmla.ws.jakarta.basic.itest/src/main/resources/test.js"),
				StandardCharsets.UTF_8));

		Invocable inv = (Invocable) engine;
		// call function from script file
		inv.invokeFunction("myFunction", 2, 3);
	}
}
