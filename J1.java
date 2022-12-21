import java.util.Scanner;
class RuntimeException extends Exception {
}
class password {
    public void wrong(int i) throws RuntimeException {
        if (i==3) {
            throw new RuntimeException();
        }
    }
}
public class J1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        password pw=new password();
        int pw1=sc.nextInt(), pw2;
        for(int i=1; i<=3; i++) {
            pw2=sc.nextInt();
            if(pw1==pw2) {
                System.out.println("密碼正確");
                break;
            }
            else {
                System.out.println("與第一次輸入的不同");
                try {
                pw.wrong(i);
                }
                catch(RuntimeException e) {
                    System.out.println(e+": 輸入三次錯誤!程式停止!");
                }
            }
        }
    }
}
