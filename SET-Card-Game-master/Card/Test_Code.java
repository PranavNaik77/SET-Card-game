package Card;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test_Code {

    public static List<Card> addAllCards(){
        ArrayList<Card> board=new ArrayList<>();
        // File path is passed as parameter
        File file = new File(
                "C:\\Users\\naikp\\Downloads\\SET-Card-Game-master\\SET-Card-Game-master\\Card_info.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null){
                char c=st.charAt(0);
                if(!Character.isDigit(c)){
                    Card cd=new Card(st);
                    board.add(cd);
                }
            }
        }
        catch (Exception e) {
            System.out.print("Invalid Input format");
        }
        return board;
    }
    public static void playSET() {


        // add all cards to the board
        List<Card> board=addAllCards();
        List<ArrayList<Card>> Totalsets =  SetMethods.findTotalsets(board);
        List<ArrayList<Card>> Disjointsets= SetMethods.findDisjointsets(Totalsets, board);
        System.out.println(Totalsets.size());
        //int i=0;
        System.out.println(Disjointsets.size());

        for (List<Card> list : Disjointsets) {
            System.out.print("  [");

            for (Card item : list) {
                System.out.print(" "+ item +",");
            }
            System.out.println("] ");
        }
    }
    public static void main(String[] args){
        // Play the SET game
        playSET();
    }
}

