package Card;

import java.util.ArrayList;
import java.util.List;

/**
 * // This class contains all the SET operations/ methods.
 */

/**
 * @author Laxmikant
 *
 */



public class SetMethods {
    static int countSET = 0;

    // Method to find whether three cards make a SET
    public static boolean isSET(Card c1, Card c2, Card c3) {
        int flag = 0;

        // Check Color
        if (((c1.Color.equals(c2.Color)) && (c2.Color.equals(c3.Color))) ||

                (!(c1.Color.equals(c2.Color)) && !(c2.Color.equals(c3.Color)) && !(c1.Color.equals(c3.Color)))

        ) {
            flag++;
        }

        // Check Shape
        if (((c1.Symbol.equals(c2.Symbol)) && (c2.Symbol.equals(c3.Symbol))) ||

                (!(c1.Symbol.equals(c2.Symbol)) && !(c2.Symbol.equals(c3.Symbol)) && !(c1.Symbol.equals(c3.Symbol)))

        ) {
            flag++;
        }

        // Check Shading
        if (((c1.Shade.equals(c2.Shade)) && (c2.Shade.equals(c3.Shade))) ||

                (!(c1.Shade.equals(c2.Shade)) && !(c2.Shade.equals(c3.Shade)) && !(c1.Shade.equals(c3.Shade)))

        ) {
            flag++;
        }

        // Check Number
        if (((c1.Number == c2.Number) && (c2.Number == c3.Number)) ||

                ((c1.Number != c2.Number) && (c2.Number != c3.Number) && (c1.Number != c3.Number))

        ) {
            flag++;
        }

        if (flag == 4) {
            return true;
        }
        //System.out.println(flag);
        return false;

    }

    // Method to check to find a SET from the cards on board
    public static List<ArrayList<Card>> findTotalsets(List<Card> board) {
        // System.out.println("Inside Findset")

        List<ArrayList<Card>> totalsets = new ArrayList<ArrayList<Card>>();
        for (int i = 0; i < board.size(); i++) {
            for (int j = i + 1; j < board.size(); j++) {
                for (int k = j + 1; k < board.size(); k++) {
                    // if SET found, then add to FOUND List.
                    if (isSET(board.get(i), board.get(j), board.get(k))) {


                        countSET++;

                        // add to FOUND list

                        // add to totalsets
                        ArrayList<Card> set = new ArrayList<Card>();
                        set.add(board.get(i));
                        set.add(board.get(j));
                        set.add(board.get(k));
                        totalsets.add(set);

                    }
                }
            }
        }
        return totalsets;
    }

    public static List<ArrayList<Card>> findDisjointsets(List<ArrayList<Card>> Totalsets, List<Card> board) {
        List<ArrayList<Card>> disjointsets = new ArrayList<>();
        for (ArrayList<Card> set : Totalsets) {
            int count = 0;
            for (Card c : set) {
                if (board.contains(c))
                    count++;
            }
            if (count == 3) {
                disjointsets.add(set);
                board.removeAll(set);
            }
        }
        return disjointsets;
    }
}
