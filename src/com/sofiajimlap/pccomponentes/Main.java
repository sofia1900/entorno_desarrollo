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
        amd.setPrice(137.99f);

        System.out.println("");
        System.out.println("Primer procesador:");
        System.out.println("ID: " + amd.getId());
        System.out.println("MARCA: " + amd.getBrand());
        System.out.println("MODELO: " + amd.getModel());
        System.out.println("NUMERO DE NUCLEOS: " + amd.getNumNucleus());
        System.out.println("VELOCIDAD: " + amd.getSpeed());
        System.out.println("MEMORIA: " + amd.getMemory());
        System.out.println("PRECIO: " + amd.getPrice());


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
        intel.setPrice(120.69f);


        System.out.println("");
        System.out.println("Segundo procesador:");
        System.out.println("ID: " + intel.getBrand());
        System.out.println("MARCA: " + intel.getBrand());
        System.out.println("MODELO: " + intel.getModel());
        System.out.println("NUMERO DE NUCLEOS: " + intel.getNumNucleus());
        System.out.println("VELOCIDAD: " + intel.getSpeed());
        System.out.println("MEMORIA: " + intel.getMemory());
        System.out.println("PRECIO: " + intel.getPrice());

        /**
         * Creacion de un objeto con la clase MotherBoard
         */

        MotherBoard asus = new MotherBoard();
        asus.setId(1);
        asus.setBrand("Asus");
        asus.setNumPorts(3);
        asus.setModel("ASUS TUF GAMING B550-PLUS WIFI II");
        asus.setSize("30 cm");
        asus.setPrice(120.90f);

        System.out.println("");
        System.out.println("Primera placa base:");
        System.out.println("ID: " + asus.getId());
        System.out.println("MARCA: " + asus.getBrand());
        System.out.println("MODELO: " + asus.getModel());
        System.out.println("NUMERO DE PUERTOS: " + asus.getNumPorts());
        System.out.println("TAMAÑO: " + asus.getSize());
        System.out.println("PRECIO: " + asus.getPrice());


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
        kingstom.setPrice(118.99f);

        System.out.println("");
        System.out.println("Primera RAM:");
        System.out.println("ID: " + kingstom.getId());
        System.out.println("MARCA: " + kingstom.getBrand());
        System.out.println("MODELO: " + kingstom.getModel());
        System.out.println("CAPACIDAD: " + kingstom.getCapacity());
        System.out.println("VELOCIDAD: " + kingstom.getSpeed());
        System.out.println("LATENCIA: " + kingstom.getLatency());
        System.out.println("PRECIO: " + kingstom.getPrice());


        /**
         * Creacion de un objeto con la clase Case
         */

        Case kazumi = new Case();
        kazumi.setId (1);
        kazumi.setBrand("L-Link");
        kazumi.setModel("Kazumi USB 3.0 con Ventana");
        kazumi.setNumFans(4);
        kazumi.setFormFactor("ATX");
        kazumi.setSize("200 x 460 x 420 mm");
        kazumi.setPrice(38.99f);

        System.out.println("");
        System.out.println("Primera caja:");
        System.out.println("ID: " + kazumi.getId());
        System.out.println("MARCA: " + kazumi.getBrand());
        System.out.println("MODELO: " + kazumi.getModel());
        System.out.println("NUMERO DE VENTILADORES: " + kazumi.getNumFans());
        System.out.println("FACTOR DE FORMA PERMITIDO: " + kazumi.getFormFactor());
        System.out.println("TAMAÑO: " + kazumi.getSize());
        System.out.println("PRECIO: " + kazumi.getPrice());

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
        nfortec.setPrice(49.95f);

        System.out.println("");
        System.out.println("Primer ventilador:");
        System.out.println("ID: " + nfortec.getId());
        System.out.println("MARCA: " + nfortec.getBrand());
        System.out.println("MODELO: " + nfortec.getModel());
        System.out.println("TAMAÑO: " + nfortec.getSize());
        System.out.println("NIVEL DE RUIDO: " + nfortec.getNoiseLevel());
        System.out.println("TIPO: " + nfortec.getSupportType());
        System.out.println("PRECIO: " + nfortec.getPrice());

        /**
         * Creacion de un objeto con la clase HardDisk
         */

        HardDisk speedster = new HardDisk();
        speedster.setId(1);
        speedster.setBrand("WD BLACK");
        speedster.setModel("SN770");
        speedster.setType ("SDD");
        speedster.setCapacity("1T");
        speedster.setPrice(87.99f);

        System.out.println("");
        System.out.println("Primer Disco duro:");
        System.out.println("ID: " + speedster.getId());
        System.out.println("MARCA: " + speedster.getBrand());
        System.out.println("MODELO: " + speedster.getModel());
        System.out.println("TIPO: " + speedster.getType());
        System.out.println("CAPACIDAD: " + speedster.getCapacity());
        System.out.println("PRECIO: " + speedster.getPrice());

        /**
         * Creacion de un objeto con la clase PowerSupply
         */

        PowerSupply tempest = new PowerSupply();
        tempest.setId(1);
        tempest.setBrand("Tempest");
        tempest.setModel("PSU X");
        tempest.setPower ("750W");
        tempest.setQuality("80+ Bronce");
        tempest.setPrice(32.98f);

        System.out.println("");
        System.out.println("Primera Fuente de alimentación:");
        System.out.println("ID: " + tempest.getId());
        System.out.println("MARCA: " + tempest.getBrand());
        System.out.println("MODELO: " + tempest.getModel());
        System.out.println("POTENCIA: " + tempest.getPower());
        System.out.println("CUALIDAD: " + tempest.getQuality());
        System.out.println("PRECIO: " + tempest.getPrice());

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
        msiGeForce.setPrice(479.90f);

        System.out.println("");
        System.out.println("Primera Tarjeta gráfica:");
        System.out.println("ID: " + msiGeForce.getId());
        System.out.println("MARCA: " + msiGeForce.getBrand());
        System.out.println("MODELO: " + msiGeForce.getModel());
        System.out.println("MEMORIA: " + msiGeForce.getMemory());
        System.out.println("VELOCIDAD DE RELOJ: " + msiGeForce.getClockSpeed());
        System.out.println("TIPO DE MEMORIA: " + msiGeForce.getMemoryType());
        System.out.println("PRECIO: " + msiGeForce.getPrice());

        /**
         * Creacion de un objeto con la clase SoundCard
         */

        SoundCard asusSonar = new SoundCard();
        asusSonar.setId(1);
        asusSonar.setBrand("Asus");
        asusSonar.setModel("Xonar SE");
        asusSonar.setConnector("PCIe");
        asusSonar.setAmplification(" 300ohm");
        asusSonar.setSnr("116dB");
        asusSonar.setPrice(52.3f);

        System.out.println("");
        System.out.println("Primera Tarjeta de sonido:");
        System.out.println("ID: " + asusSonar.getId());
        System.out.println("MARCA: " + asusSonar.getBrand());
        System.out.println("MODELO: " + asusSonar.getModel());
        System.out.println("CONECTOR: " + asusSonar.getConnector());
        System.out.println("AMPLIFICACION: " + asusSonar.getAmplification());
        System.out.println("SNR: " + asusSonar.getSnr());
        System.out.println("PRECIO: " + asusSonar.getPrice());

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
        System.out.println("ID: " + lgRecorder.getId());
        System.out.println("MARACA: " + lgRecorder.getBrand());
        System.out.println("MODELO: " + lgRecorder.getModel());
        System.out.println("TAMAÑO: " + lgRecorder.getSize());
        System.out.println("NUMERO DE REVOLUCIONES: " + lgRecorder.getNumRevolutions());
        System.out.println("UNIDAD OPTICA: " + lgRecorder.getOpticalUnit());
        System.out.println("PRECIO: " + lgRecorder.getPrice());


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

        SetupPC setupPC = new SetupPC();
        setupPC.setId("02x85p");
        setupPC.setProcessor(amd);
        setupPC.setMotherBoard(asus);

        System.out.println(setupPC.getProcessor().getBrand());
        System.out.println((setupPC.getMotherBoard().getBrand()));

    }
}