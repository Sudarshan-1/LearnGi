import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readinput {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        String str=bfn.readLine();
        int it=Integer.parseInt(bfn.readLine());
        System.out.println("entered string"+ str);
        System.out.println("entered integer"+it);

        BufferedReader bfg=new BufferedReader(new InputStreamReader(System.in));
        String ste=bfn.readLine();//reads every line
        int itr=Integer.parseInt(bfn.readLine());
        System.out.println("entered"+str);
// /*/


    }
}
