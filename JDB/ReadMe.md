
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




