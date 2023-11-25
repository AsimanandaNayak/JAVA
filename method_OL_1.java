//by changing the number of parameter
class adder{
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}

public class method_OL_1 {
  public static void main(String[] args) {
    System.out.println(adder.add(10,20));
    System.out.println(adder.add(21,43,23));
  }
    
}