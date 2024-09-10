package org.example;
/*
Create Registration Class in which you would have variables such as email, userName and password that have an access scope only within its own class. After creating an object of the class, the user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:

Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid passwords cannot contain userName.
 */

public class Registration {


        private String userEmail;
        private String username;
        private String password;

        void registerEmail(String userEmail){
            //Check Email address
            String domainName = userEmail.substring(userEmail.lastIndexOf("@")+1);
            if(domainName.equals("yahoo.com")){
                userEmail = userEmail;
                System.out.println(userEmail);
            }  else{
                System.out.println("You must use a yahoo.com email account");
            }
        }

        void registerUsername(String username){
            //Check username
            if(username.length() < 6) {
                System.out.println("Your username must be larger than 6 characters");
            } else{
                username = username;
                System.out.println(username);
            }
        }
        void registerPassword(String password){
            //Check password
            if (password.equals(username)){
                System.out.println("Your password cannot be your username");
            } else if(password.length() < 6){
                System.out.println("Your password must be greater than 6 characters");
            } else{
                password = password;
                System.out.println(password);
            }
        }

        public static void main(String[] args) {
            Registration reg = new Registration();
            reg.registerEmail("jimm@yahoo.com");
            reg.registerUsername("jimmyt");
            reg.registerPassword("Sdkjfksdjfjsdkjf");
        }
    }

