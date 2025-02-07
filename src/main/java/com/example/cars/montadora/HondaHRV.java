package com.example.cars.montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLUE);
        setMontadora(Montadora.HONDA);
    }

}
