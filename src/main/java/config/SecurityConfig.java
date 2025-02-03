package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Désactive CSRF (à réactiver en production)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/products/**").permitAll() // Les produits sont accessibles sans authentification
                        .anyRequest().authenticated() // Toutes les autres requêtes nécessitent une authentification
                );
        return http.build();
    }
}