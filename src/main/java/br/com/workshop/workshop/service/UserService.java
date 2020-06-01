package br.com.workshop.workshop.service;

import br.com.workshop.workshop.model.User;
import br.com.workshop.workshop.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
