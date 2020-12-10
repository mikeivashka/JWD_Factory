package by.epam.factory.entity;

import lombok.Data;
import lombok.Getter;

@Data
public abstract class Appliance implements AbstractAppliance {
    @Getter
    protected int powerConsumption;

    protected Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
