package tcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FruitBowl {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static long crossProduct(Point p1, Point p2, Point p3) {
        // Using long to prevent potential integer overflow with large coordinates
        return (long) (p2.x - p1.x) * (p3.y - p1.y) - (long) (p2.y - p1.y) * (p3.x - p1.x);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read input
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        // 2. Sort points: primarily by x-coordinate, secondarily by y-coordinate
        Collections.sort(points, (p1, p2) -> {
            if (p1.x != p2.x) {
                return Integer.compare(p1.x, p2.x);
            } else {
                return Integer.compare(p1.y, p2.y);
            }
        });

        // 3. Build the lower convex hull (the bowl)
        List<Point> lowerHull = new ArrayList<>();
        for (Point p : points) {
            // Keep removing the last point from the hull while the new point `p`
            // makes a clockwise turn or is collinear with the last two points.
            // This ensures the hull is always convex.
            while (lowerHull.size() >= 2 && crossProduct(lowerHull.get(lowerHull.size() - 2), lowerHull.get(lowerHull.size() - 1), p) <= 0) {
                lowerHull.remove(lowerHull.size() - 1);
            }
            lowerHull.add(p);
        }

        // 4. Calculate the perimeter of the bowl
        double perimeter = 0.0;
        for (int i = 0; i < lowerHull.size() - 1; i++) {
            perimeter += distance(lowerHull.get(i), lowerHull.get(i + 1));
        }

        // 5. Round to the nearest integer and print the output
        System.out.println(Math.round(perimeter));

        sc.close();
    }
}
