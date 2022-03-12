ContactApplication will have a 
    1. signIn page with Email and password. User is allowed to login
    2. SignUp page will have Email, password and secret code. User is allowed to enter email, password and secret code details for
        signing up into the application.
    3. Once user is signed in, there is one more option of Contact details registration.
        where User can save contact name,emaill, number.
        


    
SQL:
------------
Two tables created for this contactsApplication.
    1. login table. 
    2. contactsRegister table.
 when user logins, validates data from this table, if data is valid then only allows to registration of contact details.
 
 Scripts:
        CREATE TABLE login (
        email varchar(255),
        password varchar(255),
        secret_Code varchar(255),
        PRIMARY KEY (email)
        );
 
        INSERT INTO login (email, password)
        VALUES ("test1@gmail.com", "test1
INSERT INTO login (email, password)
        VALUES ("test1@gmail.com", "test1"),
        ("test2@gmail.com", "test2"),
        ("test3@gmail.com", "test3"),
        ("test4@gmail.com", "test4"),
        ("test5@gmail.com", "test5");
CREATE table contactsRegister (
          contact_name varchar(60) NOT NULL,
           contact_number int NOT NULL,
          contact_email varchar(255) NOT NULL,   
          PRIMARY KEY (contact_email)
        ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;


INSERT INTO contactsRegister (contact_name, contact_number,contact_email)
        VALUES ("User1", "9999898874","test1@gmail.com"),
        ("User2", "9999898875","test2@gmail.com"),
        ("User3", "9999898876","test3@gmail.com"),
        ("User4", "9999898877","test4@gmail.com"),
        ("User5", "9999898878","test5@gmail.com");

Dependencies:

1. JSP
2. MySQL connector
3. JDK1.8
4. Apache Tomcat9

------Steps to run the application
1. generate war file jar -cvf projectname.war *  
2. Deploy the war file in Tomcat webapps folder
3. Start the tomcat, deploy the war in manager app
4. Entry url: localhost:8090/login.jsp
