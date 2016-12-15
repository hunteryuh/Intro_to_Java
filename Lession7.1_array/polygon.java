//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;

public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    ArrayList<Point> polygon;
    
    public Polygon()
    {
        polygon = new ArrayList<Point>();
    }
    
    public void add(Point point){
        polygon.add(point);
    }
    
    public double perimeter(){
        double sum = 0;
        polygon.add(polygon.get(0));
        for (int i = 0; i<polygon.size()-1; i++){
            double difX = polygon.get(i+1).getX() - polygon.get(i).getX();
            double difY = polygon.get(i+1).getY() - polygon.get(i).getY();
            sum+= Math.sqrt(difX * difX + difY * difY);
        }
        return sum;
    }
    public void draw(){
        Line line;
        polygon.add(polygon.get(0));
        for (int i = 0; i<polygon.size()-1; i++){
            double x0 = polygon.get(i).getX();
            double y0 = polygon.get(i).getY();
            double x1 = polygon.get(i+1).getX();
            double y1 = polygon.get(i+1).getY();
            line = new Line(x0,y0,x1,y1);  // point 0 first, point 1 second
            line.draw();
        }
        
    }
    
}
