package org.example.jp.ac.uryukyu.ie.e245716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    void attackWithWeponSkillTest() {
        Warrior warrior = new Warrior("テスト戦士", 100, 20);
        Enemy dummyEnemy = new Enemy("ダミー", 100, 10);

        // attackの150%が計算されるかを3回確認
        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int)(20 * 1.5); // attack = 20
            warrior.attackWithWeponSkill(dummyEnemy);
            assertEquals(100 - expectedDamage * (i + 1), dummyEnemy.getHitPoint(), 
                         "ダメージが正しく計算されていません");
        }
    }
}
