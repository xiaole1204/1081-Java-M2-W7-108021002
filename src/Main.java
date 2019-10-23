//public class Main {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum=sum=i;
//            System.out.println("This sum is" + sum + ".\n");
//        }}
//    }
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int sum = 0;
//        for (int i = 3; i<=n;i+=3){
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        float v1 = scn.nextFloat();
//        float maxVal = v1;
//        float minVal = v1;
//        for (int i = 1 ; i <10;i++){
//            v1 = scn.nextFloat();
//            if (maxVal<v1){
//                maxVal=v1;
//            } else if (minVal>v1){
//                minVal=v1;
//            }
//        }
//        System.out.printf("%.2f" , maxVal);
//        System.out.printf("%.2f" , minVal);
//    }
//}
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int m = n / 2;
//        boolean flag = true;
//        for (int i = 2 ; i<=m;i++){
//            if (n% i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("Yes");
//        } else {
//            System.out.println("no");
//        }
//    }
//}
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <=n;i++){
            sum = sum+i*(i+1);
        }
        System.out.println(sum);
    }
}