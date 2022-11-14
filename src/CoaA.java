import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoaA extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton calculateButton;
    private JButton clearButton;
    private JPanel panel;

    public CoaA() {

        setContentPane(panel);
        setSize(660,400);
        setVisible(true);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    int a=Integer.parseInt(textField1.getText());
                    textField2.setText(Integer.toBinaryString(a));
                    textField3.setText(Integer.toHexString(a));

                }



        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                textField1.setText("");
                textField2.setText("");
                textField3.setText("");

            }
        });


    }

    public static void main(String[] args) {
        CoaA part_a = new CoaA();
    }
}
