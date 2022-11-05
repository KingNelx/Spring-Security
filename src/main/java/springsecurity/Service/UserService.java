package springsecurity.Service;

import springsecurity.Entity.User;
import springsecurity.Model.UserModel;

public interface UserService {

    User registerUser(UserModel userModel);
}
