rem ===== Cleaning directories
rmdir /S/Q dist-war
mkdir dist-war\WEB-INF\classes

rem ===== Compile classes
cd src
dir /s /B *.java > ../sources.txt
cd ..
javac -cp ./lib/* -d dist-war/WEB-INF/classes @sources.txt

rem ===== Copy configs and libs
xcopy /Y src\*.xml dist-war\WEB-INF\classes\
xcopy /Y src\*.properties dist-war\WEB-INF\classes\
xcopy /Y rest-servlet.xml dist-war\WEB-INF\
xcopy /Y web.xml dist-war\WEB-INF\
xcopy /Y lib dist-war\WEB-INF\lib\

rem ===== Create war
cd dist-war
jar cvf mytest.war *

pause
