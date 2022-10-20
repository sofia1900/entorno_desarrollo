package com.sofiajimlap.pccomponentes;

public class Main {
    public static void main (String[] args){
        System.out.println("Inicializando...");

        Processor amd = new Processor();

        /**
         * Codigo a ejecutar por un administrativo de la empresa.
         * Codigo para introducir informacion a procesadores
         */

        amd.setId(1);
        amd.setBrand("AMD");
        amd.setModel("Ryzen 5 3600");
        amd.setNumNucleus(6);
        amd.setSpeed("4.2GHz");
        amd.setMemory("DDR4");


        System.out.println("");
        System.out.println("Primer procesador:");
        System.out.println(amd.getBrand());
        System.out.println(amd.getModel());
        System.out.println(amd.getNumNucleus());
        System.out.println(amd.getSpeed());
        System.out.println(amd.getMemory());


        /**
         * CREACION DE OTROS PRCOCESADORES (otro objeto sobre la clase procesador)
         */

        Processor intel = new Processor();
        intel.setId(2);
        intel.setBrand("Intel");
        intel.setModel("Pentuim Gold G6405");
        intel.setNumNucleus(2);
        intel.setSpeed("4.1 GHz");
        intel.setMemory("DDR4-2666");


        System.out.println("");
        System.out.println("Segundo procesador:");
        System.out.println(intel.getBrand());
        System.out.println(intel.getBrand());
        System.out.println(intel.getModel());
        System.out.println(intel.getNumNucleus());
        System.out.println(intel.getSpeed());
        System.out.println(intel.getMemory());

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
         * Creacion de un objeto con la clase RandomAccessMemory
         */

        RandomAccessMemory kingstom = new RandomAccessMemory();
        kingstom.setId (1);
        kingstom.setBrand("Corsair");
        kingstom.setModel("Vengeance LPX PC4-25600");
        kingstom.setSpeed("3200MHz");
        kingstom.setCapacity("2x16GB");
        kingstom.setLatency(16);

        System.out.println("");
        System.out.println("Primera RAM:");
        System.out.println(kingstom.getId());
        System.out.println(kingstom.getBrand());
        System.out.println(kingstom.getModel());
        System.out.println(kingstom.getCapacity());
        System.out.println(kingstom.getSpeed());
        System.out.println(kingstom.getLatency());


        /**
         * Creacion de un objeto con la clase Case
         */

        Case Kazumi = new Case();
        Kazumi.setId (1);
        Kazumi.setBrand("L-Link");
        Kazumi.setModel("Kazumi USB 3.0 con Ventana");
        Kazumi.setNumFans(4);
        Kazumi.setFormFactor("ATX");
        Kazumi.setSize("200 x 460 x 420 mm");

        System.out.println("");
        System.out.println("Primera caja:");
        System.out.println(Kazumi.getId());
        System.out.println(Kazumi.getBrand());
        System.out.println(Kazumi.getModel());
        System.out.println(Kazumi.getNumFans());
        System.out.println(Kazumi.getFormFactorMaterial());
        System.out.println(Kazumi.getSize());

        /**
         * Creacion de un objeto con la clase Fan
         */

        Fan nfortec = new Fan();
        nfortec.setId(1);
        nfortec.setBrand("Nfortec");
        nfortec.setModel("SCULPTOR 6Pipes ARGB 120mm");
        nfortec.setSize ("154mm x 123mm x 106mm");
        nfortec.setNoiseLevel("26.3dB(A)±10%");
        nfortec.setSupportType("AM4");

        System.out.println("");
        System.out.println("Primer ventilador:");
        System.out.println(nfortec.getId());
        System.out.println(nfortec.getBrand());
        System.out.println(nfortec.getModel());
        System.out.println(nfortec.getSize());
        System.out.println(nfortec.getNoiseLevel());
        System.out.println(nfortec.getSupportType());

        /**
         * Creacion de un objeto con la clase HardDisk
         */

        HardDisk speedster = new HardDisk();
        speedster.setId(1);
        speedster.setBrand("WD BLACK");
        speedster.setModel("SN770");
        speedster.setType ("SDD");
        speedster.setCapacity("1T");

        System.out.println("");
        System.out.println("Primer Disco duro:");
        System.out.println(speedster.getId());
        System.out.println(speedster.getBrand());
        System.out.println(speedster.getModel());
        System.out.println(speedster.getType());
        System.out.println(speedster.getCapacity());

        /**
         * Creacion de un objeto con la clase PowerSupply
         */

        PowerSupply tempest = new PowerSupply();
        tempest.setId(1);
        tempest.setBrand("Tempest");
        tempest.setModel("PSU X");
        tempest.setPower ("750W");
        tempest.setQuality("80+ Bronce");

        System.out.println("");
        System.out.println("Primera Fuente de alimentación:");
        System.out.println(tempest.getId());
        System.out.println(tempest.getBrand());
        System.out.println(tempest.getModel());
        System.out.println(tempest.getPower());
        System.out.println(tempest.getQuality());

        /**
         * Creacion de un objeto con la clase GraphicCard
         */

        GraphicCard msiGeForce = new GraphicCard();
        msiGeForce.setId(1);
        msiGeForce.setBrand("MSI");
        msiGeForce.setModel("GeForce RTX");
        msiGeForce.setType ("RTX");
        msiGeForce.setMemory("6 GB");
        msiGeForce.setClockSpeed("1710 MHz");
        msiGeForce.setMemoryType("DDR4");

        System.out.println("");
        System.out.println("Primera Tarjeta gráfica:");
        System.out.println(msiGeForce.getId());
        System.out.println(msiGeForce.getBrand());
        System.out.println(msiGeForce.getModel());
        System.out.println(msiGeForce.getMemory());
        System.out.println(msiGeForce.getClockSpeed());
        System.out.println(msiGeForce.getMemoryType());

        /**
         * Creacion de un objeto con la clase SoundCard
         */

        SoundCard asusSonar = new SoundCard();
        asusSonar.setId(1);
        asusSonar.setBrand("Asus");
        asusSonar.setModel("Xonar SE");
        asusSonar.setconnector("PCIe");
        asusSonar.setAmplification(" 300ohm");
        asusSonar.setSnr("116dB");

        System.out.println("");
        System.out.println("Primera Tarjeta de sonido:");
        System.out.println(asusSonar.getId());
        System.out.println(asusSonar.getBrand());
        System.out.println(asusSonar.getModel());
        System.out.println(asusSonar.getConnector());
        System.out.println(asusSonar.getAmplification());
        System.out.println(asusSonar.getSnr());

        /**
         * Creacion de un objeto con la clase Recorder
         */

        Recorder lgRecorder = new Recorder();
        lgRecorder.setId(1);
        lgRecorder.setBrand("LG");
        lgRecorder.setModel("Ultra Slim Externa USB");
        lgRecorder.setSize("141 mm x 136,5 mm x 14 mm");
        lgRecorder.setNumRevolutions(8);
        lgRecorder.setOpticalUnit("DVD±RW");

        System.out.println("");
        System.out.println("Primera Grabadora:");
        System.out.println(lgRecorder.getId());
        System.out.println(lgRecorder.getBrand());
        System.out.println(lgRecorder.getModel());
        System.out.println(lgRecorder.getSize());
        System.out.println(lgRecorder.getNumRevolutions());
        System.out.println(lgRecorder.getOpticalUnit());


        /**
         * Creacion de un objeto con la clase Monitor
         */

        Monitor samsungLC = new Monitor();
        samsungLC.setId(1);
        samsungLC.setBrand("Samsung");
        samsungLC.setModel("LC24RG50FQRXEN");
        samsungLC.setSize("23.5 LED FullHD");
        samsungLC.setScreenForm("Curva");
        samsungLC.setUpdateFrequency("144Hz");
        samsungLC.setAntirreflective(true);

        System.out.println("");
        System.out.println("Primer Monitor:");
        System.out.println(samsungLC.getId());
        System.out.println(samsungLC.getBrand());
        System.out.println(samsungLC.getModel());
        System.out.println(samsungLC.getSize());
        System.out.println(samsungLC.getScreenForm());
        System.out.println(samsungLC.getUpdateFrequency());
        System.out.println(samsungLC.getAntirreflective());

        /**
         * Creacion de un objeto con la clase Keyboard
         */

        Keyboard equipKeyb = new Keyboard();
        equipKeyb.setId(1);
        equipKeyb.setBrand("Equip");
        equipKeyb.setModel("Equip Teclado USB Negro");
        equipKeyb.setType("mecánico");
        equipKeyb.setColor("Cherry Blue");
        equipKeyb.setConnectivity("USB");


        System.out.println("");
        System.out.println("Primer teclado:");
        System.out.println(equipKeyb.getId());
        System.out.println(equipKeyb.getBrand());
        System.out.println(equipKeyb.getModel());
        System.out.println(equipKeyb.getType());
        System.out.println(equipKeyb.getColor());
        System.out.println(equipKeyb.getConnectivity());

        /**
         * Creacion de un objeto con la clase ComputerMouse
         */

        ComputerMouse rapoo = new ComputerMouse();
        rapoo.setId(1);
        rapoo.setBrand("Rapoo");
        rapoo.setModel("M100");
        rapoo.setType("normal");
        rapoo.setConnectivity("Inalámbrico");
        rapoo.setNumKeys(3);


        System.out.println("");
        System.out.println("Primer ratón:");
        System.out.println(rapoo.getId());
        System.out.println(rapoo.getBrand());
        System.out.println(rapoo.getModel());
        System.out.println(rapoo.getType());
        System.out.println(rapoo.getConnectivity());
        System.out.println(rapoo.getNumKeys());


        /**
         * Creacion de un objeto con la clase Speakers
         */

        Speakers tecens = new Speakers();
        tecens.setId(1);
        tecens.setBrand("Tacens Anima");
        tecens.setModel("AS1");
        tecens.setConnection("USB");
        tecens.setDecibels(70);
        tecens.setSize("40 x 40");


        System.out.println("");
        System.out.println("Primer altavoz:");
        System.out.println(tecens.getId());
        System.out.println(tecens.getBrand());
        System.out.println(tecens.getModel());
        System.out.println(tecens.getConnection());
        System.out.println(tecens.getDecibels());
        System.out.println(tecens.getSize());

    }
}