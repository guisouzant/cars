package com.example.cars.montadora.configuration;

import com.example.cars.montadora.Motor;
import com.example.cars.montadora.TypeMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setCilidros(2);
        motor.setModelo("V6");
        motor.setLitragem(1.0);
        motor.setTypeMotor(TypeMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilidros(3);
        motor.setModelo("V7");
        motor.setLitragem(2.0);
        motor.setTypeMotor(TypeMotor.TURBO);
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilidros(4);
        motor.setModelo("V8");
        motor.setLitragem(3.0);
        motor.setTypeMotor(TypeMotor.ELETRICO);
        return motor;
    }
}
