public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public void drawPoint(){
        System.out.println("the point is: x = " + this.x + " y = " + this.y);
    }

    //using
    public Point center(Point anotherPoint){
        return new Point((this.x + anotherPoint.x)/2, (this.y + anotherPoint.y)/2);
    }

    public Point scale(){
        return new Point(this.x/2, this.y/2);
    }
}
