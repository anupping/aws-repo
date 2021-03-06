aws lambda function
==============
AWS Lambda is a compute service that lets you run code without provisioning or managing servers. Lambda runs your code only when needed and scales automatically, from a few requests per day to thousands per second.

department service
=============
It JPA Rest API service EXAMPLE
GET http://localhost:9001/departments/1
POST http://localhost:9001/departments/
{
"deptName":"IT",
"deptAddr":"3rd Floor Ashok Nagar",
"deptCode":"IT-006"
}


user service
=============
Its JPA Rest API service EXAMPLE with one service calling other service through RestTemplate
GET http://localhost:9002/users/1
POST http://localhost:9002/users/
{
    "firstName":"ASHISH KUMAR",
    "lastName":"SHARMA",
    "email":"ashishkumar@gmail.com",
    "deptId":"1"
}


api gateway
=============
create service registry
update department service/user service to register on service registry
create api gateway and configure it
GET http://localhost:9191/departments/1
POST http://localhost:9191/departments/
GET http://localhost:9191/users/1
POST http://localhost:9191/users/