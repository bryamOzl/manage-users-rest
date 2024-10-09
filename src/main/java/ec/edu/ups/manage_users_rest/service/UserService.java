package ec.edu.ups.manage_users_rest.service;

import ec.edu.ups.manage_users_rest.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}

/*
* Explicación:
* Define los métodos que el servicio debe implementar
* Proporciona una abstracción de la lógica de negocio
* Permite cambiar la implementación sin afectar a otras partes del código
*/