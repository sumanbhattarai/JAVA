
# JDBC ( JAVA DataBase Connectivity )

- JDBC is a specification ( Guideliness ) defined by JAVA vendor and implement by Database vender
- Database vendor provided implementation is called Driver Software.

# JDBC Features

- Standard API ( Same for all DBMS )
- Database independent API
- Most of the JDBC driver are developed using JAVA , so they are platform independent.
- Huge vendor support for JDBC
- Perform basic CRUD ( Create Read Update Delete ) operation very easily.


# Difference between ODMBS and JDBC 

| ODBC | JDBC |
|------|------|
| 1992 | 1997 |
| Developed by Microsoft | Developed by Sun Micro System |
| Support any language | Only for JAVA language|
| Only for Windows Machine | Support any platform |


> Similarities : Both of them support any databse .


# Steps to develop JDBC Application

1. Load and Register Driver Class :

    ``` Class.forName( " oracle.jdbc.OracleDriver " ) ; ```

2. Establish Connection between java application and database .

    ``` Connection con = DriverManager.getConnection( url , DbUsername , DbPassword )  ;```

3.  Creation of statement Object 

    ``` Statement st = con.createStatement(); ```

4. Send and Execute SQL Query

    ``` Result rs = st.executeQuery("Select * from employees");```

5. Process Result from ResultSet

        while(rs.next())
        {
            System.out.Println(rs.getInt(1));
        }

6. Close Connection

    ``` con.close(); ```



# JDBC Drivers

- While Communicating with database , we have to convert Java calls into database specific calls and database specific calls into Java calls. For this Driver software is required.

> As per our Analogy , driver is a translator.





# Types of Drivers



| Property | Type-1 | Type-2 | Type-3 | Type-4 |
|----------|--------|--------|--------|--------|
| Conversion | From JDBC calls to ODBC call | From JDBC calls to native library call | From JDBC calls to Middleware Server specific calls| From JDBC calls to database specific call |
| Implemented in| Only JAVA | JAVA and Native Language|Only JAVA | Only JAVA|
|Architecture|2 tier|2tier|3tier|2 tier|
|Platform Independent | No | No | Yes | Yes |
| DB independent  | Yes |No|Yes|No|
| Thin or Thick |Thick|Thick|Thick|Thin|
| Also Known as|JDBC-ODBC bridge driver|Native API-Partly Java Driver or Native Driver|All Javanet protocol Driver or Network protcol driver or middleware Driver| Pure Java Driver or Native protocol or this driver.|


# Types of SQL Commands

> DDL ( Data Defination Language ) 
 - Create table , alter , drop

 > DQL ( Data Query Language )
 - SELECT

 > DCL ( Date Control Language )
 - alter password , grant access

 > DML ( Data Manipulation Language )
 - INSERT , DELETE , UPDATE 

 > Data Administrator
 - Start audit

 > Translation
 - Commit , rollback , savepoint

# Methods to execute  SQL query 

> executeQuery()
- to execute select queries 

``` public ResultSet executeQuery ( String sqlQuery ) throw SQL Eception ```

Example : 

            ResultSet rs = st.executeQuery( " Select * from employees " ) ;
            while ( rs.next())
            {
                S.o.p(rs.getInt(1)) ;
            }

> executeUpdate()
- Applicable for non-select operation ( DML )

``` public int executeUpdate(String SqlQuery) throws SQLException ```

Example :

            int affectedRow = st.executeUpdate("INSERT INTO employees('name' , 'address') VALUES ('suman' , 'pokhara')) ;



> execute()
- for both select and non-select operations
- if you don't know SQL query run-time , we can use execute()
- return type is  ```boolean``` i.e ```true``` for select query and ```false``` for non-select query. 

Example :

            boolean b = st.execute( dynamically provided sql Query ) ;
            if(b==true)
            {
                ResultSet rs = st.getResultSet() ;
                while ( rs.next())
                {
                    .....
                }
            }
            else
            {
                int rowCount = st.getUpdateCount() ;
            }




# SQL Injection

- SQL injection is a code injection technique that might destroy your database .
- SQL injection usually occurs when you ask a user for input , like their username and instead of username the user gives you an SQL'statement that you will unknowingly run on your database .
- SQL injection can be prevented by using prepared statement.


# Prepared Statement

Example :

        String sql = " INSERT INTO Student VALUES(?,?,?,?) ;
        PreparedStatement st = con.prepareStatement();
        Scanner sc =  new Scanner ( System.in) ;
        While(true)
        {
            S.o.p("Name") ;
            String name  = sc.next() ;
            S.o.p("Address") ;
            String address = sc.next();
            st.setString(1,Name);
            st.setString(2,address);
            S.o.p("option");
            String option = sc.next() ;
            if(option.equalsIgnoreCase("No"))
            {
                break ;
            }  
        }

# Difference between Statement and PreparedStatement

|Statement|Prepared Statement|
|---------|------------------|
| At the time of creating Statement object , we are not required to provide any query .| At the time of creating Prepared Statement object , we have to provide SQL query compulsory which can be send to the database and will be compiled. |
| ```Statement st = con.createStatement()```|```PreparedStatement post = con.prepareStatement(query)```|
| Hence , statement object is not associated with any query and we can use multiple queries. |Hence , preparedStatemnt always associated with only one query .|
|Whenever, we are using execute method, everytime query will be compiled.| Whenever , we are using execute method, query won't be compiled every time.|
|Statement object can work only for static queries.| Work only for static and dymamic queries.|
| Relatively performance is low .| Relatively performance is high. |
|Inserting data value and large objects is difficult.| Inserting data value and large object is easy.|
