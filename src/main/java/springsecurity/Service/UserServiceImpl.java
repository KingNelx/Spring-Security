package springsecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springsecurity.Entity.User;
import springsecurity.Model.UserModel;
import springsecurity.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setEmail(user.getEmail());
        user.setPassword((user.getPassword()));
        return null;
    }
}
