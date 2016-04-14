package volcano.map.impl;

import volcano.map.Airport;
import volcano.map.GroundMap;
import volcano.map.VolcanoAsh;

import java.util.ArrayList;
import java.util.List;

public class GroundMapImpl implements GroundMap {

    private List<VolcanoAsh> volcanoAshList = new ArrayList<VolcanoAsh>();

    private List<Airport> airportList = new ArrayList<Airport>();

    @Override
    public void addVolcanoAsh(VolcanoAsh volcanoAsh) {
        this.volcanoAshList.add(volcanoAsh);
    }

    @Override
    public void addAirport(Airport airport) {
        this.airportList.add(airport);
    }


    @Override
    public GroundMap getNextDayMap() {
        GroundMap groundMap = new GroundMapImpl();]
        for (Airport anAirport : this.airportList) {
            groundMap.addAirport(anAirport);
        }
        for (VolcanoAsh aVolcanoAsh : this.volcanoAshList) {
            groundMap.addAirport(anAirport);
        }
        return groundMap;
    }
}
