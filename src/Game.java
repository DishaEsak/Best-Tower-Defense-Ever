import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    int userMoney;
    ArrayList<Enemy> enemyList;
    ArrayList<Tower> towerList;
    ArrayList<Bullet> bulletList;
    int timer;
    int add;

    public void settings() {
        size(1000, 800);

    }

    public void setup() {
        userMoney = 1000;
        timer = 0;
        enemyList = new ArrayList<>();
        towerList = new ArrayList<>();
        bulletList = new ArrayList<>();
        add = 50;
    }

    public void draw() {
        background(color(248, 131, 121));
        timer++;
        fill(color(218, 112, 214));
        rect(0, 400, 1000, 100);
        if (timer <= 100){
            for (int i = 0; i < towerList.size() - 1; i++) {
                Tower currTower = towerList.get(i);
                Bullet currBullet = new Bullet(currTower.getX(), currTower.getY(), 5, (int)(Math.random()*10+5), (int)(Math.random()*10+5));
                bulletList.add(currBullet);
            }
        }
        if (timer <= 50) {
            Enemy enemy = new Enemy(50, 0, 450, 5);
            enemyList.add(enemy);
            timer = 80;
        }
        for (int i = 50; i < 1000; i += 200) {
            Tower tower1 = new Tower(i, 500, 100, 100);
            towerList.add(tower1);
            Tower tower2 = new Tower(i, 300, 100, 100);
            towerList.add(tower2);
        }
        for (Bullet b : bulletList) {
            b.draw(this);
            b.move();
            b.reset(towerList.get(0).getX(), towerList.get(0).getY());
        }
        for (Enemy e : enemyList) {
            e.draw(this);
            e.move();
        }
        for (Tower t : towerList) {
            t.draw(this);
        }
    }
        public static void main (String[]args){
            PApplet.main("Game");
        }
    }
