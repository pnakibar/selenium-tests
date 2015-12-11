FROM selenium/standalone-firefox
MAINTAINER Pedro Nakibar <pedro.nakibar@xdevel.com>

COPY target/scala-2.11/selenium-tests-assembly-1.0.jar /home/

RUN xvfb-run java -jar /home/selenium-tests-assembly-1.0.jar
