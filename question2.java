public class question2 {
    
        double computebmi(double height,double weight)
        {
            return (weight/(height*height));
        }
        public static void main(String args[]){
            question2 p=new question2();
            System.out.println(p.computebmi(1.7, 55));
        }
    
    
}
