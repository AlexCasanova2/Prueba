package com.company;

public class Coche {



    private String Marca;
    private String modelo;
    private String matricula;
    private Integer potencia;
    private Double precio;

    public Coche(String marca, String modelo, String matricula, Integer potencia, Double precio) {
        Marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (Marca != null ? !Marca.equals(coche.Marca) : coche.Marca != null) return false;
        if (modelo != null ? !modelo.equals(coche.modelo) : coche.modelo != null) return false;
        if (matricula != null ? !matricula.equals(coche.matricula) : coche.matricula != null) return false;
        if (potencia != null ? !potencia.equals(coche.potencia) : coche.potencia != null) return false;
        return precio != null ? precio.equals(coche.precio) : coche.precio == null;

    }

    @Override
    public int hashCode() {
        int result = Marca != null ? Marca.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (potencia != null ? potencia.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        return result;
    }
}
