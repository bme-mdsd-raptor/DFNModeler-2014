package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

class PomGenerator {

	def static CharSequence compile(String projectName) '''	
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>�projectName�</groupId>
	<artifactId>�projectName�</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<build>
		<sourceDirectory>src</sourceDirectory>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.7</source>
					<target>1.7</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<repositories>
		<repository>
			<id>paho-mqtt-client</id>
			<name>Paho MQTT Client</name>
			<url>https://repo.eclipse.org/content/repositories/paho-releases/</url>
		</repository>
	</repositories>
	<dependencies>
		<dependency>
			<groupId>org.eclipse.paho</groupId>
			<artifactId>mqtt-client</artifactId>
			<packaging>jar</packaging>
			<version>0.4.0</version>
		</dependency>
	</dependencies>
</project>
	'''
}
