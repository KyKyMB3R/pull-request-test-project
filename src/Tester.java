public class Tester {

    public static void main(String[] args) throws Exception {
        getLengthZeroToWaypoint();
        getLengthWaypointToWaypoint();
        addWaypointTest();
        getLengthZeroWaypoints();
        getLengthWaypointToWaypointToWaypoint();
    }

    public static void getLengthZeroToWaypoint() throws Exception {
        Path test = new Path();
        test.addWaypoint(2, 1);
        double expectedResult = Math.sqrt(5);
        double testResult = test.getLength();
        if (testResult != expectedResult) {
            throw new Exception("getLengthZeroToWaypoint: Expected result: " + expectedResult + " current: " + testResult);
        }
    }

    public static void getLengthWaypointToWaypoint() throws Exception {
        Path test = new Path();
        test.addWaypoint(3, 4);
        test.addWaypoint(5, 5);
        double testResult = test.getLength();
        double expectedResult = Math.sqrt(25) + Math.sqrt(5);
        if (testResult != expectedResult) {
            throw new Exception("getLengthWaypointToWaypoint: Expected result: " + expectedResult + " current: " + testResult);

        }
    }

    public static void addWaypointTest() throws Exception {
        Path test = new Path();
        test.addWaypoint(3, 1);
        Waypoint testResult = test.getWaypoints().getFirst();
        Waypoint expectedResult = new Waypoint(3, 1);
        if (!testResult.equals(expectedResult)) {
            throw new Exception("addWaypointTest: Expected result: " + expectedResult + " current: " + testResult);
        }
    }

    public static void getLengthZeroWaypoints() throws Exception {
        Path test = new Path();
        double expectedResult = 0;
        double testResult = test.getLength();
        if (testResult != expectedResult) {
            throw new Exception("getLengthZeroWaypoints: Expected result: " + expectedResult + " current: " + testResult);
        }
    }
    public static void getLengthWaypointToWaypointToWaypoint() throws Exception {
        Path test = new Path();
        test.addWaypoint(1, 1);
        test.addWaypoint(2, 2);
        test.addWaypoint(3, 3);
        double testResult = test.getLength();
        double expectedResult = Math.sqrt(2) + Math.sqrt(2) + Math.sqrt(2);
        if (testResult != expectedResult) {
            throw new Exception("getLengthWaypointToWaypoint: Expected result: " + expectedResult + " current: " + testResult);

        }
    }


}
