import java.io.*;
import java.util.Scanner;

/**
 * Created by Toshiba on 12.12.2016.
 */
public class Main {

 //   public static void main(String[] args) {
 //       char chars[] = { 'a', 'b', 'с', 'd', 'e', 'f' };
 //       String s = new String(chars,0,6);
  //      System.out.println(s);
   // }


  //      public static void main(String[] args) {
//
   //         Scanner in = new Scanner(System.in);
   //         System.out.print("Введите имя: ");
   //         String name = in.nextLine();
   //         System.out.print("Введите возраст: ");
    //        int age = in.nextInt();
    //        System.out.println("Ваше имя: " + name + "   Ваш возраст: " + age);
    //    }

   //     public static void main(String[] args) throws IOException{
     //       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //     File f = new File("./src/input");
       //     BufferedReader fin = new BufferedReader(new FileReader(f));
       //    String name;
        //    String line;
        //    System.out.println("Print File "+f.getName()+"? y/n");
        //    name = br.readLine();
        //   if(name.equals("y"))
         //       while ((line = fin.readLine()) != null) System.out.println(line);
     //  }

    public static void main(String[] args) throws IOException {

      Scanner in = new Scanner(System.in);
      System.out.print("Введите название курса: ");
        String name = in.nextLine();
       System.out.println("Рассписания занятий: " + name );
       try(FileReader reader = new FileReader("./src/" + name))
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

