# High-Level Class Diagram

```mermaid
classDiagram
    class User {
        -Long id
        -String email
        -String password
        -String name
        -String phoneNumber
        +getId()
        +setId(Long id)
        +getEmail()
        +setEmail(String email)
        +getPassword()
        +setPassword(String password)
        +getName()
        +setName(String name)
        +getPhoneNumber()
        +setPhoneNumber(String phoneNumber)
    }

    class UserService {
        +registerUser(User user)
        +login(String email, String password)
        +forgotPassword(String email)
    }

    class UserRepository {
        +save(User user)
        +findByEmail(String email)
    }

    class LoginController {
        +register(User user)
        +login(String email, String password)
        +forgotPassword(String email)
    }

    UserService --|> UserRepository : uses
    LoginController --|> UserService : uses
```

This class diagram captures the high-level structure of the authentication service, including the user entity, service layer, repository layer, and the controller layer.
