dir /s /b src\com\intexsoft\malkevich\servlet
> dir /s /B *.java > sources.txt
> javac @sources.txt


javac -sourcepath ./src -cp ./lib/* -d dist src\com\intexsoft\malkevich\Runner.java


cd dist
java -cp .;../lib/* com.intexsoft.malkevich.Runner
pause

//выполнить на уровне с web-inf
jar cvf archiveName.war