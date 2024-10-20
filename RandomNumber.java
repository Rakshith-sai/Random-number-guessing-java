import java.util.*;
class Game{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    Random rd = new Random();
    int n = rd.nextInt();
    for(int i=0;i<5;i++){
      System.out.println("Enter the number\nChoice "+(i+1)+" :");
      int in = sr.nextInt();
      if(n==in){
        System.out.println("Congratulations..!! you have guessed the number: "+in);
        return;
      }if(Math.abs(n-in)<6 && i<4){
        System.out.println("You are near to the number");
      }
    }
    System.out.println("Sorry you did not guess the number\nBetter luck next time 😊"); 
  }
}
class RandomNumber{
  public static void main(String[] args){
    Game game = new Game();
  }
}
