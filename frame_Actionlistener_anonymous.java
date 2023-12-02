import java.awt.*;
import java.awt.event.*;
class frame_Actionlistener_anonymous extends Frame implements ActionListener{
    TextField tf;
    frame_Actionlistener_anonymous(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("click me ");
        b.setBounds(100,120,80,30);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("heyy");
            }
        });
        
    }
    
    public static void main(String[] args) {
      frame_action_event obj = new frame_action_event();
    }
}