import java.io.*;
public class J2 {
    public static void main(String[] args) {
        try{
            FileWriter file =new FileWriter("rand.txt");
            for (int i=0; i<1000;i++){
                int r=(int)(Math.random()*1000)+1;
                file.write(r+"\n");
            }
            file.close();
        }
        catch (Exception e){
            System.out.println("Something Error");
        }
    }
}
