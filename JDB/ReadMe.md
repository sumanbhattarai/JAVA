
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