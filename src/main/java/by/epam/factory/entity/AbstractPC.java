package by.epam.factory.entity;

import lombok.Getter;

public abstract class AbstractPC implements AbstractAppliance {
    @Getter
    protected final double batteryCapacity;
    @Getter
    protected final double displayInches;
    @Getter
    protected final int memoryRom;

    protected AbstractPC(double batteryCapacity, double displayInches, int memoryRom) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
    }
}
