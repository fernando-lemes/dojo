package volcano.map;

public interface GroundMap {

    void addVolcanoAsh(VolcanoAsh volcanoAsh);

    void addAirport(Airport airport);

    GroundMap getNextDayMap();

}
