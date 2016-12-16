package Controller;

import DTOobjects.User;
import ServiceImplementation.ServiceImplementation;

public class LoginController {

    ServiceImplementation serviceImpl = new ServiceImplementation();

    public User login(String username, String password)  {

        User user = serviceImpl.authorizeUser(username, password);

        return user;
    }

}
