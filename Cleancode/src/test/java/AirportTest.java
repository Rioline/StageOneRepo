import data.AirportData;
import models.AccessType;
import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planes.PassengerPlane;
import planes.Plane;

import java.util.List;

import static org.testng.Assert.*;

public class AirportTest {

    private Airport airport;

    @BeforeMethod
    public void setUp() {
        airport = new Airport(AirportData.allPlanes);
    }

    @Test
    public void testGetMilitaryPlanes_TransportMilitaryPlaneFound() {

        boolean actual = airport
                .getMilitaryPlanes()
                .stream()
                .anyMatch(militaryPlane -> militaryPlane.getMilitaryType() == MilitaryType.TRANSPORT);

        Assert.assertTrue(actual);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity_ItIsPassengerPlaneWithMaxCapacity() {

        PassengerPlane expected = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);
        PassengerPlane actual = airport.getPassengerPlaneWithMaxPassengersCapacity();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortByMaxLoadCapacity_NextMaxCapacityIsHigherThenPrevious() {

        List<? extends Plane> planes = airport.sortByMaxLoadCapacity();
        boolean actual = true;
        int minLoadCapacity = planes.get(0).getMaxLoadCapacity();
        for (Plane plane : planes) {
            if (plane.getMaxLoadCapacity() >= minLoadCapacity) {
                minLoadCapacity = plane.getMaxLoadCapacity();
            } else {
                actual = false;
                break;
            }
        }
        Assert.assertTrue(actual);
    }

    @Test
    public void testGetMilitaryPlanes_BomberMilitaryPlaneFound() {

        boolean actual = airport
                .getMilitaryPlanes()
                .stream()
                .anyMatch(militaryPlane -> militaryPlane.getMilitaryType() == MilitaryType.BOMBER);

        Assert.assertTrue(actual);
    }

    @Test
    public void getExperimentalPlanes_ExperimentalPlanesDoesNotContainUnclassifiedAccessType() {

        boolean actual = airport
                .getExperimentalPlanes()
                .stream()
                .anyMatch(experimentalPlane -> experimentalPlane.getAccessType() == AccessType.UNCLASSIFIED);

        Assert.assertFalse(actual);
    }

}
