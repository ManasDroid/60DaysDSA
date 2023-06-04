package Day1;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Long>> printPascal(int numRows) {
        ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();

        ArrayList<Long> row , previous = null;
        for(int i=0; i<numRows; i++){
            row = new ArrayList<>();
            for(int  j =0; j<=i; j++){
                if(j==0 || j==i) row.add((long)1);
                else row.add(previous.get(j-1)+previous.get(j));
            }
            previous = row;
            res.add(row);
        }
        return res;
    }
}
