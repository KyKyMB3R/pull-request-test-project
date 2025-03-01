import java.util.ArrayList;
import java.util.List;

/**
 * Represents a path that consists of multiple waypoints.
 */
public class Path {

    private final List<Waypoint> waypoints = new ArrayList<>();

    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }

    /**
     * @return Length of the path when you connect all the waypoints
     */
    public double getLength() {
        Waypoint prevWaypoint = waypoints.getFirst();
        double distance = 0;
        for (int i = 1; i < waypoints.size(); i++) {
            Waypoint currentWaypoint = waypoints.get(i);
            distance += prevWaypoint.distanceTo(currentWaypoint);
            prevWaypoint = currentWaypoint;
        }

        return distance;
    }

}
