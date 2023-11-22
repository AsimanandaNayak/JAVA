
 class non_static_method {
    public void display(){
        System.out.println("its my code");
    }
   public static void main(String[] args) {
    non_static_method obj = new non_static_method();
    obj.display();
   }
}