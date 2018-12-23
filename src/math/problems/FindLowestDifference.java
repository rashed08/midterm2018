package math.problems;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         * Use one of the databases from mysql or mongodb to store and to retrieve.
         */
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest number in array is : " + smallest);

        ConnectDB connectDB = new ConnectDB();

        List<String> lowestValue = new ArrayList<String>();
        int[] array1 = new int[1];
        array1[0] = smallest;
        try {
            connectDB.InsertDataFromArryToMySql(array1, "tbl_lowestNumber", "column_lowestNumber");
            lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
            System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
            for (String st : lowestValue) {
                System.out.println(st);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
