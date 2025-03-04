public class Tester {

    public static void main(String[] args) throws Exception {
        getLengthZeroToWaypoint();
        getLengthWaypointToWaypoint();
        addWaypointTest();
        getLengthZeroWaypoints();
    }

    public static void getLengthZeroToWaypoint() throws Exception {
        Path test = new Path();
        test.addWaypoint(2, 1);
        double expectedResult = 2.23606797749979;
        double testResult = test.getLength();
        if (testResult != expectedResult) {
            throw new Exception("Exception in getLengthZeroToWaypoint (test 1)");
        }
    }

    public static void getLengthWaypointToWaypoint() throws Exception {
        Path test = new Path();
        test.addWaypoint(3, 1);
        test.addWaypoint(5, 2);
        double expectedResult = 2.23606797749979;
        double testResult = test.getLength();
        if (testResult != expectedResult) {
            throw new Exception("Exception in getLengthWaypointToWaypoint (test 2)");
        }
    }

    public static void addWaypointTest() throws Exception {
        Path test = new Path();
        test.addWaypoint(3, 1);
        Waypoint testResult = test.getWaypoints().getFirst();
        Waypoint expectedResult = new Waypoint(3, 1);
        if (!testResult.equals(expectedResult)) {
            throw new Exception("Exception in addWaypointTest (test 3)");
        }
    }

    public static void getLengthZeroWaypoints() throws Exception {
        Path test = new Path();
        double expectedResult = 0;
        double testResult = test.getLength();
        if (testResult != expectedResult) {
            throw new Exception("Exception in getLengthZeroWaypoints (test 4)");
        }
    }


}
