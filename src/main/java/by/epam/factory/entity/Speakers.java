package by.epam.factory.entity;

import lombok.Getter;

public class Speakers extends Appliance {
    @Getter
    private final int numberOfSpeakers;
    @Getter
    private final double frequencyMin;
    @Getter
    private final double frequencyMax;

    public Speakers(int powerConsumption, int numberOfSpeakers, double frequencyMin, double frequencyMax) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyMin = frequencyMin;
        this.frequencyMax = frequencyMax;
    }
}
