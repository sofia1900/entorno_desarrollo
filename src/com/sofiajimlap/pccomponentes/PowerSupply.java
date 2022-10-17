package com.sofiajimlap.pccomponentes;

public class PowerSupply {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String power;
    private String quality;
    private String connector;

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

    public String getPower(){
        return power;
    }
    public void setPower(String power){
        this.power = power;
    }

    public String getQuality(){
        return quality;
    }
    public void setQuality(String quality){this.quality = quality;}

    public String getConnector(){
        return connector;
    }
    public void setConnector(String connector){this.connector = connector;}

}
