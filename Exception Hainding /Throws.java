 import java.io.IOException;

 class FileHandler {
     void readfile() throws IOException{
         System.out.println("File loading");
         throw new IOException("File not found");
     }
 }
 public class Basic{
     public static void main(String[] args){
         FileHandler f1= new FileHandler();
         try {
             f1.readfile();
         }
         catch(IOException e){
             System.out.println("Error.." +e.getMessage());
         }

     }
}
