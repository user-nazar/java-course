package com.lab1.ua.lviv.iot;


public class Laptop {
    private double laptopProcessor;
    private int laptopMemory;
    private String laptopProvider;
    private String laptopOS;
    private double laptopScreenSize;
    private boolean laptopFingerScanner;
    public static int laptopWarranty = 2;
    private static int laptopQuantity = 0;
    protected int laptopVolume;
    protected String laptopQuality;


    public Laptop(double laptopProcessor, int laptopMemory, String laptopProvider, String laptopOS, double laptopScreenSize,
                  boolean laptopFingerScanner) {
        this.laptopProcessor = laptopProcessor;
        this.laptopMemory = laptopMemory;
        this.laptopProvider = laptopProvider;
        this.laptopOS = laptopOS;
        this.laptopScreenSize = laptopScreenSize;
        this.laptopFingerScanner = laptopFingerScanner;
        Laptop.laptopQuantity += 1;
    }

    public Laptop() {

        this(4.0, 16, "Lenovo", "Windows",

              13.1, false);



    }

    private static int laptopOsVersion(String osName){
        int osVersion = 0;
        if (osName == "Windows") {
            osVersion = 7;
        }
        else if (osName == "Linux"){
            osVersion = 4;
        }
        else {
            System.out.println("OS does not detected");
        }
        return osVersion;
    }

    public static int getLaptopOsVersion(String osName){
        return laptopOsVersion(osName);
    }


    public Laptop(double v, int i, String apple, String linux) {
    }

    public double getLaptopProcessor() {
        return laptopProcessor;
    }

    public void setLaptopProcessor(double laptopProcessor) {

        this.laptopProcessor = laptopProcessor;
    }


    public  int getLaptopMemory() {
        return laptopMemory;
    }

    public void setLaptopMemory(int laptopMemory) {
        this.laptopMemory = laptopMemory;
    }

    public String getLaptopProvider() {
        return laptopProvider;
    }

    public void setLaptopProvider(String laptopProvider) {
        this.laptopProvider = laptopProvider;
    }

    public String getLaptopOS() {

        return laptopOS;
    }

    public void setLaptopOS(String laptopOS) {
        this.laptopOS = laptopOS;
    }

    public double getLaptopScreenSize() {
        return laptopScreenSize;
    }

    public void setLaptopScreenSize(Double laptopScreenSize) {

        this.laptopScreenSize = laptopScreenSize;
    }

    public boolean getLaptopFingerScanner() {
        return laptopFingerScanner;
    }

    public void setLaptopFingerScanner(Boolean laptopFingerScanner) {
        this.laptopFingerScanner = laptopFingerScanner;
    }

    public static int getLaptopWarranty() {
        return laptopWarranty;
    }

    public static void setLaptopWarranty(int laptopWarranty) {
        Laptop.laptopWarranty = laptopWarranty;
    }

    @Override
    public String toString() {
        return "Laptop("+  "laptopProcessor=" + laptopProcessor +

                ", laptopMemory=" + laptopMemory +

                ", laptopProvider='" + laptopProvider  + '\'' +

                ", laptopOS=" + laptopOS +

                ", laptopScreenSize=" + laptopScreenSize +

                ", laptopFingerScanner=" + laptopFingerScanner +

                ", laptopWarranty='" + laptopWarranty + '\'' +

                '}';
       
    }

    public void printStaticLaptopWarranty(){
        System.out.println(Laptop.laptopWarranty);


        }

    public void resetValues(double laptopProcessor, int laptopMemory, String laptopProvider, String laptopOS, double laptopScreenSize,
                  boolean laptopFingerScanner) {
        this.laptopProcessor = laptopProcessor;
        this.laptopMemory = laptopMemory;
        this.laptopProvider = laptopProvider;
        this.laptopOS = laptopOS;
        this.laptopScreenSize = laptopScreenSize;
        this.laptopFingerScanner = laptopFingerScanner;




    }





}

