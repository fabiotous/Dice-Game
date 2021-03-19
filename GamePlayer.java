
package gamedice;

public class GamePlayer {
  public String name;
  public int points = 0;
  public int wins = 0;
  public int losses = 0;
  
  public GamePlayer()
  {
    
  }
  
  public GamePlayer(String n)
  {
    name = n;
  }
  
  public void setPoints(int i, int j)
  {
    //You must implement
    //Method is used after each turn
      if((i + j == 3) || (i + j == 9))
      {
        
          points = points - (i+j);
          
      }
      else if(i + j == 5 || i == j)
      {
          points = points + (i + j);
      }
      
      if(points < 0){
          points = 0;
      }
  }
  
  
    public void setPoints(int i)
  {
    //You must implement
    //Method is used after each game
      points = i;
  }
  
  public int getPoints()
  {
    return points;
  }
  
  public void setName(String n)
  {
    name = n;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void increaseWins()
  {
    wins++;
  }
  public int getWins()
  {
    return wins;
  }
  public void increaseLosses()
  {
    //You must implement
      losses++;
  }
  public int getLosses()
  {
    //You must implement
    
    //delete this
    return losses;
    
    //But remember you still need a return statement
  }
  public void printRecord()
  {
    //Prints out the player's record (amount of wins and losses)
    //You must implement
      System.out.println("Player " + name + " has " + wins +" wins and "+ losses +" losses.");
  }
}
