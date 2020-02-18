package com.lab1.ua.lviv.iot;

public class LaptopDetails {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop(4.0, 16, "Lenovo", "Windows",
                13.1, false);
        Laptop laptop3 = new Laptop(2.0, 12, "Apple", "Linux");
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

        Laptop[] laptopArray = new Laptop[3];
        int LaptopIndex = 0;
        do {
            laptopArray[LaptopIndex] = new Laptop(2.0, 12, "Apple", "Linux");
            LaptopIndex++;
        }while(LaptopIndex !=3);

        for (Laptop laptopArrayElement : laptopArray) {
            System.out.println(laptopArrayElement);
        }




        System.out.println(Laptop.getLaptopOsVersion("Windows"));

    }
}




