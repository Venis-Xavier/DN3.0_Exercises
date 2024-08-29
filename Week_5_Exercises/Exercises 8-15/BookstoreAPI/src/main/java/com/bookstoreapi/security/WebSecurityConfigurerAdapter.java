package com.bookstoreapi.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

public abstract class WebSecurityConfigurerAdapter implements WebSecurityConfigurer<WebSecurity>
{

    protected abstract void configure(AuthenticationManagerBuilder auth) throws Exception;

    protected abstract void configure(HttpSecurity http) throws Exception;
}