package com.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.security.model.User;
import com.spring.security.repository.UserRepository;

@SpringBootApplication
public class SpringBootSecurityApplication implements CommandLineRunner {
	@Autowired
	private PasswordEncoder byCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setEmail("rchahan@gmail.com");
		user1.setUsername("rahul");
		user1.setPassword(this.byCryptPasswordEncoder.encode("rahulchauhan"));
		user1.setRole("ROLE_ADMIN");
		this.userRepository.save(user1);
		User user2 = new User();
		user2.setEmail("kc75633@gmail.com");
		user2.setUsername("kiran");
		user2.setPassword(this.byCryptPasswordEncoder.encode("kiranchauhan"));
		user2.setRole("ROLE_NORMAL");
		this.userRepository.save(user2);

	}

}
