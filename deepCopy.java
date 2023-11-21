public class deepCopy {
    public static void main(String[] args) {
        int[] source={1,3,5,6};
        int[] destination=new int[4];
        for(int i=0;i<source.length;i++){
            destination[i]=source[i];
        }
        for(int i=0;i<destination.length;i++){
            System.out.println(destination[i]);
        }
    }
}
