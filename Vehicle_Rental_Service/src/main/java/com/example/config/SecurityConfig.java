package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


import com.example.service.impl.UserServiceImpl;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserServiceImpl();
	}
	
	
	@Bean

	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService());
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;

	}
	
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
			throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}

	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity)  throws Exception
	{
		httpSecurity.csrf().disable().authorizeHttpRequests().requestMatchers("/user").permitAll().and()
		.authorizeHttpRequests()

		//.requestMatchers(HttpMethod.GET, "/user/**").hasAnyAuthority("ROLE_USER")
		.requestMatchers(HttpMethod.GET, "/user/users").hasAnyAuthority("ROLE_ADMIN")
		.requestMatchers(HttpMethod.POST, "/bookings").hasAnyAuthority("ROLE_USER")
		.requestMatchers(HttpMethod.GET, "/bookings/**").hasAnyAuthority("ROLE_USER")
		
		.requestMatchers(HttpMethod.POST, "/addfourWheelerCategory").hasAnyAuthority("ROLE_ADMIN")
		.requestMatchers(HttpMethod.GET, "/twoWheelerCategory/**").hasAnyAuthority("ROLE_ADMIN")
		.requestMatchers(HttpMethod.POST, "/addtowWheelerCategory").hasAnyAuthority("ROLE_ADMIN")
		.requestMatchers(HttpMethod.GET, "/twoWheeler/**").hasAnyAuthority("ROLE_HOST")
		.requestMatchers(HttpMethod.POST, "/twoWheeler/**").hasAnyAuthority("ROLE_HOST")
		.requestMatchers(HttpMethod.GET, "/fourWheeler/**").hasAnyAuthority("ROLE_HOST")
		.requestMatchers(HttpMethod.POST, "/fourWheeler/**").hasAnyAuthority("ROLE_HOST")
		.requestMatchers(HttpMethod.GET, "/driver/**").hasAnyAuthority("ROLE_DRIVER").anyRequest()
		.authenticated().and().formLogin().permitAll().and().httpBasic();

			return httpSecurity.build();
	}
}
