# Tweeting and Commenting System - Spring Boot

## Project Overview

This project implements a basic tweeting and commenting system using Spring Boot and MySQL. Users can create accounts, post tweets, edit tweets, view tweets with comments, comment on tweets, search tweets, and list tweets of a user.

## Technologies Used

- Java Spring Boot
- MySQL
- Spring Security
- Spring Data JPA

## Project Setup

1. Clone this repository.
2. Configure your MySQL database in `application.properties`. 
	i) spring.datasource.url=jdbc:mysql://localhost:3306/{name_of_the_schema_created}
	ii) spring.datasource.username={username}
	iii) spring.datasource.password={password}
3. Run the Spring Boot application.

## API Endpoints

- POST /user/users : User registration : for example JSON required : { "username":"admin", "password": "abcde"}
- POST /tweet/save?id={id}: Create a tweet : for example JSON required : {"content": "I love coding"}
- GET /tweet/tweets : List all tweets with comments.
- POST /comment/save?id={id} : Comment on a tweet. : For example JSON required : 
{ "comment" : "I like it too", 
	"tweet": {
		"id" : 
			"tweet_id", 
			"content": "I love coding"
		}, 
		"user" : {
			"id":{id},
		 	"username": "admin"
			}

## Authentication

- All endpoints (except registration) require Basic Authentication with username and password.

## Project Structure

- `src\main\java\com\tweets\handle`:
  - `controller/`: API controllers.
  - `service/`: Service classes.
  - `repository/`: Data repositories.
  - `model/`: Entity classes.
  

## Error Handling

- Proper exception handling is implemented for API error responses.

## Clean Code

- Follows Uncle Bob's clean code philosophy.

## License

This project is licensed under the [MIT License](LICENSE).

