package com.example.WebsocketFilims;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);
	@Bean
    public UserDetailsService userDetailsService() {
		LOGGER.info("userDetailsService .. Authentication .. Enter!!");
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username(Constants.LOCAL_USERNAME).password(Constants.LCOCAL_PASSWORD).roles(Constants.USER).build());
        manager.createUser(users.username(Constants.ADMIN_USER).password(Constants.ADMIN_PASSWORD).roles(Constants.USER, Constants.ADMIN).build());
        LOGGER.info("userDetailsService .. Authentication .. End!!");
        return manager;

    }
	

}