package com.sofiajimlap.pccomponentes;

public class HardDisk {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String type;
    private String capacity;
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

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getCapacity(){
        return capacity;
    }
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }
}
