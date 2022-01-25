package com.epam.training.student_Dmitry_Danchenko.collections.main_task.data;

import com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs.Cab;
import com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs.CabWithFuelType;

import java.util.Arrays;
import java.util.List;

import static com.epam.training.student_Dmitry_Danchenko.collections.main_task.cabs.FuelType.*;

public class CabData {
    public static final List<Cab> cabs = Arrays.asList(
            new CabWithFuelType("AUDI", 7722, 200, 30_000, 7.1, DIESEL),
            new CabWithFuelType("BMW", 2345, 250, 32_000, 8.4, GAS),
            new CabWithFuelType("OPEL", 3344, 300, 35_000, 9.6, PETROL),
            new CabWithFuelType("BENTLEY", 5566, 180, 70_000, 13.4, PETROL),
            new CabWithFuelType("BMW", 1022, 250, 32_000, 6.9, GAS),
            new CabWithFuelType("LADA", 1708, 190, 15_000, 9.2, DIESEL),
            new CabWithFuelType("VW", 3030, 280, 70_000, 8.3, PETROL),
            new CabWithFuelType("BENTLEY", 5566, 180, 71_000, 13.5, GAS),
            new CabWithFuelType("PORCHES", 7777, 200, 60_000, 9.1, DIESEL)
    );
}
