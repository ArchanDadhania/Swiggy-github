




public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight(){
        while(player1.isAlive() && player2.isAlive()){
            if(player1.getHealth() <= player2.getHealth()){
                turn(player1,player2);
                if(!player1.isAlive()) break;
                turn(player2,player1);
            }else {
                turn(player2,player1);
                if(!player1.isAlive()) break;
                turn(player1,player2);
            }
        }
        if(player1.isAlive()){
            System.out.println("Player 1 is win....!!!!");
        }else {
            System.out.println("Player 2 is win....!!!!");
        }
    }

    public void turn(Player attacker, Player defender){
        int attackRoll = attacker.rollAttackDice();
        int defenseRoll = defender.rollDefenceDice();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = attacker.getStrength() * defenseRoll;

        int damageDealt = attackDamage - defenseStrength;

        if (damageDealt > 0) {
            defender.takeDamage(damageDealt);
        }

        System.out.println("Attacker's attack roll: " + attackRoll + ", Attack damage: " + attackDamage);
        System.out.println("Defender's defense roll: " + defenseRoll + ", Defense strength: " + defenseStrength);
        System.out.println("Defender's health: " + defender.getHealth());

    }
}
