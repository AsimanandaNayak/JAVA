import java.awt.*;
public class AWT_BY_extend_Frame extends Frame
{
    AWT_BY_extend_Frame()
{
Button b=new Button("click me");
b.setBounds(30,100,80,30);
add(b);
setSize(500,500);
setTitle("This is our first awt example");
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
    AWT_BY_extend_Frame obj=new AWT_BY_extend_Frame();}
}