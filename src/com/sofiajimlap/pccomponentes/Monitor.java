package com.sofiajimlap.pccomponentes;

public class Monitor {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String size;
    private String screenForm;
    private String updateFrequency;
    private Boolean antirreflective;
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
    public void setSize(String size){
        this.size = size;
    }

    public String getScreenForm(){
        return screenForm;
    }
    public void setScreenForm(String screenForm){
        this.screenForm = screenForm;
    }

    public String getUpdateFrequency(){
        return updateFrequency;
    }
    public void setUpdateFrequency(String updateFrequency){
        this.updateFrequency = updateFrequency;
    }

    public Boolean getAntirreflective(){return antirreflective;}
    public void setAntirreflective (Boolean antirreflective) {this.antirreflective = antirreflective;}

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }

}
