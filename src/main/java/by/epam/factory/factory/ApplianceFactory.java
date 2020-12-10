package by.epam.factory.factory;

import by.epam.factory.entity.*;
import by.epam.factory.enumerations.OperatingSystem;

import java.awt.*;

public class ApplianceFactory {
    public Oven createOven(int powerConsumption, int weight, int height, int width, int capacity, int depth) {
        return new Oven(powerConsumption, weight, height, width, capacity, depth);
    }

    public Laptop createLaptop(double batteryCapacity, double displayInches, int memoryRom, OperatingSystem operatingSystem, double centralProcessingUnit, int systemMemory) {
        return new Laptop(batteryCapacity, displayInches, memoryRom, operatingSystem, centralProcessingUnit, systemMemory);
    }

    public Refrigerator createRefrigerator(int powerConsumption, int weight, int height, int width, int freezerCapacity, int overallCapacity) {
        return new Refrigerator(powerConsumption, weight, height, width, freezerCapacity, overallCapacity);
    }

    public Speakers createSpeakers(int powerConsumption, int numberOfSpeakers, double frequencyMin, double frequencyMax) {
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyMin, frequencyMax);
    }

    public TabletPC createTablet(double batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity, Color color) {
        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    public VacuumCleaner createVacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth){
        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

}
