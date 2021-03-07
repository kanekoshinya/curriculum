package attendance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

  @Configuration
  public class SequrityConfiguration extends WebSecurityConfigurerAdapter {
//	  @Override
//	  protected void configure(HttpSecurity http) throws Exception {
//	    http.authorizeRequests().antMatchers("/") // /homeに一致するリクエストは
//	                            .permitAll()          // 誰でもアクセス可能
//	                            .anyRequest()         // その他のリクエストは
//	                            .authenticated()      // 認証が必要
//	         .and().formLogin()
//	         .and().httpBasic();
//	  }
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        //ログインページを指定。
	        //ログインページへのアクセスは全員許可する。
	        http.formLogin()
	            .loginPage("/login")
	            .permitAll();

	        http.authorizeRequests()
	            .anyRequest().authenticated();
	    }
	  @Override
	  public void configure(WebSecurity web) throws Exception {
	      web.ignoring().antMatchers("/css/**");
	  }

	    @Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
//	  @Override
//	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	    auth.inMemoryAuthentication()
//	        .withUser("user").password("password").roles("USER")
//	        .and()
//	        .withUser("admin").password("adminpassword").roles("ADMIN");
//	  }
	}


