// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.lang.Math;
public class Rectangle
{
  Point origin;
  int width;
  int height;
  public Rectangle()
  {
    origin=new Point();
    width=0;
    height=0;
  }
  public Rectangle (Point bl, Point tr)
  {
    origin=bl;
    height=tr.y-bl.y;
    width=tr.x-bl.y;
  }
  public Rectangle(Point bl, int x, int y)
  {
    origin=bl;
    width=bl.x-x;
    height=bl.y-y;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point tr=new Point();
    tr.x=origin.x+width;
    tr.y=origin.y+height;
    return tr;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return Math.sqrt((height*height)+(width*width));
  }
  public int perimeter()
  {
    return (2*width)+(2*height);
  }
  public boolean isSquare()
  {
    if(width!=height)
    {
    return false;
    }
    else
    {
      return true;
    }
  }
  public String toString()
  {
    return "["+origin.toString()+","+getTopRight().toString()+"]";
  }
  public void translate(int x, int y)
  {
    origin.x+=x;
    origin.y+=y;
  }
  public void scale (int dx, int dy)
  {
    width+=dx;
    height+=dy;
  }
}
