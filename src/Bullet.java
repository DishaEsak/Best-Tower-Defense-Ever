import processing.core.PApplet;

public class Bullet {
    private int x, y;
    private int radius;
    private int xSpeed, ySpeed;

    public Bullet(int x, int y, int r, int xs, int ys){
        this.x = x;
        this.y = y;
        this.radius = r;
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    public void draw(PApplet window){
        window.fill(0,0,255);
        window.ellipse(x, y, radius, radius);
    }

    public void move(){
        x += xSpeed;
        y += ySpeed;
    }

    public void setX(int newx){
        this.x = newx;
    }

    public void setY(int newy){
        this.y = newy;
    }

    public void reset(int newx, int newy){
        if(this.y == 300){
            this.y = newy;
            this.x = newx;
        }
    }
}
