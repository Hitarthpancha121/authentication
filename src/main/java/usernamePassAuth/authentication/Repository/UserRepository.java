package usernamePassAuth.authentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usernamePassAuth.authentication.Modal.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
