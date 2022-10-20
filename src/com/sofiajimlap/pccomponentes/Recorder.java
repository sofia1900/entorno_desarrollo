package com.sofiajimlap.pccomponentes;

public class Recorder {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String size;
    private Integer numRevolutions;
    private String opticalUnit;

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

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public Integer getNumRevolutions (){
        return numRevolutions;
    }
    public void setNumRevolutions (Integer numRevolutions){this.numRevolutions = numRevolutions;}

    public String getOpticalUnit(){
        return opticalUnit;
    }
    public void setOpticalUnit(String opticalUnit){
        this.opticalUnit = opticalUnit;
    }
}
