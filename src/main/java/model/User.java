package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users") // Indique que cette classe est un document MongoDB
public class User {
    @Id // Indique que ce champ est l'identifiant unique
    private String id;

    private String name;
    private String email;
    private String password;
    private String role; // ROLE_ADMIN ou ROLE_USER
}