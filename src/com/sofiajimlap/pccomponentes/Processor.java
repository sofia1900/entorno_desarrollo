package com.sofiajimlap.pccomponentes;

public class Processor {

    /**
     * Atributos, propiedades, variables, estado
     */
    private Integer id;
    private String brand;
    private String model;
    private Integer numNucleus;
    private String speed;
    private String memory;

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

    public String getModel(){return model;}
    public void setModel (String model){this.model = model;}

    public Integer getNumNucleus(){
        return numNucleus;
    }
    public void setNumNucleus(Integer numNucleus){
        this.numNucleus = numNucleus;
    }

    public String getSpeed(){return speed;}
    public void setSpeed (String model){this.speed = speed;}

    public String getMemory(){
        return memory;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }

}
