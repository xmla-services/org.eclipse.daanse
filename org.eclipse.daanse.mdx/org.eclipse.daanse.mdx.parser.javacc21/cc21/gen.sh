rm -rf ./src/gen/java
java -jar cc21/javacc-full.jar cc21/mdx.javacc -d ../src/gen/java -jdk17
