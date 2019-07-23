package sample.spring.chapter16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebRequestSecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/**")
				.hasAnyAuthority("ROLE_CUSTOMER", "ROLE_ADMIN").and()
				.formLogin().and().logout().and().rememberMe().and().headers()
				.cacheControl().and().xssProtection();
	}

	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin")
				.authorities("ROLE_ADMIN").and().withUser("cust1")
				.password("cust1").authorities("ROLE_CUSTOMER").and()
				.withUser("cust2").password("cust2")
				.authorities("ROLE_CUSTOMER");
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
