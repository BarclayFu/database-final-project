# INFSCI 2710 Database Management Final Project

### Team members: shiyuan luo(shl298), sizhe fu(sif33)

### How to run the project
- run the WebManagementApplication.java
- open postman using http://localhost:8080

## API documentation

### GET

### 1. Get all employees' data(show readable data by join several tables together)
#### URL: `/empdata`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "employeeId": 1,
            "firstName": "A",
            "lastName": "S",
            "email": "alice.smith@example.com",
            "phone": "123-456-7890",
            "hireDate": "2020-01-01",
            "salary": 100000.0,
            "departmentName": "Sales",
            "jobTitleName": "Manager"
        },
        {
            "employeeId": 8,
            "firstName": "Matthew",
            "lastName": "Davis",
            "email": ",matthew.davis@example.com",
            "phone": "555-111-1111",
            "hireDate": "2020-05-01",
            "salary": 80000.0,
            "departmentName": "Sales",
            "jobTitleName": "Sales Representative"
        },
        {
            "employeeId": 2,
            "firstName": "Bob",
            "lastName": "Johnson",
            "email": "bob.johnson@example.com",
            "phone": "555-123-4567",
            "hireDate": "2019-01-01",
            "salary": 120000.0,
            "departmentName": "Marketing",
            "jobTitleName": "Manager"
        },
        {
            "employeeId": 9,
            "firstName": "Olivia",
            "lastName": " Wilson",
            "email": "olivia.wilson@example.com",
            "phone": "555-111-2222",
            "hireDate": "2020-05-01",
            "salary": 90000.0,
            "departmentName": "Marketing",
            "jobTitleName": "Marketing Specialist"
        },
        {
            "employeeId": 4,
            "firstName": "David",
            "lastName": "Lee",
            "email": "david.lee@example.com",
            "phone": "555-555-5555",
            "hireDate": "2021-04-01",
            "salary": 80000.0,
            "departmentName": "Engineering",
            "jobTitleName": "Software Engineer"
        },
        {
            "employeeId": 7,
            "firstName": "Benjamin",
            "lastName": "Thompson",
            "email": "benjamin.thompson@example.com",
            "phone": "555-222-2222",
            "hireDate": "2019-01-01",
            "salary": 120000.0,
            "departmentName": "Engineering",
            "jobTitleName": "Manager"
        },
        {
            "employeeId": 3,
            "firstName": "Charlie",
            "lastName": "Davis",
            "email": "charlie.davis@example.com",
            "phone": "555-987-6543",
            "hireDate": "2020-07-01",
            "salary": 70000.0,
            "departmentName": "Finance",
            "jobTitleName": "Manager"
        },
        {
            "employeeId": 10,
            "firstName": "James",
            "lastName": "Taylor",
            "email": "james.taylor@example.com",
            "phone": "555-233-4123",
            "hireDate": "2020-05-01",
            "salary": 85000.0,
            "departmentName": "Finance",
            "jobTitleName": "Accountant"
        },
        {
            "employeeId": 5,
            "firstName": "Emily",
            "lastName": "Jones",
            "email": "emily.jones@example.com",
            "phone": "555-444-4444",
            "hireDate": "2020-01-01",
            "salary": 90000.0,
            "departmentName": "HR",
            "jobTitleName": "HR Specialist"
        },
        {
            "employeeId": 6,
            "firstName": "Sophia",
            "lastName": "Brown",
            "email": "sophia.brown@example.com",
            "phone": "555-333-3333",
            "hireDate": "2019-01-01",
            "salary": 110000.0,
            "departmentName": "HR",
            "jobTitleName": "Manager"
        }
    ]
}
```

### 2. Get all department
### URL: `/depts`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "departmentId": 1,
            "departmentName": "Sales"
        },
        {
            "departmentId": 2,
            "departmentName": "Marketing"
        },
        {
            "departmentId": 3,
            "departmentName": "Engineering"
        },
        {
            "departmentId": 4,
            "departmentName": "Finance"
        },
        {
            "departmentId": 5,
            "departmentName": "HR"
        }
    ]
}
```

