package org.example.jp.ac.uryukyu.ie.e245716;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (isDead()) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
