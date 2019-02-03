package service;

import domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User login(String user);
}
