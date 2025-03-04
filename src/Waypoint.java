/**
 * Represents a 2D point in space with two coordinates
 */
public record Waypoint(int x, int y) {

    public double distanceTo(Waypoint otherWaypoint) {
        int dx = otherWaypoint.x - x;
        int dy = otherWaypoint.y - y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
