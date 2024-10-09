package ec.edu.ups.manage_users_rest.controller;

import ec.edu.ups.manage_users_rest.model.User;
import ec.edu.ups.manage_users_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}

/*
Explicación:

@RestController: Combina @Controller y @ResponseBody
@RequestMapping("/api/users"): Define la ruta base
Métodos HTTP:

@PostMapping: Crear (POST)
@GetMapping: Leer (GET)
@PutMapping: Actualizar (PUT)
@DeleteMapping: Eliminar (DELETE)

ResponseEntity: Permite personalizar la respuesta HTTP
 */