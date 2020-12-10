package by.epam.factory.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
public class Oven extends KitchenAppliance {
    @Getter
    private final int capacity;
    @Getter
    private final int depth;

    public Oven(int powerConsumption, int weight, int height, int width, int capacity, int depth) {
        super(powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }
}
