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
    private Integer latency;
    private Float price;


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
    public void setModel(String model){
        this.model = model;
    }

    public String getCapacity(){
        return capacity;
    }
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public String getSpeed(){
        return speed;
    }
    public void setSpeed(String speed){
        this.speed = speed;
    }

    public Integer getLatency(){
        return latency;
    }
    public void setLatency(Integer latency){this.latency = latency;}

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }

}
