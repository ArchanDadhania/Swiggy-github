import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }
    public int rollAttackDice(){
        return random.nextInt(6) + 1;
    }

    public int rollDefenceDice(){
        return random.nextInt(6) + 1;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth(){
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public int getAttack(){
        return attack;
    }
}
