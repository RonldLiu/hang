import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
   private String word; 
   private String guesses;
   private boolean isSolved;
   public Puzzle(){
       word = "Puzzle".toUpperCase();
       isSolved = false;
       guesses = "";
   }
   public boolean isUnsolved(){
       return !isSolved;
   }
   public void show(){
       System.out.print("Puzzel:");
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < guesses.length(); j++){
                if(word.charAt(i) == guesses.charAt(j)){
                    System.out.print(word.charAt(i)+" ");
                }else{
                    System.out.print("_ ");
                }
            }
        }
        System.out.println();
        System.out.print("Guesses:");
        for(int i = 0; i < guesses.length(); i++){
            System.out.print(guesses.charAt(i)+", ");
        }
        System.out.print("Make a guess:");
   }
   public boolean makeGuess(String s){
        s = s.toUpperCase();
        guesses += s;
        return false;
   }
   public String getWord(){
     return word.toUpperCase();  
   }
}
