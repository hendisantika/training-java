# Spring Boot CRUD Movie

How to run this repo :

open terminal :
1. Create New Movie
`curl --data "title=Start Wars&year=2016" http://localhost:8080/movies/create`

2. Read All movies
`curl http://localhost:8080/movies/all`

3. Find movies by Id
`curl http://localhost:8080/movies/read?id=1`

4. Update movies
`curl --data "title=Start Wars&year=2016" http://localhost:8080/movies/update?id=4&title=Hidup&year=2017`

5. Delete movies
`curl --data "title=Start Wars&year=2016" http://localhost:8080/movies/delete?id=1`


[Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)