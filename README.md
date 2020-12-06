# AndroidRoomDatabaseWithRelationships

This project demonstrates the below database relationships in Androids' Room database

* One to One (1 to 1)
* One to Many (1 to M)
* Many to Many (N to M)

The database used in this project is a simple *School Management Database* with the below tables

* School
* Director
* Student
* Subject

The relationship among the tables are as follows

School and Director has 1 to 1 - A school can have one director and vice versa.
School and Student has 1 to M - A school can have many students but a student can go to one school only.
Student and Subject has N to M - A student can study many subjects and a subject can be studied by many students.

References : 

[Android Room Database With Multiple Tables](https://www.youtube.com/watch?v=A8AUtcP0rRs)
