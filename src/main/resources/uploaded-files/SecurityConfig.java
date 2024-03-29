/**
 * 
 */
package com.ing.mortgage.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()		
				.antMatchers("/user/**").hasRole("USER")			
				.and()
				.csrf().disable().headers().frameOptions().disable();
http
          .authorizeRequests()
          .anyRequest()
          .authenticated()
          .and()
          .httpBasic();	
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER");
auth
          .inMemoryAuthentication()
          .withUser("user")
            .password("password")
            .roles("USER");
	}
}