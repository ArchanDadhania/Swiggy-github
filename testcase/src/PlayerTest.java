import org.junit.Test;
import static org.junit.Assert.*;



public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player(100, 10, 20);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(20, player.getAttack());
    }

    @Test
    public void testRollAttackDice() {
        Player player = new Player(100, 10, 20);
        int roll = player.rollAttackDice();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void testRollDefenseDice() {
        Player player = new Player(100, 10, 20);
        int roll = player.rollDefenceDice();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player(100, 10, 20);
        player.takeDamage(30);
        assertEquals(70, player.getHealth());
        player.takeDamage(100);
        assertEquals(0, player.getHealth());  // Health should not go below 0
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(100, 10, 20);
        assertTrue(player.isAlive());
        player.takeDamage(100);
        assertFalse(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive());  // Health should not go below 0, and isAlive should remain false
    }


}
