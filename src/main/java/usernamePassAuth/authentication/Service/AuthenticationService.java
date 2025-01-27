package usernamePassAuth.authentication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usernamePassAuth.authentication.Modal.User;
import usernamePassAuth.authentication.Repository.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(User usrr) {
        User user = userRepository.findByUsername(usrr.getUsername());
        return user != null && user.getPassword().equals(user.getPassword());
    }
    public User getUser(User user){
        return userRepository.findByUsername(user.getUsername());
    }
}
