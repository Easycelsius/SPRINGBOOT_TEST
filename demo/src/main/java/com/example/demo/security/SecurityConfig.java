package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    
	@Override
	public void configure(WebSecurity web) throws Exception
	{
		// 예를들어 이런식으로 인증할것들을 풀어주는겁니다. (주로 리소스)
		web.ignoring().antMatchers("/css/**", "/script/**", "/");
		web.ignoring().antMatchers("/views/**");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		// 여기에선 리소스외에 페이지의 인증/비인증/인증권한등을 설정하는게 좋은것 같습니다.
		http.authorizeRequests()
			// 어드민 권한으로만 접근할 수 있는 경로.
			.antMatchers("/admin/**").access("ROLE_ADMIN");

		/* 로그인 disable 처리 */
		//security.httpBasic().disable();

		//spring-boot-starter-security 403 Forbidden 에러 대처
		http.cors().and();
		http.csrf().disable();
	}
}
