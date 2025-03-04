import java.util.ArrayList;
import java.util.List;

/**
 * Represents a path that consists of multiple waypoints.
 */
public class Path {

    private final List<Waypoint> waypoints = new ArrayList<>();

    public void addWaypoint(int x, int y) {
        Waypoint waypoint = new Waypoint(x, y);
        waypoints.add(waypoint);
    }

    /**
     * @return Length of the path when you connect all the waypoints
     */
    public double getLength() {
        if (waypoints.isEmpty()) {
            return 0;
        }
        Waypoint prevWaypoint = waypoints.getFirst();
        double distance = 0;
        if (waypoints.size() > 1) {
            for (int i = 1; i < waypoints.size(); i++) {
                Waypoint currentWaypoint = waypoints.get(i);
                distance += prevWaypoint.distanceTo(currentWaypoint);
                prevWaypoint = currentWaypoint;
            }
            return distance;
        }
        if (waypoints.size() == 1) {
            return prevWaypoint.distanceToZeroCord(waypoints.getFirst());
        }
        return distance;
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }
}

