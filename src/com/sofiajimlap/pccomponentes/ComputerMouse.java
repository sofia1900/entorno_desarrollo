package com.sofiajimlap.pccomponentes;

public class ComputerMouse {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String type;
    private String connectivity;
    private Integer numKeys;
    private Float price;

    /**
     * Métodos
     */

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public String getModel(){return model;}
    public void setModel(String brand){this.model = model;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}

    public String getConnectivity(){return connectivity;}
    public void setConnectivity(String connectivity){this.connectivity = connectivity;}

    public Integer getNumKeys(){return numKeys;}
    public void setNumKeys(Integer numKeys){this.numKeys = numKeys;}

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }

}
