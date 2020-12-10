package by.epam.factory.entity;

import lombok.Getter;

public class Refrigerator extends KitchenAppliance {
    @Getter
    private final int freezerCapacity;
    @Getter
    private final int overallCapacity;

    public Refrigerator(int powerConsumption, int weight, int height, int width, int freezerCapacity, int overallCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }
}
