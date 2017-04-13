# Spring Boot Hello World Example – JSP

A Spring Boot web application example, using embedded Tomcat + JSP template, and package as an executable WAR file.

Technologies used :

1. Spring Boot 1.4.2.RELEASE
2. Spring 4.3.7.RELEASE
3. Tomcat Embed 8.5.6
4. Maven 3
5. Java 8


Display project depdencies :

`mvn dependency:tree`

Start the Spring Boot web app.

`mvn spring-boot:run`

Access _http://localhost:8080_


Maven package the project as an executable WAR file. A 18M++ WAR file will be generated in the target folder.

`mvn clean package`

Run It, access _http://localhost:8080_ again.

`java -jar target/spring-boot-web-jsp-1.0.war`


#### JSP limitations

When running a Spring Boot application that uses an embedded servlet container (and is packaged as an executable archive), there are some limitations in the JSP support.

* With Tomcat it should work if you use war packaging, i.e. an executable war will work, and will also be deployable to a standard container (not limited to, but including Tomcat). An executable jar will not work because of a hard coded file pattern in Tomcat.
* With Jetty it should work if you use war packaging, i.e. an executable war will work, and will also be deployable to any standard container.
* Undertow does not support JSPs.
* Creating a custom error.jsp page won’t override the default view for error handling, custom error pages should be used instead.

There is a [JSP sample](https://github.com/spring-projects/spring-boot/tree/v1.5.2.RELEASE/spring-boot-samples/spring-boot-sample-web-jsp) so you can see how to set things up.


[Check this out](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html#boot-features-jsp-limitations)