### 3. Get all courses
### URL: `/course`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "courseId": 1,
            "courseName": "Management 101",
            "instructorName": "John Smith",
            "location": "Online"
        },
        {
            "courseId": 2,
            "courseName": "Sales Techniques",
            "instructorName": "Jane Doe",
            "location": "In-Person"
        },
        {
            "courseId": 3,
            "courseName": "Marketing Analytics",
            "instructorName": "Bob Johnson",
            "location": "Online"
        },
        {
            "courseId": 4,
            "courseName": "Software Development Best Practices",
            "instructorName": "David Lee",
            "location": "Online"
        },
        {
            "courseId": 5,
            "courseName": "Project Management Fundamentals",
            "instructorName": "Sarah Thompson",
            "location": "In-Person"
        }
    ]
}
```

### 4. Get full job history
### URL: `/jobhis`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "employeeId": 1,
            "jobTitleId": 1,
            "startDate": "2022-01-01",
            "endDate": "2023-04-04",
            "currentStatus": false
        },
        {
            "employeeId": 1,
            "jobTitleId": 2,
            "startDate": "2020-01-01",
            "endDate": "2021-12-31",
            "currentStatus": false
        },
        {
            "employeeId": 1,
            "jobTitleId": 5,
            "startDate": "2023-04-04",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 2,
            "jobTitleId": 1,
            "startDate": "2022-04-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 2,
            "jobTitleId": 3,
            "startDate": "2019-01-01",
            "endDate": "2022-03-31",
            "currentStatus": false
        },
        {
            "employeeId": 3,
            "jobTitleId": 1,
            "startDate": "2022-07-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 3,
            "jobTitleId": 5,
            "startDate": "2020-07-01",
            "endDate": "2022-06-30",
            "currentStatus": false
        },
        {
            "employeeId": 4,
            "jobTitleId": 4,
            "startDate": "2021-04-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 5,
            "jobTitleId": 6,
            "startDate": "2020-01-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 6,
            "jobTitleId": 1,
            "startDate": "2019-01-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 7,
            "jobTitleId": 1,
            "startDate": "2019-01-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 8,
            "jobTitleId": 2,
            "startDate": "2020-05-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 9,
            "jobTitleId": 3,
            "startDate": "2020-05-01",
            "endDate": null,
            "currentStatus": true
        },
        {
            "employeeId": 10,
            "jobTitleId": 5,
            "startDate": "2020-05-01",
            "endDate": null,
            "currentStatus": true
        }
    ]
}
```

### 5. Get job titles
### URL: `/jobtitles`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "jobTitleId": 1,
            "jobTitleName": "Manager"
        },
        {
            "jobTitleId": 2,
            "jobTitleName": "Sales Representative"
        },
        {
            "jobTitleId": 3,
            "jobTitleName": "Marketing Specialist"
        },
        {
            "jobTitleId": 4,
            "jobTitleName": "Software Engineer"
        },
        {
            "jobTitleId": 5,
            "jobTitleName": "Accountant"
        },
        {
            "jobTitleId": 6,
            "jobTitleName": "HR Specialist"
        }
    ]
}
```

### 6. Get system user list
### URL: `/login`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "loginAccountId": 1,
            "permission": "admin",
            "employeeId": 6,
            "accountName": "sophia.admin",
            "passwords": "admin123"
        },
        {
            "loginAccountId": 2,
            "permission": "admin",
            "employeeId": 5,
            "accountName": "emily.admin",
            "passwords": "admin321"
        },
        {
            "loginAccountId": 3,
            "permission": "manager",
            "employeeId": 1,
            "accountName": "alice",
            "passwords": "alice111"
        },
        {
            "loginAccountId": 4,
            "permission": "manager",
            "employeeId": 2,
            "accountName": "bob",
            "passwords": "bob123"
        },
        {
            "loginAccountId": 5,
            "permission": "manager",
            "employeeId": 7,
            "accountName": "benjamin",
            "passwords": "ben1213"
        },
        {
            "loginAccountId": 6,
            "permission": "manager",
            "employeeId": 3,
            "accountName": "charlie",
            "passwords": "charlie7"
        }
    ]
}
```

