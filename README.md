# Queue for student

### Description:

An example of a REST WebServer developed using Spring Framework (MVC and Security).

This application is a queue in which the user can become

- Application implements 3 layer architecture with controller, service and DAO layers.
- Each user must login in order to access application.
- It implements Authentication using an existing DataSource configuration. Database used is PostgreSQL.
- Each user has list of roles that define list of resources accessible for this user.
- JSON format is used to transmit data in a web application.

### Technologies:
- Java (JDK version 11)
- PostgreSQL database
- Hibernate
- Spring Boot(Spring Core, Spring Security, Spring Web)
- JSON
- Maven (version 3.6.3)
- Bootstrap
- Css
- ReactJS

### To run this app locally:
- Fork this project to your repository
- Clone project locally and open it in IntelliJ IDEA
- [Install PostgreSQL](https://www.postgresql.org/download/)
- Change properties for the folliwing line in db.properties file:
1. db.driver=YOUR_DRIVER
2. db.url=YOUR_URL
3. db.username=YOUR_NAME
4. db.password=YOUR_PASSWORD
