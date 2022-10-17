package com.sofiajimlap.pccomponentes;

public class Case {
    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String brand;
    private String model;
    private String name;
    private String material;
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
    public void setModel(String brand){
        this.model = model;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){this.name = name;}

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String name){this.material = material;}

    public String getSize(){
        return size;
    }
    public void setSize(String size){this.size = size;}
}
