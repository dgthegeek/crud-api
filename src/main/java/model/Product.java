package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products") // Indique que cette classe est un document MongoDB
public class Product {
    @Id // Indique que ce champ est l'identifiant unique
    private String id;

    private String name;
    private String description;
    private Double price;
    private String userId; // Référence à l'utilisateur qui a créé le produit
}
