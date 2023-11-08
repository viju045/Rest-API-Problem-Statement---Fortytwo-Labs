# Rest-API-Problem-Statement---Fortytwo-Labs
--------------------------------------------------------------------------------------------------------
  --> I Design the REST API using spring boot embedded application server. Included proper junit test cases as well. For the DB layer I used json store database which supports async callback on db inserts. So I use use SQL Database tables for store and retrieval(MYSql WorkBench). 
  * model package :- 1.Student (Name, Age, Address), 2.Subject (Name, Marks).
  * repository package :- StudentRepo, Here I used 'findByName" method for finding record by using name.   
  * service package :- StudentService, Here I used two method "saveStudent" is for inserting record into the table and "getStudentByName" for getting record.
  * controller package :- StudentController, Here I used Two HTTP method "PostMapping" for inserting purpose and "GetMapping" for getting purpos
--> In this application I used "@OneToMany" for mapping purpose (Each student can be associate to multiple subjects).
--> For "POST" method I used (http://localhost:8080/StudentDetails/savedata) this API and provide JSON format raw body like
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
--> For "GET" method I used (http://localhost:8080/StudentDetails/getData?studentName=student1)) this API and getting a inserted record like 
