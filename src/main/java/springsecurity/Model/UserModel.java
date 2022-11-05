package springsecurity.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String address;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter String matchingPassword;
}
