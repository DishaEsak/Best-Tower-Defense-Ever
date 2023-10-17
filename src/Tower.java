import processing.core.PApplet;

public class Tower {
    private int x, y;
    private int height, width;

    public Tower(int x, int y, int h, int w){
        this.x = x;
        this.y = y;
        this.height = h;
        this.width = w;
    }

    public void draw(PApplet window){
        window.fill(25,0,0);
        window.rect(x, y, width, height);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
