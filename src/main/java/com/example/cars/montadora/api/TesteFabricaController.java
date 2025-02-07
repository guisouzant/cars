package com.example.cars.montadora.api;

import com.example.cars.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorTurbo")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarr(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);

        return carro.darIginicao(chave);
    }
}
