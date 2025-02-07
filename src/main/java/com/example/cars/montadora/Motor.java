package com.example.cars.montadora;

public class Motor {

    private String modelo;

    private Integer cavalos;

    private Integer cilidros;

    private Double litragem;

    private TypeMotor typeMotor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilidros() {
        return cilidros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilidros=" + cilidros +
                ", litragem=" + litragem +
                ", typeMotor=" + typeMotor +
                '}';
    }

    public void setCilidros(Integer cilidros) {
        this.cilidros = cilidros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TypeMotor getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(TypeMotor typeMotor) {
        this.typeMotor = typeMotor;
    }
}
