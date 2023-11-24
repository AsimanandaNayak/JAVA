interface instrument
{
    abstract void play();
}
class piano implements instrument
{
    public void play(){
        System.out.println("piano is playing by me");
    }
}
class fluite implements instrument{
    public void play(){
        System.out.println("fluite is playing by me");
    }
}

public class question4 implements instrument {
    public void play(){
        System.out.println("Guitar is playing by me");
    }
    public static void main(String args[]){
        instrument ref;
        ref=new piano();
        ref.play();
        ref=new fluite();
        ref.play();
        ref=new question4();
        ref.play();
    }
}


