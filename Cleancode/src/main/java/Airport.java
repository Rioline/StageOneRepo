import planes.ExperimentalPlane;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

public class Airport {

    public final List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<PassengerPlane> getPassengerPlane() {
        return planes
                .stream()
                .filter(plane -> plane instanceof PassengerPlane)
                .map(plane -> (PassengerPlane) plane)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        return planes
                .stream()
                .filter(plane -> plane instanceof MilitaryPlane)
                .map(plane -> (MilitaryPlane) plane)
                .collect(Collectors.toList());
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        return planes
                .stream()
                .filter(plane -> plane instanceof ExperimentalPlane)
                .map(plane -> (ExperimentalPlane) plane)
                .collect(Collectors.toList());
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return getPassengerPlane()
                .stream()
                .max(Comparator.comparing(PassengerPlane::getPassengersCapacity))
                .get();
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        return getMilitaryPlanes()
                .stream()
                .filter(plane -> plane.getMilitaryType() == MilitaryType.TRANSPORT)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return getMilitaryPlanes()
                .stream()
                .filter(plane -> plane.getMilitaryType() == MilitaryType.BOMBER)
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByMaxDistance() {
        return planes
                .stream()
                .sorted(Comparator.comparingInt(Plane::getMaxFlightDistance))
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByMaxSpeed() {
        return planes
                .stream()
                .sorted(Comparator.comparingInt(Plane::getMaxSpeed))
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByMaxLoadCapacity() {
        return planes
                .stream()
                .sorted(Comparator.comparingInt(Plane::getMaxLoadCapacity))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Airport {" + "Planes = " + planes.toString() + '}';
    }

}
