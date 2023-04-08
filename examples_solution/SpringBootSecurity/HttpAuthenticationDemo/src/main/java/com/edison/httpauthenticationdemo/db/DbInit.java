package com.edison.httpauthenticationdemo.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.edison.httpauthenticationdemo.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private com.edison.httpauthenticationdemo.db.UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    public DbInit(com.edison.httpauthenticationdemo.db.UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        User dan = new User("dan",passwordEncoder.encode("dan123"),"USER","");
        User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(dan,admin,manager);

        // Save to db
        this.userRepository.saveAll(users);
    }
}
