package com.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.spring.security.service.CustomeUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomeUserDetailService userservice;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication().withUser("user").password(this.encode().encode(
		 * "password")).roles("USER").and()
		 * .withUser("admin").password(this.encode().encode("password")).roles("USER",
		 * "ADMIN");
		 */
		auth.userDetailsService(userservice).passwordEncoder(encode());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http.authorizeRequests().antMatchers("/home/**").permitAll().anyRequest().authenticated().and().httpBasic();
		/*
		 * http.csrf().disable().authorizeRequests().antMatchers("/home/**").hasRole(
		 * "ADMIN").anyRequest().authenticated() .and().httpBasic();
		 */
		/*
		 * http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()
		 * ).and().authorizeRequests()
		 * .antMatchers("/home/**").hasRole("ADMIN").anyRequest().authenticated().and().
		 * httpBasic();
		 */
		http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and().authorizeRequests()
				.antMatchers("/custom/login").permitAll().antMatchers("/home/**").hasRole("ADMIN").anyRequest()
				.authenticated().and().formLogin().loginPage("/custom/login").loginProcessingUrl("/custom/doLogin")
				.defaultSuccessUrl("/users/");
	}

	/*
	 * @Bean protected PasswordEncoder encode() { return
	 * NoOpPasswordEncoder.getInstance(); }
	 */

	@Bean
	protected PasswordEncoder encode() {
		return new BCryptPasswordEncoder(10);
	}

}
