package com.sofiajimlap.pccomponentes;

public class GraphicCard {

    /**
     * ATRIBUTOS
     */

    private Integer id;
    private String brand;
    private String model;
    private String type;
    private String memory;
    private String clockSpeed;
    private String memoryType;


    /**
     * MÉTODOS
     */

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}


    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}


    public String getModel(){return model;}
    public void setModel (String model){this.model = model;}


    public String getType(){return type;}
    public void setType (String type){this.type = type;}


    public String getMemory(){return memory;}
    public void setMemory(String memory){this.memory = memory;}


    public String getClockSpeed(){return clockSpeed;}
    public void setClockSpeed (String clockSpeed){this.clockSpeed = clockSpeed;}


    public String getMemoryType(){return memoryType;}
    public void setMemoryType (String memoryType){this.memoryType = memoryType;}
}
