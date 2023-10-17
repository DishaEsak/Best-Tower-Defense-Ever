import processing.core.PApplet;

import static java.awt.geom.Point2D.distance;

public class Enemy {
    private int radius;
    private int x, y;
    private int xSpeed;

    public Enemy(int r, int x, int y, int xs){
        this.radius = r;
        this.x = x;
        this.y = y;
        this.xSpeed = xs;
    }

    public void draw(PApplet window){
        window.fill(255,0,0);
        window.ellipse(x, y, radius, radius);
    }

    public void move(){
        x += xSpeed;
    }

    public boolean collidingBullet (Bullet other){
        return this.radius + other.radius <= distance(this.x, this.y, other.x, other.y);
    }

    private double distance (float x1, float y1, float x2, float y2){
        float dx = x1 - x2;
        float dy = y1 - y2;
        return dy/dx;
    }
}
