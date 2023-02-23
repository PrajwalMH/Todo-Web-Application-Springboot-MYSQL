package com.prajwalmh.todowebapplicationspringboot.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username,String password){

        boolean isValidUserName=username.equalsIgnoreCase("root");
        boolean isValidPassword=password.equalsIgnoreCase("root");
        return isValidUserName && isValidPassword;
    }


}
