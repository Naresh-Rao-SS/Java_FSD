package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Securirtconfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("admin")
		.roles("ADMIN")
		.and()
		.withUser("user")
		.password("user")
		.roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.antMatchers("/access1").hasRole("ADMIN")
		.antMatchers("/access2").hasRole("USER")
		.antMatchers("/access3").hasAnyRole("ADMIN","USER")
		.antMatchers("/").permitAll().and().formLogin();
	}


    @Bean
    public PasswordEncoder getpassword() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
