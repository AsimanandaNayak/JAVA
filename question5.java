
class  Fruit
 {
   String taste,size;
    void eat()
     {
       System.out.println("Eating fruits");
     }
 }
class Apple extends Fruit
 { 
   String taste = "sweet";
   String size = "medium";
   void eat()
    {
       System.out.println("Eating Apple which tastes " + taste + "  and it is "+ size + " in size");
    }
 }
class Orange extends Fruit
 { 
   String taste = "sweet-tart";
   String size = "big";
   void eat()
    {
       System.out.println("Eating orange which tastes " + taste + "  and it is "+ size +" in size");
    }
 }
class Testfruit
 {
   public static void main(String main[])
    {
       Fruit f = new Fruit();
       f.eat();
       Apple a = new Apple();
       a.eat();
       Orange o = new Orange();
       o.eat();
      }
   }