### 7. Get Payroll information
### URL: `/pay`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "payrollId": 2,
            "employeeId": 2,
            "payDate": "2023-03-31",
            "grossPay": 6000.0
        },
        {
            "payrollId": 3,
            "employeeId": 3,
            "payDate": "2023-03-31",
            "grossPay": 7000.0
        },
        {
            "payrollId": 4,
            "employeeId": 4,
            "payDate": "2023-03-31",
            "grossPay": 8000.0
        },
        {
            "payrollId": 5,
            "employeeId": 5,
            "payDate": "2023-03-31",
            "grossPay": 9000.0
        },
        {
            "payrollId": 6,
            "employeeId": 6,
            "payDate": "2023-03-31",
            "grossPay": 6000.0
        },
        {
            "payrollId": 7,
            "employeeId": 7,
            "payDate": "2023-03-31",
            "grossPay": 7000.0
        },
        {
            "payrollId": 8,
            "employeeId": 8,
            "payDate": "2023-03-31",
            "grossPay": 8000.0
        },
        {
            "payrollId": 9,
            "employeeId": 9,
            "payDate": "2023-03-31",
            "grossPay": 9000.0
        },
        {
            "payrollId": 10,
            "employeeId": 10,
            "payDate": "2023-03-31",
            "grossPay": 9000.0
        }
    ]
}
```

### 8. Get employee performance
### URL: `/perf`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "reviewId": 1,
            "employeeId": 8,
            "reviewDate": "2022-01-01",
            "reviewerId": 2,
            "rating": 4,
            "comments": "Good work, keep it up!"
        },
        {
            "reviewId": 2,
            "employeeId": 9,
            "reviewDate": "2022-02-15",
            "reviewerId": 3,
            "rating": 3,
            "comments": "Average performance, need to improve in some areas"
        },
        {
            "reviewId": 3,
            "employeeId": 10,
            "reviewDate": "2022-05-20",
            "reviewerId": 3,
            "rating": 2,
            "comments": "Need to improve communication skills"
        },
        {
            "reviewId": 6,
            "employeeId": 5,
            "reviewDate": "2022-04-10",
            "reviewerId": 2,
            "rating": 4,
            "comments": "Well done, keep up the good work!"
        },
        {
            "reviewId": 7,
            "employeeId": 4,
            "reviewDate": "2022-03-31",
            "reviewerId": 1,
            "rating": 5,
            "comments": "Excellent work, exceeded expectations!"
        }
    ]
}
```

### 9. Get training records
### URL: `/recs`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "employeeId": 1,
            "courseId": 1,
            "completionDate": "2022-04-15"
        },
        {
            "employeeId": 1,
            "courseId": 2,
            "completionDate": "2022-06-30"
        },
        {
            "employeeId": 2,
            "courseId": 3,
            "completionDate": "2023-03-31"
        },
        {
            "employeeId": 3,
            "courseId": 4,
            "completionDate": "2022-12-31"
        },
        {
            "employeeId": 4,
            "courseId": 5,
            "completionDate": "2023-02-28"
        }
    ]
}
```

### 10. Get Time sheet
### URL: `/time`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "timesheetId": 1,
            "employeeId": 1,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 0
        },
        {
            "timesheetId": 2,
            "employeeId": 2,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 10
        },
        {
            "timesheetId": 3,
            "employeeId": 3,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        },
        {
            "timesheetId": 4,
            "employeeId": 4,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 30
        },
        {
            "timesheetId": 5,
            "employeeId": 5,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 40
        },
        {
            "timesheetId": 6,
            "employeeId": 6,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        },
        {
            "timesheetId": 7,
            "employeeId": 7,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        },
        {
            "timesheetId": 8,
            "employeeId": 8,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        },
        {
            "timesheetId": 9,
            "employeeId": 9,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        },
        {
            "timesheetId": 10,
            "employeeId": 10,
            "countDate": "2023-03-31",
            "regularHours": 120,
            "overtimeHours": 20
        }
    ]
}
```

