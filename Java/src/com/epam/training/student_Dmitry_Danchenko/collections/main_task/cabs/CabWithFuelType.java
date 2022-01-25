package com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs;

public class CabWithFuelType extends Cab {
    private final FuelType fuelType;

    public CabWithFuelType(String cabModel, int cabNumber, int maxSpeed, int cabCost, double fuelConsumption, FuelType fuelType) {
        super(cabModel, cabNumber, maxSpeed, cabCost, fuelConsumption);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CabWithFuelType that = (CabWithFuelType) o;
        return fuelType == that.fuelType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fuelType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString()
                .replace("}",
                        ", fuelType=" + fuelType +
                                '}');
    }

}
