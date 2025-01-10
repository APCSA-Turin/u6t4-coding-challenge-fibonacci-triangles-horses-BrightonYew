package com.example.project;
public class runner {
    public static void main(String[] args) {
        HorseBarn barn1 = new HorseBarn(3);
        barn1.placeHorse(new Horse("Silver",1210), 2);
        barn1.placeHorse(new Horse("Trigger", 1340), 0);
        System.out.println(barn1.findHorseStall("Trigger"));
        System.out.println(barn1.findHorseStall("Silver"));
        System.out.println(barn1.findHorseStall("Lucy"));

}
}