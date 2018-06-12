import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JButton jbnR = new JButton("RUN");
    private JButton jbnE = new JButton("EXIT");
    private JLabel jlb = new JLabel();
    private JLabel jlb1 = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JTextField jtf = new JTextField();
    private Container cp;

    public Frame() {
        init();
    }

    private void init() {
        this.setBounds(0, 0, 800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(2, 3, 1, 1));
        cp.add(jtf);
        cp.add(jbnR);
        cp.add(jlb);
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jbnE);

        jbnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        jbnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int data [] = new int[5];
                try {
                    double a1 = Double.parseDouble(jtf.getText());
                    double a2 = a1 * 0.62;
                    jlb.setText(Double.toString(a2));
                    for (int i = 0 ; i < 5 ; i++){
                        data[i] = (int)Math.round(Math.random()*100);
                    }
                }catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(Frame.this,"錯誤");
                }
            }
        });
    }
}
