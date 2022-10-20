package com.sofiajimlap.pccomponentes;

public class Fan {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String size;
    private String noiseLevel;
    private String supportType;
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
    public void setModel(String model){this.model = model;}

    public String getSize(){
        return size;
    }
    public void setSize(String size){this.size = size;}

    public String getNoiseLevel (){return noiseLevel;}
    public void setNoiseLevel(String noiseLevel){this.noiseLevel = noiseLevel;}

    public String getSupportType (){return supportType;}
    public void setSupportType(String supportType){this.supportType = supportType;}

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }
}
