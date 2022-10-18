package com.sofiajimlap.pccomponentes;

public class SoundCard {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private Integer numConnectors;
    private String amplification;
    private String snr;

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

    public Integer getNumConnectors () {return numConnectors;}
    public void setNumConnectors (Integer numConnectors){this.numConnectors = numConnectors;}

    public String getAmplification(){
        return amplification;
    }
    public void setAmplification(String amplification){
        this.amplification = amplification;
    }

    public String getSnr(){
        return snr;
    }
    public void setSnr(String snr){this.snr = snr;}

}