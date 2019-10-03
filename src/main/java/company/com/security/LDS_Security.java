package company.com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class LDS_Security extends WebSecurityConfigurerAdapter {
    private static final String DRIVER_USER="DRIVER";
    private static final String CUSTOMER_USER="CUSTOMER";
    private static final String ADMIN_USER="ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("driver")
                .password(encoder().encode("driver"))
                .roles(DRIVER_USER)

                .and()

                .withUser("customer")
                .password(encoder().encode("customer"))
                .roles(CUSTOMER_USER)

                .and()

                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(ADMIN_USER);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/order/create").hasRole(CUSTOMER_USER)
                .and()
                .csrf().disable()
                .formLogin().disable();
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"**/item/create").hasRole(ADMIN_USER)
                .and()
                .csrf().disable()
                .formLogin().disable();
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"**ordertiming/create").hasRole(DRIVER_USER)
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
