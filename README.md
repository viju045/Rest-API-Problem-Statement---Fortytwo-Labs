# Rest-API-Problem-Statement---Fortytwo-Labs
--------------------------------------------------------------------------------------------------------
Designed a REST API through the Spring Boot API and added proper JUnit test cases too. DB layer used JSON store database which supports async callback on db inserts. So I use SQL Database tables for store and retrieval(MySQL Instance).
  * Model package:- 1. Student (Name, Age, Address), 2.Subject (Name, Marks).
  * Repository package:- StudentRepo, Here I used 'findByName" method for finding records by using name.   
  * Service package:- StudentService, Here I used two methods "saveStudent" for inserting a record into the table and "getStudentByName" for getting the record.
  * Controller package:- StudentController, I used Two HTTP methods "PostMapping" for inserting purposes and "GetMapping" for getting purpose
  * In this application I used "@OneToMany" for mapping purposes (Each student can be associate  to multiple subjects).
  * Written a JUnit test case for every class and pass it successfully.
--> For "POST" method I used (http://localhost:8080/StudentDetails/savedata) API and provided JSON format raw body like
    {
  "name": "student1",
  "age": 33,
  "address": "Mumbai, India",
  "subjects": [
{
      "name": "maths",
      "marks": 68
    },
    {
      "name": "physics",
      "marks": 98
    }
  ]
}
--> For "GET" method I used (http://localhost:8080/StudentDetails/getData?studentName=student1)) this API and getting an inserted record like
  * Execution steps :- 1. After running the application check whether the table are created or not in the database. 2. Then open Postman and select "POST" method send raw JOSN formated data. 3. and select "GET" method and get the inserted record from the table.
# For the result purpose I uploaded some images in the repo please check it.
