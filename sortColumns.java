import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



class sortColumns 
{
    //takes in the array the user inputted
    public static String minDeletionSize(String[] A) {
        int ans = 0;

        //catches any errors and returns -1 if there are any
        try{
            for (int c = 0; c < A[0].length(); ++c)
                for (int r = 0; r < A.length - 1; ++r)
                    if (A[r].charAt(c) > A[r+1].charAt(c)) {
                        //prints the index of the column not sorted
                        System.out.println("Column not sorted: [" + c + "]");
                        ans++;
                        break;
                    }
            //converts total number into String so it can be returned
            String s=String.valueOf(ans);
            return s;       
        }

        catch (Exception Error)
        {
            System.out.println("There was an error.");
            return "-1";
        }
    }

    //main function, asks user to input elements of array and calls method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements would you like in your array ");
        int n = input.nextInt();

        String[] myArray = new String[n];

        System.out.println("Note: all strings should be the same length. ");
        
        System.out.println("Please enter a short string of letters for each item. ");
        for (int x =0; x<n; x++)
        {
            myArray[x] = input.next();
        }

        //prints out the total of unsorted columns
        System.out.println("There are " + minDeletionSize(myArray) + " unsorted columns.");

    }

}