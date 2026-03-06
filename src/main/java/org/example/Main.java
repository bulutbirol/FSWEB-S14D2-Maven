package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 90);
        Wardrobe wardrobe = new Wardrobe(200, 180, 85.5);
        Carpet carpet = new Carpet(250, 200, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();
        bedroom.getCeiling().create();

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom.getName());
        System.out.println(bedroom.getLamp().getStyle());
        System.out.println(bedroom.getLamp().isBattery());
        System.out.println(bedroom.getLamp().getGlobRating());
    }
}