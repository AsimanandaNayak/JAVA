import java.awt.*;
public class AWT_BY_Object_of_Frame
{
    AWT_BY_Object_of_Frame()
{
Frame f=new Frame("This is my 1st AWT example");  //Frame class object

TextField t=new TextField();//creating the componenets
Label l=new Label("emp id");//creating the componenets
Button b=new Button("submit");//creating the componenets

b.setBounds(100,100,80,30);//setting the boundary of evey componenets
l.setBounds(5,80,80,20);//setting the boundary of evey componenets
t.setBounds(10,100,80,30);//setting the boundary of evey componenets

f.add(b); //adding the componeents into the frame
f.add(l);//adding the componeents into the frame
f.add(t);//adding the componeents into the frame

f.setSize(500,500);//size of frame
//f.setTitle("This is our first awt example");//title of frame
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
    AWT_BY_Object_of_Frame obj=new AWT_BY_Object_of_Frame();
}
}