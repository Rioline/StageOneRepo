package com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs;

/**
 * Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
 * 1. Подсчитать стоимость автопарка.
 * 2. Провести сортировку автомобилей парка по расходу топлива.
 * 3. Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

public class Cab {
    private final String cabModel;
    private final int cabNumber;
    private final int maxSpeed;
    private final int cabCost;
    private final double fuelConsumption;

    public Cab(String cabModel, int cabNumber, int maxSpeed, int cabCost, double fuelConsumption) {
        this.cabModel = cabModel;
        this.cabNumber = cabNumber;
        this.maxSpeed = maxSpeed;
        this.cabCost = cabCost;
        this.fuelConsumption = fuelConsumption;
    }

    public String getCabModel() {
        return cabModel;
    }

    public int getCabNumber() {
        return cabNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCabCost() {
        return cabCost;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cab cab = (Cab) o;
        if (cabNumber != cab.cabNumber) return false;
        if (maxSpeed != cab.maxSpeed) return false;
        if (cabCost != cab.cabCost) return false;
        if (Double.compare(cab.fuelConsumption, fuelConsumption) != 0) return false;
        return cabModel.equals(cab.cabModel);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cabModel.hashCode();
        result = 31 * result + cabNumber;
        result = 31 * result + maxSpeed;
        result = 31 * result + cabCost;
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabModel='" + cabModel + '\'' +
                ", cabNumber=" + cabNumber +
                ", maxSpeed=" + maxSpeed +
                ", cabCost=" + cabCost +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

}
