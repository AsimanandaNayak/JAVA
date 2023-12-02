import java.awt.*;
import java.awt.event.*;
class frame_action_event extends Frame implements ActionListener{
    TextField tf;
    frame_action_event(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("click me ");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        tf.setText("welcome");
    }
    public static void main(String[] args) {
      frame_action_event obj = new frame_action_event();
    }
}