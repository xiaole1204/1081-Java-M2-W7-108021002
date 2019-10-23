//1~100
//public class Main {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum=sum=i;
//            System.out.println("This sum is" + sum + ".\n");
//        }}
//    }
//計算正整數被3整除之數值
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
//最大值最小值
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
//質數判斷
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
//N*(n+1)的總和
//        import java.util.Scanner;
//        public class Main{
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,ct;
//        boolean flag = true;
//        for (int i=2;i<=n;i++){
//        ct = i;
//        for (;ct!=1;){
//        if (ct%2==0){
//        ct /= 2;
//        }else if (ct%3==0){
//        ct /= 3;
//        }else if (ct%5==0){
//        ct /= 5;
//        }else {
//        flag = false;
//        break;
//        }
//        }
//        if (flag)sum +=i;
//        flag = true;
//        }
//        System.out.println(sum);
//        }
//        }
//數字總和
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int sum = 0;
//        boolean flag = true;
//        for (int i = 2 ; i >= n ; i ++ ){
//
//        }
//    }
//}
//99乘法表
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        for (int i = 1; i <= 9 ;i++){
//            for (int j=1 ;j<=9; j++){
//                System.out.println((i*j)+"\t");
//            }
//            System.out.println();
//        }
//    }
//}