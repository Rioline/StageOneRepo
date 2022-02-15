package com.epam.training.student_Dmitry_Danchenko.collections.main_task.data;

import com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs.Cab;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CabCompany {
    public final List<? extends Cab> allCabs;

    public CabCompany(List<? extends Cab> allCabs) {
        this.allCabs = allCabs;
    }

    public List<? extends Cab> getAllCabs() {
        return allCabs;
    }

    public int calculateCostOfAllCabs() {
        return allCabs
                .stream()
                .mapToInt(Cab::getCabCost)
                .sum();
    }

    public List<? extends Cab> sortCabsByFuelConsumption() {
        return allCabs
                .stream()
                .sorted(Comparator.comparingDouble(Cab::getFuelConsumption))
                .collect(Collectors.toList());
    }

    public List<? extends Cab> findCabMaxSpeedInRange(int min, int max) {
        return allCabs
                .stream()
                .filter(cab -> cab.getMaxSpeed() >= min && cab.getMaxSpeed() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CabCompany{" +
                "allCabs=" + allCabs +
                '}';
    }

}
