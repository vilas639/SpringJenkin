package com.example.demo.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
//@EnableAspectJAutoProxy


//@EnableJpaRepositories("com.example.demo.demo1.repository")
//@EntityScan("com.example.demo.demo1.entity")
//@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class ProjectConfig {
}
