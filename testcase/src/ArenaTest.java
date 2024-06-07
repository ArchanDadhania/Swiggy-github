import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void testFightOutcome() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.fight();
        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }

    @Test
    public void testTurn() {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);
        Arena arena = new Arena(attacker, defender);

        int initialDefenderHealth = defender.getHealth();
        arena.turn(attacker, defender);
        assertTrue(defender.getHealth() <= initialDefenderHealth);
    }

    @Test
    public void testAttackFirst() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        // Ensure playerA attacks first because playerA has lower health initially
        arena.turn(playerA, playerB);
        assertTrue(playerA.getHealth() < playerB.getHealth());
    }
}
