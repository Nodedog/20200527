
import java.util.Scanner;

public class Test3 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n=sc.nextInt();
                //n表示的是空瓶子的数量
                //count表示的是能喝的汽水瓶数
                int count=0;
                int a=0;
                if(n==1){
                    count=0;
                    return;
                }

                while(n/3!=0){
                    a=n/3;
                    count+=a;
                    n=n%3+a;
                }
                if(n==2){
                    count++;
                }
                System.out.println(count);
            }
        }
}
