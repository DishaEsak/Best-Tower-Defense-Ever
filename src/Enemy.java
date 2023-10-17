import processing.core.PApplet;

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
}
