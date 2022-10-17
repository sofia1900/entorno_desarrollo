package com.sofiajimlap.pccomponentes;

public class Main {
    public static void main (String[] args){
        System.out.println("Inicializando...");

        Procesador amd = new Procesador();

        /**
         * Codigo a ejecutar por un administrativo de la empresa.
         * Codigo para introducir informacion a procesadores
         */

        amd.setId(1);
        amd.setBrand("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println("Primer procesador:");
        System.out.println(amd.getBrand());
        System.out.println(amd.getFabricante());

        /**
         * CREACION DE OTRO PROCESADOR (otro objeto sobre la clase procesador)
         */

        Procesador pentum = new Procesador();
        pentum.setId(2);
        pentum.setBrand("PENTUM 500");
        pentum.setFabricante("PENTUM");

        System.out.println("");
        System.out.println("Segundo procesador:");
        System.out.println(pentum.getBrand());
        System.out.println(pentum.getFabricante());

        Procesador intel = new Procesador();
        intel.setId(2);
        intel.setBrand("INTEL i7");
        intel.setFabricante("INTEL");

        System.out.println("");
        System.out.println("Tercer procesador:");
        System.out.println(intel.getBrand());
        System.out.println(intel.getFabricante());

        /**
         * Creacion de un objeto con la clase MotherBoard
         */

        MotherBoard asus = new MotherBoard();
        asus.setId(1);
        asus.setBrand("Asus");
        asus.setNumPorts(3);
        asus.setModel("ASUS TUF GAMING B550-PLUS WIFI II");
        asus.setSize("30 cm");

        System.out.println("");
        System.out.println("Primera placa base:");
        System.out.println(asus.getId());
        System.out.println(asus.getBrand());
        System.out.println(asus.getModel());
        System.out.println(asus.getNumPorts());
        System.out.println(asus.getSize());


        /**
         * Creacioon de un objeto con la clase GraphicCard
         */

        GraphicCard msiGeForce = new GraphicCard();
        msiGeForce.setId(1);
        msiGeForce.setBrand("MSI");
        msiGeForce.setModel("GeForce RTX");
        msiGeForce.setType ("RTX");
        msiGeForce.setMemory("6 GB");
        msiGeForce.setClockSpeed("1710 MHz");
        msiGeForce.setMemoryType("DDR4");

    }
}