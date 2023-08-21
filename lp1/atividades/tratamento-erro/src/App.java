import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
         PrintWriter out = null;
         List<Integer> list;
         int SIZE = 10;
         list = new ArrayList<Integer>(SIZE);
         
         for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
         
         try{
             out = new PrintWriter(new FileWriter("OutFile.txt"));
             for (int i = 0; i < SIZE; i++)
             out.println("Value at: " + i + " = " + list.get(i));
         }catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
             e.getMessage());
         } catch (IOException e) {
             System.err.println("Caught IOException: " +
             e.getMessage());
         } finally {
             if (out != null) {
                 System.out.println("Closing PrintWriter");
                 out.close();
             } else {
                 System.out.println("PrintWriter not open");
         }
        }
    }
}