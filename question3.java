abstract class compartment{
    abstract void notice();
}

class question3 extends compartment  {
    public void notice(){
        System.out.println("this is notice section of compartment");
    }
    public static void main(String args[]){
        compartment ref;
        ref=new question3();
        ref.notice();

    }
    
}


