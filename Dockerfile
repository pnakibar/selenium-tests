FROM selenium/standalone-firefox
COPY target/scala-2.11/selenium-tests-assembly-1.0.jar /home/
RUN java -jar /home/selenium-tests-assembly-1.0.jar


