package com.share.earth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeHttpRequests()
			.antMatchers("/").authenticated()
		.and()
		.formLogin()
			.loginPage("/login")
			.usernameParameter("id")
			.passwordParameter("pwd")
			.loginProcessingUrl("/login")
			.successHandler(loginSuccess())
		.and()
		.logout()
			.logoutUrl("/")
			.logoutSuccessUrl("/")
		.and()
			.addFilterBefore(null, UsernamePasswordAuthenticationFilter.class);
			
	}
	
	
	
	@Bean
	public AuthenticationSuccessHandler loginSuccess() {
		return new CustomLoginSuccessHandler();
	}
	
}
