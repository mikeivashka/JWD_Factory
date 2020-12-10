package by.epam.factory.entity;

import by.epam.factory.enumerations.OperatingSystem;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
public class Laptop extends AbstractPC {
    @Getter
    protected final OperatingSystem operatingSystem;
    @Getter
    protected final double centralProcessingUnit;
    @Getter
    protected final int systemMemory;

    public Laptop(double batteryCapacity, double displayInches, int memoryRom, OperatingSystem operatingSystem, double centralProcessingUnit, int systemMemory) {
        super(batteryCapacity, displayInches, memoryRom);
        this.operatingSystem = operatingSystem;
        this.centralProcessingUnit = centralProcessingUnit;
        this.systemMemory = systemMemory;
    }
}
