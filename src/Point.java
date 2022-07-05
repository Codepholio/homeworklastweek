public class Point {
    private int x;
    private int y;

    public Point(){
    x= 0;
    y=0;
    }
    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;

    }
    public String toString(){
        return "(" + this.x + ", " + this. y + ") ";
    }
    public double distance(Point point){
        double s1 = this.x - point.x;
        double s3 = this.x - point.y;
        return Math.sqrt(Math.pow(s1,2) + Math.pow(s3,2));
    }
}

