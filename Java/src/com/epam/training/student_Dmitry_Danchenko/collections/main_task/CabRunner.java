package com.epam.training.student_Dmitry_Danchenko.collections.main_task;

import com.epam.training.student_Dmitry_Danchenko.collections.main_task.data.CabCompany;
import com.epam.training.student_Dmitry_Danchenko.collections.main_task.data.CabData;

public class CabRunner {
    public static void main(String[] args) {
        CabCompany cabCompany = new CabCompany(CabData.cabs);
        System.out.println("Cost of all cabs in cab company : " + "\n" + cabCompany.calculateCostOfAllCabs());
        System.out.println("Sort by fuel consumption : " + "\n" + cabCompany.sortCabsByFuelConsumption());
        System.out.println("Find in range of speed : " + "\n" + cabCompany.findCabMaxSpeedInRange(200,250));
    }
}
