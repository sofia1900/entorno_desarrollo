package com.sofiajimlap.pccomponentes;

public class RandomAccessMemory {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String capacity;
    private String speed;
    private Integer numCycles;


    /**
     * Métodos
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

    public String getModel(){
        return model;
    }
    public void setModel(String brand){
        this.model = model;
    }

    public String getCapacity(){
        return capacity;
    }
    public void setCapacity(String brand){
        this.capacity = capacity;
    }

    public String getSpeed(){
        return speed;
    }
    public void setSpeed(String speed){
        this.speed = speed;
    }

    public Integer getNumCycles(){
        return numCycles;
    }
    public void setNumCycles(Integer brand){
        this.numCycles = numCycles;
    }

}
