import java.io.*; 
public class buffer_reader {
    public static void main(String[] args) {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(i);
        int x = Integer.parseInt(r.readLine());
        int y = Integer.parseInt(r.readLine());
        System.out.println(x+y);
    }
}
