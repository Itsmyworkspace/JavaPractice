1. Introduction to Spring Boot
    1. What is Spring Boot, and how is it different from the traditional Spring Framework?
        Focus on how Spring Boot simplifies dependency management, configuration, and setup 
        of Spring-based applications with embedded servers and default configurations.
    2. What are the advantages of using Spring Boot?
       Auto-configuration, embedded servers (like Tomcat, Jetty), production-ready features 
      (health checks, metrics), opinionated defaults, etc.
    3. What is the difference between Spring and Spring Boot?      

2. Spring Boot Features
    1. What is the purpose of the @SpringBootApplication annotation?
        Explain that it's a combination of three annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan.
    2. What is Spring Boot's auto-configuration feature? How does it work?
       Mention the role of @EnableAutoConfiguration, how Spring Boot scans classpath dependencies, and auto-configures the application context accordingly.
    3. What are starters in Spring Boot?
       Explain that Spring Boot starters are a set of convenient dependency descriptors you can include in your application, which automatically pull in all the required dependencies for a particular feature (e.g., spring-boot-starter-web, spring-boot-starter-data-jpa).
    4. What is the role of an embedded server in Spring Boot?
       Spring Boot includes embedded servers like Tomcat or Jetty to run the application directly without the need to deploy it to an external server.
3. Spring Boot Annotations
    1. What is the use of @RestController in Spring Boot? 
       Explain that @RestController is a combination of @Controller and @ResponseBody, making it easier to build RESTful web services.
    2. What is the difference between @Component, @Service, and @Repository annotations? 
       All are used for bean registration but serve different roles. @Repository is typically used in the persistence layer, @Service in the service layer, and @Component is a general-purpose stereotype.
    3. What is the use of @SpringBootTest? 
       It is used to test Spring Boot applications by loading the full application context.
    4. What is the purpose of @ConfigurationProperties annotation? 
       Used for binding external configuration properties (e.g., from .properties or .yaml files) to a Java object.
4. Spring Boot Configuration
    1. How do you configure properties in Spring Boot?
      Discuss how properties are configured using application.properties or application.yml. Additionally, mention the use of profiles (e.g., application-dev.properties for different environments).
    2. What is the difference between application.properties and application.yml in Spring Boot?
    3. How do you create and use custom application properties?
      Explain how to define custom properties in application.properties or application.yml and inject them using @Value or @ConfigurationProperties.
    4. What are profiles in Spring Boot, and how do you define them? 
      Spring profiles allow you to define different configurations for different environments (e.g., dev, prod). Discuss @Profile annotation and profile-specific configuration files (e.g., application-dev.properties).
5. Dependency Injection and Beans
    1. What is dependency injection in Spring Boot? How does Spring Boot manage beans?
       Describe how Spring Boot uses dependency injection to manage the lifecycle of beans, and how beans are created, managed, and injected via annotations like @Autowired.
    2. How does Spring Boot handle component scanning?
       Spring Boot automatically scans components in the package where the main class resides (@SpringBootApplication triggers @ComponentScan).
    3. What is the difference between @Autowired and @Inject annotations?

6. Spring Boot Data Access
    1. What is Spring Data JPA in Spring Boot?
       Spring Data JPA provides a higher-level abstraction over JPA, reducing boilerplate code with repositories like CrudRepository, JpaRepository.
    2. What is the purpose of @Entity, @Id, and @GeneratedValue annotations in Spring Boot?
      These are used for mapping entities to a database in JPA. @Entity marks a class as an entity, @Id marks the primary key, and @GeneratedValue allows the database to generate the ID automatically.
    3. What is a Spring Boot Repository?
      Explain the role of repositories such as JpaRepository and CrudRepository, and how Spring Boot makes data access easier through automatic query generation.
    4. How do you implement pagination and sorting in Spring Boot?

7. RESTful Web Services and APIs
    1. How do you create a RESTful web service using Spring Boot? 
      Discuss using @RestController, @RequestMapping, and how to handle HTTP methods like GET, POST, PUT, and DELETE.
    2. What is the difference between @RequestBody and @ResponseBody? 
      @RequestBody binds the request body to a Java object, while @ResponseBody converts the Java object into the response body (JSON/XML).
    3. What is @PathVariable and @RequestParam? 
      @PathVariable is used to extract values from the URI, while @RequestParam extracts query parameters from the URL.
    4. How do you handle exceptions in Spring Boot?
       Mention @ControllerAdvice and @ExceptionHandler for global exception handling.
8. Spring Boot Security
    1. How do you secure a Spring Boot application? 
      Spring Boot integrates easily with Spring Security. Explain how to add security by configuring spring-boot-starter-security and using annotations like @EnableWebSecurity and @PreAuthorize.
    2. What is OAuth2, and how is it implemented in Spring Boot?
    3. What are the different ways to authenticate users in Spring Boot applications?

9. Spring Boot Actuator
    1. What is Spring Boot Actuator, and what is it used for? 
       Actuator provides production-ready features such as health monitoring, metrics, auditing, and environment information out of the box.
    2. How do you enable Actuator in Spring Boot? 
       By adding spring-boot-starter-actuator to the dependencies and configuring properties in application.properties.
    3. What are some common Actuator endpoints, and how do you access them? 
       Some endpoints include /health, /metrics, /info. These can be accessed via HTTP or configured to be available remotely.
10. Spring Boot Testing
    1. How do you test a Spring Boot application? 
        Mention unit tests with JUnit, mocking with Mockito, and integration tests with @SpringBootTest.
    2. What is @MockBean in Spring Boot testing?
    3. What is the difference between @SpringBootTest and @WebMvcTest? 
        @SpringBootTest loads the entire application context, while @WebMvcTest focuses on web layer testing, without loading service or repository beans.
11. Microservices with Spring Boot
    1. How does Spring Boot simplify microservice architecture? 
        Discuss features like embedded servers, easy configuration, Spring Cloud integration, and Actuator for health checks and monitoring.
    2. How do you implement service discovery using Spring Boot? 
        Discuss Spring Cloud and how it integrates with Netflix Eureka for service registration and discovery.
    3. How do you use Spring Boot for building distributed systems (e.g., with Spring Cloud)? 
       Mention the role of Spring Cloud components like Spring Cloud Config, Spring Cloud Gateway, Circuit Breaker (Hystrix/Resilience4J), etc.
    4. What is the Circuit Breaker pattern, and how do you implement it in Spring Boot?

12. Miscellaneous
    1. What is the default embedded server in Spring Boot? Can you change it? 
        Spring Boot's default embedded server is Tomcat, but you can switch to Jetty or Undertow by changing the dependency.
    2. How do you monitor a Spring Boot application in production? 
        Discuss using Spring Boot Actuator along with monitoring tools like Prometheus, Grafana, or integrating with external monitoring solutions.
    3. How do you deploy a Spring Boot application?
        Mention that Spring Boot applications can be deployed as standalone JARs with embedded servers or traditionally as WAR files to external servers.