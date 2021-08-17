# Software-Engineer-Assessments
#How it is designed
Spring Boot is being used for both retrieving data and creating the REST API.

MySQL is used for the database storage of the data.

In Spring Boot, JDBCTemplate is being used to do queries and the data object is being returned if required. 
REST Api are bring made in the UserAPI class using RestController annotations. GetMapping,PostMapping,PutMapping and DeleteMapping are used to map the path. ReponseEntity is being returned to get the while HTTP response.

#How to run the code
Git Hub Repository :  "https://github.com/louislowjk/Software-Engineer-Assessments.git"
1) Use MySQLDeveloper and run the sql codes found in TABLE_SCRIPT.sql to create the table with some values
2) Use XAMPP to start an SQL service at port 3306
3) We can run the code in two ways using IntelliJ IDEA or Eclipse. 
   1) Using IntelliJ IDEA
      1) Click File -> New -> Project from Version Control
      2) We can copy the link from the git hub repository, "https://github.com/louislowjk/Software-Engineer-Assessments.git" and paste in the dialog.
      3) Project will be created and click on the SoftwareEngineerAssessmentApplication.class file and run the application.
   2) Using Eclipse
      1) Go to the git hub repository and download the zip file of the codes
      2) Unzip and import the file as a maven project. 
      3) Project will be created and you can run the program

#REST APIS
Below are the REST APIs you can use in Postman 

1) Get Users - GET http://localhost:5000/users
   1) list of users will be returned in json format
2) Get Specific User - GET http://localhost:5000/users/{id}
   1) Specfic user with id will be returned in json format
3) Create user - POST http://localhost:5000/users with a body
   1) Body must be provided
4) Update user - PUT http://localhost:5000/users with a body
   1) Body must be provided 
5) Delete specific user - DELETE http://localhost:5000/users/{id}
   1) Specific user with id will be deleted
* {id} can be of any number 

The body format can be like this 

    `{
       "id": 1,
       "name": "Jack",
       "dob": "2020-03-04",
       "address": "123 Road",
       "description": "This is a description",
       "createdAt": "2021-01-11"
    }
    `