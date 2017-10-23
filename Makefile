OKIO=okio-1.7.0.jar
OKHTTP=okhttp-2.5.0-test.jar

CLASSPATH=$(OKIO):$(OKHTTP)

build:
	javac -cp $(CLASSPATH) MyOkHttpTest.java
test:
	java -Xbootclasspath/p:$(HOME)/.m2/repository/org/mortbay/jetty/alpn/alpn-boot/8.1.11.v20170118/alpn-boot-8.1.11.v20170118.jar -Djavax.net.ssl.trustStore=/tmp/cacerts -cp .:$(CLASSPATH) MyOkHttpTest
