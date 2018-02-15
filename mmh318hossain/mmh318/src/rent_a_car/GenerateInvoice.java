
package rent_a_car;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class GenerateInvoice {
    JFrame frame;
    public GenerateInvoice(){
        
        frame = new JFrame("Generate Invoice");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel title = new JLabel("   Generate Invoice");
        JLabel l = new JLabel();
        
        Color color1 = new Color(90, 130, 199);
        Color color2 = new Color(255, 255, 255);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        Font TitleFont = new Font("SansSherif", Font.BOLD, 32);
        Font f2 = new Font("SansSherif", Font.BOLD, 17);
        
        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("  " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();
        
        title.setFont(TitleFont);
        title.setForeground(color2);
        title.setBackground(color1);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l.setBorder(border);

        title.setBorder(border);
        title.setOpaque(true);

        l.setFont(f);
        l.setBackground(color1);
        l.setForeground(color2);
        l.setOpaque(true);

        title.setBounds(310, 20, 330, 80);
        l.setBounds(325, 110, 300, 40);
        
        JButton Back = new JButton("Back") {
            @Override
            protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                            0, 0, getWidth() - 1, getHeight() - 1));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override
            public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder());
            }
        };
        
        Back.setBounds(370, 610, 160, 40);
        
        Back.setForeground(color2);
        Back.setFont(f);
        Back.setBackground(color1);
        
        Back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });
        
        frame.add(title);
        frame.add(l);
        frame.add(Back);
    }
}
