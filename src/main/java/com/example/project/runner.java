package com.example.project;

public class runner {
    public static void main(String[] args) {
        Horse h1 = new Horse("Abe", 1100);
        Horse h2 = new Horse("Barb", 1200);
        Horse h3 = new Horse("Cathy", 1300);
        Horse[] horses = {h1, h2, null, h3};
        HorseBarn barn = new HorseBarn(horses);
        System.out.println(barn.horseBarnInfo());
}
}