
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void testGo() {
        Vehicle vehicle = new Vehicle("テスト車", "赤");
        vehicle.setVelocity(5);

        vehicle.go(3);

        assertEquals(15, vehicle.getX());
    }

    @Test
    void testBack() {
        Vehicle vehicle = new Vehicle("テスト車", "赤");
        vehicle.setVelocity(5);
        vehicle.go(3);

        vehicle.back(2);

        assertEquals(5, vehicle.getX());
    }

    @Test
    void testDiff() {
        Vehicle vehicle = new Vehicle("テスト車", "赤");

        assertEquals(10, vehicle.diff(15, 5));
    }
}
