package org.example.jp.ac.uryukyu.ie.e245716;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    
    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.name, damage);
        e.wounded(damage);
    }


    /**
     * 敵から攻撃を受けた際のダメージ処理。
     * HPを減らし、HPが0以下になったら死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        if (dead) {
            System.out.printf("%sはすでに倒れています。\n", name);
            return;
        }

        hitPoint = Math.max(hitPoint - damage, 0);
        System.out.printf("%sは%dのダメージを受けた！ 残りHP: %d\n", name, damage, hitPoint);

        if (hitPoint == 0) {
            dead = true;
            System.out.printf("勇者%sは倒れた。\n", name);
        }
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isDead() {
        return dead;
    }
}
