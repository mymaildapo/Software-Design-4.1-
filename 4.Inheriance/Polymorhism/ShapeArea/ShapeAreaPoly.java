class Shape
    {
        protected int width;
        public Shape(int w) { width = w; }
        :
    }
public class ShapeAreaPoly
{
  public static void main(String[] args)
  {
     Shape []s = new Shape[2];
     s[0] = new Square(5);
     s[1] = new Rectangle(2, 4);
     for (int i = 0; i < 2; i++)
     {
         System.out.println("Area of shape "+(i+1)+" :" +  s[i].calculateArea());
     }
  }
}
