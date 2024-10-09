package ec.edu.ups.manage_users_rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data; // si usas Lombok

@Entity // Indica que esta clase es una entidad JPA
@Data   // Lombok: genera getters, setters, toString, equals, hashCode
public class User {
    @Id // Marca este campo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementa el ID
    private Long id;

    private String username;
    private String email;

    // Si no usas Lombok, necesitas agregar getters y setters
}
