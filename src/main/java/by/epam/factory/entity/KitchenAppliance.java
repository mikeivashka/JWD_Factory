package by.epam.factory.entity;

import lombok.Getter;

public abstract class KitchenAppliance extends Appliance {
    @Getter
    protected final int weight;
    @Getter
    protected final int height;
    @Getter
    protected final int width;

    protected KitchenAppliance(int powerConsumption, int weight, int height, int width) {
        super(powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }
}
