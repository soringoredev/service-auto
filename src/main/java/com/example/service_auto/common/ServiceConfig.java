package com.example.service_auto.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean("mecanicReparaDiesel")
    public Mecanic mecanicDiesel() {
        return new MecanicDiesel();
    }

    @Bean("mecanicReparaBenzina")
    public Mecanic mecanicBenzina() {
        return new MecanicBenzina();
    }

}
