package volcano.simulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimulatorTest {

    Simulator simulator;

    public void before() {
        //simulator = new VolcanoSimulator();
    }

    @Test
    public void getDaysToFirstAirportClosed_firstMapOneAirport_shouldReturnFiveDays() {
        assertEquals(5, simulator.getDaysToFirstAirportClosed(TestMaps.getFirstMapWithOneAirport()));
    }

    @Test
    public void getDaysToFirstAirportClosed_firstMapTwoAirports_shouldReturnFiveDays() {
        assertEquals(5, simulator.getDaysToFirstAirportClosed(TestMaps.getFirstMapWithOneAirport()));
    }

    @Test
    public void getDaysToFirstAirportClosed_firstMapThreeAirports_shouldReturnFiveDays() {
        assertEquals(5, simulator.getDaysToFirstAirportClosed(TestMaps.getFirstMapWithOneAirport()));
    }

}
