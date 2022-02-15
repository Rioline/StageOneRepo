package planes;

import models.AccessType;
import models.ExperimentalType;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private final ExperimentalType experimentalType;
    private final AccessType accessType;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType experimentalType, AccessType accessType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.accessType = accessType;
    }

    public ExperimentalType getExperimentalType() {
        return experimentalType;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    @Override
    public String toString() {
        return super.toString()
                .replace("}",
                        ", experimentalType = " + experimentalType +
                                ", accessType = " + accessType +
                                '}');
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalType, accessType);
    }

}
