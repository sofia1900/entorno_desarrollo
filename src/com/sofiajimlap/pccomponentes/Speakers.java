package com.sofiajimlap.pccomponentes;

public class Speakers {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String connection;
    private Integer decibels;
    private String size;


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
    public void setModel(String brand){this.model = model;}

    public String getConnection(){
        return connection;
    }
    public void setConnection(String connection){this.connection = connection;}

    public Integer getDecibels(){
        return decibels;
    }
    public void setDecibels(Integer decibels){this.decibels = decibels;}

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
