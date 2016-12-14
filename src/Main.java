import java.io.*;
import java.util.Scanner;

/**
 * Created by Toshiba on 12.12.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

      Scanner in = new Scanner(System.in);
      System.out.print("Введите название курса: ");
        String name = in.nextLine();
       System.out.println("Рассписания занятий: " + name );
       try(FileReader reader = new FileReader("./resource/" + name))
        {
            int c;
            while((c=reader.read())!=-1){
               System.out.print((char)c);
           }
      }
      catch(IOException ex){
          System.out.println(ex.getMessage());
      }
    }
}