### 11. Get vacation
### URL: `/vac`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": [
        {
            "requestId": 1,
            "employeeId": 1,
            "startDate": "2023-04-01",
            "endDate": "2023-04-05",
            "status": "Approved"
        },
        {
            "requestId": 2,
            "employeeId": 2,
            "startDate": "2023-04-02",
            "endDate": "2023-04-06",
            "status": "Pending"
        },
        {
            "requestId": 3,
            "employeeId": 3,
            "startDate": "2023-04-03",
            "endDate": "2023-04-07",
            "status": "Denied"
        },
        {
            "requestId": 4,
            "employeeId": 4,
            "startDate": "2023-04-04",
            "endDate": "2023-04-08",
            "status": "Approved"
        },
        {
            "requestId": 5,
            "employeeId": 5,
            "startDate": "2023-04-05",
            "endDate": "2023-04-09",
            "status": "Pending"
        }
    ]
}
```

### POST

### 1. Determine whether login successfully with correct account name and passwords
#### URL: `/login`
#### JSON payloads:
```json
{
    "accountName": "sophia.admin",
    "passwords": "admin123"
}
```
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": {
        "loginAccountId": 1,
        "permission": "admin",
        "employeeId": 6,
        "accountName": "sophia.admin",
        "passwords": "admin123"
    }
}
```

### 2. Insert new employee data
#### URL: `/empdata`
#### JSON payloads:
```json
{
  "employeeId": 111,
  "firstName": "L",
  "lastName": "S",
  "email": "smith@example.com",
  "phone": "123-456-8888",
  "hireDate": "2022-01-01",
  "salary": 90000.0,
  "departmentName": 1,
  "jobTitleName": 2
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### 3. Insert new department
#### URL: `/empdata`
#### JSON payloads:
```json
{
    "departmentId": 6,
    "departmentName": "balabal"
}
```
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": null
}
```

### 4. Insert new payroll record
#### URL: `/pay`
#### JSON payloads:
```json
{
  "payrollId": 1,
  "employeeId": 1,
  "payDate": "2023-03-31",
  "grossPay": 8000.0
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### 5. Insert new timesheet record
#### URL: `/time`
#### JSON payloads:
```json
{
  "timesheetId": 11,
  "employeeId": 1,
  "countDate": "2023-03-31",
  "regularHours": 120,
  "overtimeHours": 30
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### PUT

### 1. Update a employee
#### URL: `/empdata`
#### JSON payloads:
```json
{
  "employeeId": 111,
  "firstName": "L",
  "lastName": "S",
  "email": "smith@example.com",
  "phone": "123-666-8888",
  "hireDate": "2022-01-01",
  "salary": 90000.0,
  "departmentName": 1,
  "jobTitleName": 2
}
```
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": null
}
```

### 2. Update a department
#### URL: `/depts`
#### JSON payloads:
```json
{
  "departmentId": 6,
  "departmentName": "baxixi"
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### 3. Update a payroll record
#### URL: `/pay`
#### JSON payloads:
```json
{
  "payrollId": 1,
  "employeeId": 1,
  "payDate": "2023-03-31",
  "grossPay": 9000.0
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### 4. Update a timesheet record
#### URL: `/time`
#### JSON payloads:
```json
{
  "timesheetId": 11,
  "employeeId": 1,
  "countDate": "2023-03-31",
  "regularHours": 100,
  "overtimeHours": 30
}
```
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### Delete

### 1. Delete a employee
#### URL: `/empdata/:id`
#### Example of API response:
```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

### 2. Delete a department based on the id
#### URL: `/depts/:id`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": null
}
```

### 3. Delete a payroll record based on the id
#### URL: `/pay/:id`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": null
}
```


### 4. Delete a timesheet record based on the id
#### URL: `/time/:id`
#### Example of API response:
```json
{
    "code": 1,
    "msg": "success",
    "data": null
}
```