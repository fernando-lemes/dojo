package volcano.simulator;

import volcano.map.GroundMap;
import volcano.map.impl.GroundMapImpl;

public class TestMaps {

    public static GroundMap getFirstMapWithOneAirport() {
        GroundMapImpl map = new GroundMapImpl(10, 10);
        map.addVolcanoAshAt(1, 1);
        map.addAirportAt(6, 6);
        return map;
    }

    public static GroundMap getFirstMapWithTwoAirports() {
        GroundMapImpl map = new GroundMapImpl(10, 10);
        map.addVolcanoAshAt(1, 1);
        map.addAirportAt(4, 2);
        map.addAirportAt(6, 6);
        return map;
    }

    public static GroundMap getFirstMapWithThreeAirports() {
        GroundMapImpl map = new GroundMapImpl(10, 10);
        map.addVolcanoAshAt(1, 1);
        map.addAirportAt(4, 2);
        map.addAirportAt(6, 6);
        map.addAirportAt(8, 5);
        return map;
    }

}
