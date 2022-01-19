## RESTful Learning

### 1. What's it?
REST is short for "Representational state transfer", "表征状态转移" in Chinese.
It's a set of theories about how to design our system's API. We should focus
on the resources.

### 2. How to start it?
It's a typical Spring boot project.
1. Git clone;
2. Excute `create.sql` to create the database you will use;
3. Edit `application.yml`, change default database password to yours;
4. Click start to build the project, you can visit it on `127.0.0.1:8081`.

### 3. RESTful
In fact, we might use it before you know it. We should know
something about HTTP protocol before learning REST.

There are 4 ways in HTTP protocol to tell the server what client want to do:
`GET`, `POST`, `PUT` and `DELETE`.

1. `GET`: want to get a resource;
2. `POST`: want to send objects of entities to server;
3. `PUT`: want to deliver some files to server;
4. `DELETE`: want to delete some files in the server.

There are also 2 ways called `HEAD` and `OPTIONS`. But they are not used
very often.

In REST theory, we should use noun words as part of URL, use these 4 ways above to show
the behavior when we design Web API.

What does REST really mean? According to Dr. Roy Fielding, there are 3 main features:
1. Every URL stands for a kind of resource;
2. We deliver some view between client and server;
3. Client use resources in server through HTTP in order to let state transfer.

To design REST API, we must make these:
1. Client / Server Structure;
2. **Non-State** Although we should make request with our identification and state everytime, It's efficient enough;
3. Unified Interface;
4. Unified Response Type(XML / **JSON**);
5. Can Cached;
6. Code with need. We can send some codes to client. It's optional.

### 4. How to create a REST API
To create a REST API, you may use the following annotations:
1. `@ResponseBody` : return a JSON
2. `@GetMapping` : same as `@RequestMapping(method=RequestMethod.GET)`
3. `@PostMapping`
4. `@PutMapping`
5. `@DeleteMapping`
6. `@RequestBody` : your parameter should be a JSON
7. `@RestController` : same as `@Controller` + `@ResponseBody`

### 5. Swagger
Swagger is a framework that can help us create doc of APIs automatically.
It can create `.html` doc and can test API in this html.

If we want to use Swagger, you should import the dependencies in `pom.xml` firstly.
```xml
<dependencies>
    <dependency>
        <groupId>com.google.guava</groupId>
        <artifactId>guava</artifactId>
        <version>20.0</version>
    </dependency>
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency>
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.9.2</version>
    </dependency>
</dependencies>
```

You should change `spring.mvc.pathmatch.matching-strategy` to
`ant_path_matcher`.
```yaml
spring:
    mvc:
      pathmatch:
        matching-strategy: ant_path_matcher
```

Firstly, you should make a config class for swagger. Please see the `SwaggerConfig.java`.

You can use `@Api`, `@ApiIoeration`, `@ApiParam`, `@ApiImpplicitParam`.
