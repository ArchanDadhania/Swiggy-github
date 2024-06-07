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
}
