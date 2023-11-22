import java.util.Scanner;
public class positive_or_negetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check positive or negative");
        int num = sc.nextInt();
        find_pos_neg(num);

    }
    public static void find_pos_neg(int num){
        if( num >= 0){
            System.out.println("yes its a positive number");
        }else{
            System.out.println("yes its a negative number");
        }
    }
}
