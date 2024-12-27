import java.util.Scanner;
public class Sum implements Calculation {
    Scanner in= new Scanner();

    public void calculate(){
        double a,sum=0;
        for(int i=1; i<n; i++){
            a=in.nextDouble();
            sum=sum+a;
        }
    }
}
