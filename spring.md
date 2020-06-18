# Spring Framework

At its heart, the Spring framework is a framework built on the concept of Dependency Injection. Dependency injection is a concept that is widely used in the Java environment alongside other less dynamic languages. Dependency Injection is intended to resolve tight coupling between application components. When two components are too tightly coupled it results in changes to one part of the application requiring cascading changes to all the components they are coupled with.

One of the problems with working in Java is that everything is class based, and if I have a dependency (for instance, my service will require a DAO), then the service becomes responsible for instantiating the DAO.  However, if we follow single-responsibility principle, the service layer should have no responsibility over the DAO. 

When using Spring our classes aren't responsible for knowing about their dependencies other than the interface that a dependency needs to fulfill. For many of our architectural classes, they will not be instantiated by our code. As a result, our code can be more modular, easier to update, and easier to configure.

## Spring Beans
A Spring bean is any class that Spring is able to manage the lifecycle of.  These include many internal Spring classes, classes provided by Spring modules, or our own classes if we configure to be managed by Spring.  Traditionally there are three ways to configure a class to be managed by Spring:

1. XML Configuration
2. Configuration Class config (@Configuration)
3. Annotation-Driven Configuration (@Component)

## Autowiring
If a Spring bean has a dependency, and that dependency is also a bean that Spring can manage, then we will generally allow Spring to 'autowire' the bean.  This means that Spring automatically provide this dependency without us having to provide logic for providing it or managing the lifecycle of the bean. When autowiring, Spring must be resolve a single class valid for autowiring.  Possible beans can be narrowed down by a few different mechanisms.  One is to annotate the bean you would like to use with the @Primary annotation - this indicates that that bean should be preferred.

## Application Context
The application context is a kind of class in Spring that represents the state of Spring as a whole to the application.  This is generally a long-lived object that will be maintained for entirety of the application's lifecycle.  You can think of this as the Spring version of Hibernate's SessionFactory.

## Spring Boot Main Method
The Spring Boot main method is a common pattern for bootstrapping Spring Boot.  This generally includes a standard Java main method, with the class annotated with @SpringBootApplication and the main method should call SpringApplication.run() with two parameters: A .class reference to the class that the main method exists within (which should sit above all other classes in the package structure) and the arguments passed to the main method from the command line (args).