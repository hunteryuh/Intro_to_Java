// RectangleList class manages a list of Rectangles
// It has a constructor that takes an array list of Rectangles as a parameter.
// It has a method to return the Rectangle with the smallest area
// (or null if the list is empty)
//
// The class is started for you. You are to complete the class.
//
// This class uses the Rectangle class from the graphics package.
// It has the getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.

import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

   /**
    * Constructs a Rectangle list to manage this list of Rectangles
    * @param theList the lest of Rectangles to manage
    */
    public RectangleList(ArrayList<Rectangle> theList)
    {
        list = theList;
    }

   /**
    * Gets the Rectangle with the smallest area
    * @return the rectangle with the smallest area or null if
    * there are no rectangles
    *
    */
    public Rectangle smallestArea()
    {
        //TODO: implement this method
        if (list.size() == 0) {
            return null;
        } else{
            Rectangle smallestRec = list.get(0);
            for (int i = 1; i< list.size(); i++){
                if ( list.get(i).getWidth()* list.get(i).getHeight() < smallestRec.getWidth()* smallestRec.getHeight()){
                    smallestRec = list.get(i);
                }
                
            }
            return smallestRec;
        }
        
    }

}
// done on 1/10/2017
