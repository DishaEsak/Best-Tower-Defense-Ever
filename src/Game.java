import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    int userMoney;
    ArrayList<Enemy> enemyList;
    ArrayList<Tower> towerList;
    ArrayList<Bullet> bulletList;
    int timer, timer2;
    int add;

    public void settings() {
        size(1000, 800);

    }

    public void setup() {
        userMoney = 1000;
        timer = 40;
        timer2 = 50;
        enemyList = new ArrayList<>();
        towerList = new ArrayList<>();
        bulletList = new ArrayList<>();
        add = 50;
    }

    public void draw() {
        background(color(248, 131, 121));
        timer--;
        timer2--;
        fill(color(218, 112, 214));
        rect(0, 400, 1000, 100);
        if (timer2 <= 0){
            for (int i = 0; i < towerList.size() - 1; i++) {
                Tower currTower = towerList.get(i);
                Bullet currBullet = new Bullet(currTower.getX() + 50, currTower.getY(), 5, (int)(Math.random()*10+5), (int)(Math.random()*10+5));
                bulletList.add(currBullet);
                timer2 = 50;
            }

        }
        if (timer <= 0) {
            Enemy enemy = new Enemy(50, 0, 450, 5);
            enemyList.add(enemy);
            timer = 40;
        }
        for (Enemy e : enemyList) {
            e.draw(this);
            e.move();
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
        }
        for (Tower t : towerList) {
            t.draw(this);
        }
    }
        public static void main (String[]args){
            PApplet.main("Game");
        }
    }
