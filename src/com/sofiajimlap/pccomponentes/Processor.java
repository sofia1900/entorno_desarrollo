package com.sofiajimlap.pccomponentes;

public class Processor {

    /**
     * Atributos, propiedades, variables, estado
     */
    private Integer id;
    private String brand;
    private String fabricante;

    /**
     * Metodos, funciones, comportamiento
     */
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

}
