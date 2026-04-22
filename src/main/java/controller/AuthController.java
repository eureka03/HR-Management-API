package controller;

import dto.LoginRequest;
import dto.LoginResponse;
import dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/user")
public class AuthController{

    @PostMapping("/registration")
    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto user){

        return ResponseEntity.ok(user);

    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> userLogin(@RequestBody LoginRequest userLogin){

        return ResponseEntity.ok(LoginResponse);
    }


}


