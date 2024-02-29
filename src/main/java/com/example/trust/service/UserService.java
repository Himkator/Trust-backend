package com.example.trust.service;

import com.example.trust.models.User;
import com.example.trust.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(User user){
        log.info("User is saving:{}", user.getName());
        userRepository.save(user);
    }
}
