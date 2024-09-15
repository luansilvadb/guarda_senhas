package com.guarda_senhas.service;

import com.guarda_senhas.model.User;
import com.guarda_senhas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        try {
            return userRepository.save(user);
        } catch (DataAccessException e) {
            throw new RuntimeException("Erro ao salvar o usuário: " + e.getMessage(), e);
        }
    }
}
