package by.epam.factory.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.awt.*;

@EqualsAndHashCode(callSuper = true)
public class TabletPC extends AbstractPC {
    @Getter
    private final int flashMemoryCapacity;
    @Getter
    private final Color color;

    public TabletPC(double batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity, Color color) {
        super(batteryCapacity, displayInches, memoryRom);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }
}
