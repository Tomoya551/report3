package org.example.jp.ac.uryukyu.ie.e245716;

public class Warrior extends Hero {

    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (!isDead()) {
            int damage = (int)(getAttack() * 1.5); // attackの150%
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",
                              getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

