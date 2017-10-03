# Spring Boot Application example with Spring Data Rest and Embedded MongoDB

### MongoDB Embebbed Config.
* Database: store
* Collections: products
* url: localhost
* port: 12345

Obs.: I used [RoboMongo](http://robomongo.org/) client to access data in MongoDB.


### Tools
[Spring Boot](http://projects.spring.io/spring-boot/)

[Spring Data Rest](http://projects.spring.io/spring-data-rest/)

[MongoDB](https://www.mongodb.com/)

[embedmongo-spring](https://github.com/jirutka/embedmongo-spring)

[de.flapdoodle.embed.mongo](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo)

### Run it!
mvn package spring-boot:run

### Urls
* [http://localhost:8080/api/](http://localhost:8080/api/)

```javascript	
{
  "_links" : {
    "products" : {
      "href" : "http://localhost:8080/api/products{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/api/alps"
    }
  }
}
```
	
* [http://localhost:8080/api/products{?page,size,sort}](http://localhost:8080/api/products{?page,size,sort})



"# embedded_mongodb" 
