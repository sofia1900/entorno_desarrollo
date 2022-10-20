package com.sofiajimlap.pccomponentes;

public class Case {
    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private Integer numFans;
    private String formFactor;
    private String size;
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
    public void setModel(String brand){
        this.model = model;
    }

    public Integer getNumFans(){
        return numFans;
    }
    public void setNumFans(Integer numFans){this.numFans = numFans;}

    public String getFormFactor(){
        return formFactor;
    }
    public void setFormFactor(String name){this.formFactor = formFactor;}

    public String getSize(){
        return size;
    }
    public void setSize(String size){this.size = size;}

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }
}
