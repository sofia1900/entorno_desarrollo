package com.sofiajimlap.pccomponentes;

public class MotherBoard {
    /**
     * Atributos
     */

    private Integer id;
    private String brand;
    private String model;
    private Integer numPorts;
    private String size;

    /**
     * Metodos
     */

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public Integer getNumPorts(){return numPorts;};
    public void setNumPorts(Integer numPorts){this.numPorts = numPorts;}

    public String getModel(){return model;}
    public void setModel (String model){this.model = model;}

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
