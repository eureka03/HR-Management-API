package service;

import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthService {

    private PasswordEncoder passwordEncode;

    public AuthService(PasswordEncoder passwordEncode){
        this.passwordEncode = passwordEncode;
    }




}
