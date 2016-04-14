package volcano.simulator;

import volcano.map.GroundMap;

public interface Simulator {

    int getDaysToFirstAirportClosed(GroundMap groundMap);

    int getDaysToAllAirportClosed(GroundMap groundMap);

}
