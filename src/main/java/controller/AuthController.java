package controller;

import dto.LoginRequest;
import dto.LoginResponse;
import dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import service.JWTService;


@RestController
@RequestMapping("/auth/user")
public class AuthController{

    private AuthenticationManager authenticationManager;
    private JWTService jwtService;


    @PostMapping("/registration")
    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto user){

        return ResponseEntity.ok(user);

    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> userLogin(@RequestBody LoginRequest userLogin){

        String userName = userLogin.getUsername();
        String userPassword = userLogin.getPassword();

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName,userPassword));
        String token = jwtService.generateToken();
        LoginResponse response = new LoginResponse(token);
        return ResponseEntity.ok(response);
    }


}


