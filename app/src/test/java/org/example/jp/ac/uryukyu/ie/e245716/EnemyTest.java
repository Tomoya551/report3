package org.example.jp.ac.uryukyu.ie.e245716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnemyTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Hero demoHero = new Hero("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);

        // デモ勇者がスライムを攻撃
        demoHero.attack(slime);

        // スライムの攻撃を確認（スライムは倒れているため攻撃できない）
        slime.attack(demoHero);

        // 勇者のHPが減っていないことを確認
        assertTrue(demoHero.isDead() == false, "勇者は攻撃を受けていないので生存しているはず");
    }
}
