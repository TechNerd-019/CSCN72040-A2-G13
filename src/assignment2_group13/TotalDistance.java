


import java.util.Scanner;


public class TotalDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial coordinates
        double[] initialCoordinates = {0, 0};

        // Get user input for initial coordinates
        System.out.print("Enter initial x-coordinate: ");
        double initialX = scanner.nextDouble();
        System.out.print("Enter initial y-coordinate: ");
        double initialY = scanner.nextDouble();

        // Update initial coordinates
        initialCoordinates[0] = initialX;
        initialCoordinates[1] = initialY;

        // Calculate distance from the origin
        double initialDistance = calculateDistance(initialCoordinates[0], initialCoordinates[1]);
        System.out.println("Distance from the origin: " + initialDistance);

        // Ask for new coordinates
        System.out.print("Enter new x-coordinate: ");
        double newX = scanner.nextDouble();
        System.out.print("Enter new y-coordinate: ");
        double newY = scanner.nextDouble();

        // Calculate distance from the previous point
        double distanceFromPrevious = calculateDistance(newX, newY, initialCoordinates[0], initialCoordinates[1]);
        System.out.println("Distance from the previous point: " + distanceFromPrevious);

        scanner.close();
    }

    // Calculate distance from the origin
    private static double calculateDistance(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    // Calculate distance from the previous point
    private static double calculateDistance(double newX, double newY, double prevX, double prevY) {
        double deltaX = newX - prevX;
        double deltaY = newY - prevY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
