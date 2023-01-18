import java.util.*;
public class rpc{
    public static void main(String[] args){
    Scanner rpc= new Scanner(System.in);
    System.out.print("Enter rock, paper or scissor or 'end' to discontinue:");
    String move= rpc.next();
    double pcmove = 0;
    String botmove="";
    if (move.equals("end")){
        System.out.println("Thanks for playing.");
    }
    
    else{
        if(move.equals("rock")){
            /*double move2=Math.random() * 3;
            pcmove=move2;
          if (pcmove==1){
            botmove="rock";
          }
          else if(pcmove==2){
             botmove="paper";
          }
          else if(pcmove==3){
            botmove="scissor";
          }
          if (botmove.equals(move)){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a tie.");
          }else if(botmove.equals("rock")&&move.equals("scissor")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a loss.");
          }else if(botmove.equals("scissor")&&move.equals("paper")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a loss.");
          }else if(botmove.equals("paper")&&move.equals("rock")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a loss.");
          }else if(botmove.equals("rock")&&move.equals("paper")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a win.");
          }else if(botmove.equals("paper")&&move.equals("scissor")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a win.");
          }else if(botmove.equals("scissor")&&move.equals("rock")){
            System.out.println("User move: "+move+". Bot move: "+botmove+" .It is a win.");
          }*/
          System.out.println(move);
       }
        else{
            System.out.println("The move is invalid.");
        }
    } 
  }
}