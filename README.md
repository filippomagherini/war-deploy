# Scaffold project for war deploy of a pring boot project




 1. Create a War file
  * Create Spring Boot Web App
  * extends SpringBootServletInitializer & override configure method
  * Update build configuration: war
  * Configure embedded servlet container dependency as provided
 2. Update build configuration
   * Update your build configuration: war (pom.xml)
   * Configure embedded servlet container dependency as provided
 
  
  ```
  .....
  <packaging>war</packaging>
  .....
   <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
   </dependency>
   
   ```
   
  3. Deploy War file on Tomcat
   * Build the project: maven clean install. Then go to target folder, we have a war file:
   * Copy the .war to apache-tomcat-8.5.13\webapps folder and rename it to javasampleapp.
   * Go to apache-tomcat-8.5.13\bin, then start: startup.bat(startup.sh)
   
   4. RUN the application within Eclise
    * You can Run the application within Eclise as a java application  `Run As --> Java Application--> main class`
    * You can run the applicaton on the local application server  `Run As --> Run on server --> seelct the project `
   
   

 Reference:
 https://stormpath.com/blog/tutorial-spring-boot-war-files
