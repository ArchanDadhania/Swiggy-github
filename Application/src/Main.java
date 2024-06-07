import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Get Player A attributes
        System.out.println("Enter Player A attributes:");
        System.out.print("Health: ");
        int playerAHealth = scanner.nextInt();
        System.out.print("Strength: ");
        int playerAStrength = scanner.nextInt();
        System.out.print("Attack: ");
        int playerAAttack = scanner.nextInt();


        // Get Player B attributes
        System.out.println("Enter Player B attributes:");
        System.out.print("Health: ");
        int playerBHealth = scanner.nextInt();
        System.out.print("Strength: ");
        int playerBStrength = scanner.nextInt();
        System.out.print("Attack: ");
        int playerBAttack = scanner.nextInt();


        // Create players
        Player playerA = new Player(playerAHealth, playerAStrength, playerAAttack);
        Player playerB = new Player(playerBHealth, playerBStrength, playerBAttack);


        // Create arena and start the fight
        Arena arena = new Arena(playerA, playerB);
        arena.fight();
    }
}