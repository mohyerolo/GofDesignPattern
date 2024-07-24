package template.own;

import template.own.process.Cleaning;
import template.own.process.RainyDayCleaning;
import template.own.process.SunnyDayCleaning;

public class Main {
    public static void main(String[] args) {
        Cleaning sunny = new SunnyDayCleaning();
        System.out.println("화창한 날");
        sunny.cleanTheHouse("월요일");

        System.out.println("----------------------");

        Cleaning rainy = new RainyDayCleaning();
        System.out.println("비오는 날");
        rainy.cleanTheHouse("토요일");
    }
}
