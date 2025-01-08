package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    /* IMPLEMENT ME */
      double diffinx = other.getX() - x;
      double diffiny = other.getY() - y;
      return Math.pow(Math.pow(diffinx, 2) + Math.pow(diffiny, 2), 0.5);
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
   /* IMPLEMENT ME */
      return "(" + x + ", " + y + ")";
  }


  public int getX() {
      return x;
  }
  public int getY() {
      return y;
  }

  public void setX(int newx) {
    x = newx;
  }
  public void setY(int newy) {
    y = newy;
  }
}

  