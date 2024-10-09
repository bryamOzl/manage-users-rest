package ec.edu.ups.manage_users_rest.service;

import ec.edu.ups.manage_users_rest.model.User;
import ec.edu.ups.manage_users_rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User userDetails) {
        User user = getUserById(id);
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

/*
Explicación:

@Service: Marca la clase como un componente de servicio
@Autowired: Inyecta automáticamente el UserRepository
Implementa la lógica de negocio para cada método definido en la interfaz
Utiliza el repositorio para interactuar con la base de datos
 */