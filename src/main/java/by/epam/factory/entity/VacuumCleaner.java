package by.epam.factory.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
public class VacuumCleaner extends Appliance {
    @Getter
    private final char filterType;
    @Getter
    private final String bagType;
    @Getter
    private final String wandType;
    @Getter
    private final int motorSpeedRegulation;
    @Getter
    private final int cleaningWidth;

    public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }
}
