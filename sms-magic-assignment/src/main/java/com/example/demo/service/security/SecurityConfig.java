//package com.example.demo.service.security;
//
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
////SecurityConfig.java
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
// @Autowired
// private CustomUserDetailsService customUserDetailsService; // You need to implement this service
//
// @Override
// protected void configure(HttpSecurity http) throws Exception {
//     http
//         .authorizeRequests()
//             .antMatchers("/api/users/**").hasAnyRole("USER", "ADMIN")
//             .antMatchers("/api/companies/**").hasAnyRole("USER", "ADMIN")
//             .antMatchers("/api/clients/create").hasRole("ADMIN")
//             .anyRequest().authenticated()
//             .and()
//         .formLogin()
//             .and()
//         .httpBasic()
//             .and()
//         .csrf().disable();
// }
//
// @Override
// public void configure(AuthenticationManagerBuilder auth) throws Exception {
//     auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
// }
//
// @Bean
// public PasswordEncoder passwordEncoder() {
//     return new BCryptPasswordEncoder();
// }
//}

