package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import repository.UserRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //Used for password hashing I think
    @Bean
    public PasswordEncoder encode(){

        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository repo){
        return username -> repo.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("Username not found"));
    }
}
