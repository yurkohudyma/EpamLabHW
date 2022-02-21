Spring_4 Web MVC Homework

Required:

1. Extend your service functionality by:
   ● adding basic validation to DTO classes ● using mapstruct to map DTOs ● implementing custom common and unified error
   handling functionality using Spring MVC components ● adding the Spring Boot Actuator to your project and configuring
   the ‘/info’ endpoint of it. ● extending your service RESTful endpoints by Swagger Documentation   
   ● create custom validation annotations using ConstraintValidator Optional (would be a great plus):
2. Investigate and get hands-on experience working with the RestTemplate: create a separate service that will make REST
   calls to your main service endpoints (GET, POST, PUT, PATCH, DELETE) and parse the response.
3. Investigate add multilingual support for exception messages configuring the ‘MessageSource’ bean -
   https://www.baeldung.com/spring-custom-validation-message-source

Spring_5 Data Homework

1. Integrate your application with any relational database. You are free of choice regarding the relational database
   management system to be used.

- integrate using Spring Data JPA (configure connection details, implement JPA repositories, etc.)
- add JPA entity mapping including mappings between entities (@OneToOne, @ManyToOne, etc.)
- make sure to use all/any of listed annotation: @Query, @NamedQuery, and @NamedNativeQuery.
- make sure to use ‘pageable’ and ‘sortable’ reads from the database.

Optional (would be a great plus):

2. Make use of JdbcTemplate class somewhere in you code.