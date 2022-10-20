package com.sofiajimlap.pccomponentes;

public class SetupPC {
    private String id;
    private Processor processor;
    private MotherBoard motherBoard;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setProcessor (Processor processor){this.processor = processor;}
    public Processor getProcessor(){return this.processor;}

    public void setMotherBoard (MotherBoard motherBoard){this.motherBoard = motherBoard;}
    public MotherBoard getMotherBoard(){return this.motherBoard;}

}
