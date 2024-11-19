import java.util.*;

class Point
{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "x"+x+" y="+y;
    }

    public int compareTo(Object o)
    {
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else{
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class treeSet {
    public static void main(String[] args)
    {
        TreeSet<Point> tp = new TreeSet<>();

        tp.add(new Point(1,1));
        tp.add(new Point(5,5));
        tp.add(new Point(5,2));

        System.out.println(tp);
    }
}
