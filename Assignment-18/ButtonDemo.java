import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    ButtonDemo(){
        label = new JLabel("Click the button");

        button = new JButton("Click Me");
        button.addActionListener(this);

        setLayout(new FlowLayout());

        add(label);
        add(button);

        setSize(300,150);
        setTitle("Button Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText("Button Clicked!");
    }

    public static void main(String[] args){
        new ButtonDemo();
    }

}
    
