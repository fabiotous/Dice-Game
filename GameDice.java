
package gamedice;

public class GameDice {

    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer("Fabio");
        GamePlayer player2 = new GamePlayer("Paul");
        
        Dice dice = new Dice();
        
        int dicenum = 0;
        int dicenum2 = 0;
        int dice2num = 0;
        int dice2num2 = 0;
        
        
        while(player1.getWins() < 5 && player2.getWins() < 5){
            while(player1.getPoints() < 50 && player2.getPoints() < 50){
            dicenum = dice.roll();
            dicenum2 = dice.roll();
            player1.setPoints(dicenum, dicenum2);
            
            dice2num = dice.roll();
            dice2num2 = dice.roll();
            player2.setPoints(dice2num, dice2num2);
            
            System.out.println("Player 1: \nName: " + player1.getName() + "\nRolls: " + dicenum + ", " + dicenum2 + 
                    "\nSlang: " + dice.printSlang(dicenum, dicenum2) + "\n"
                    + "Updated Points: " + player1.getPoints());
            
            System.out.println("Player 2: \nName: " + player2.getName() + "\nRolls: " + dice2num + ", " + dice2num2 +
                    "\nSlang: " + dice.printSlang(dice2num, dice2num2)+"\n"
                    + "Updated Points: " + player2.getPoints());
            }
    
            if(player1.getPoints() > player2.getPoints()){
                player1.increaseWins();
                player2.increaseLosses();
                
                player1.setPoints(0);
                player2.setPoints(0);
            }
            else if(player2.getPoints() > player1.getPoints()){
                player2.increaseWins();
                player1.increaseLosses();
                player1.setPoints(0);
                player2.setPoints(0);
                
            }
            else{
                
                player1.setPoints(0);
                player2.setPoints(0);
            }
            
             
            
        }
        
        player1.printRecord();
        player2.printRecord();
        
    }
    
   
}
