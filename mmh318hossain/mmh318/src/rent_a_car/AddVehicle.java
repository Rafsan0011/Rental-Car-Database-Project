
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;


public class AddVehicle {
    
    JFrame frame;

    public AddVehicle() {

        frame = new JFrame("Add Customer");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel title = new JLabel("   Vehicle Details");
        JLabel l = new JLabel();
        JLabel vehicle_id_lb = new JLabel("Vehicle ID:");
        JLabel vehicle_name_lb = new JLabel("Vehicle Name:");
        JLabel vehicle_make_lb = new JLabel("Make Year:");
        JLabel vehicle_model_lb = new JLabel("Vehicle Model:");
        JLabel vehicle_type_lb = new JLabel("Vehicle Type:");
        JLabel vehicle_adometer_lb = new JLabel("Meter Reading:");
        JLabel vehicle_fran_lb = new JLabel("Franchise ID:");
        JTextField vehicle_id_txt = new JTextField() {
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


        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("  " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();

        JTextField vehicle_name_txt = new JTextField() {
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

        JTextField vehicle_make_txt = new JTextField() {
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

        JTextField vehicle_model_txt = new JTextField() {
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
        
        JTextField vehicle_type_txt = new JTextField() {
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
        
        
        JTextField vehicle_odometer_txt = new JTextField() {
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
        
        JTextField vehicle_fran_txt = new JTextField() {
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

        JButton Add = new JButton("Add") {
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

        Color color1 = new Color(90, 130, 199);
        Color color2 = new Color(255, 255, 255);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        Font TitleFont = new Font("SansSherif", Font.BOLD, 32);
        Font f2 = new Font("SansSherif", Font.BOLD, 17);

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

        vehicle_id_txt.setBounds(680, 260, 180, 40);
        vehicle_id_lb.setBounds(480, 260, 160, 40);

        vehicle_name_lb.setBounds(60, 260, 160, 40);
        vehicle_name_txt.setBounds(220, 260, 180, 40);

        vehicle_make_lb.setBounds(60, 320, 160, 40);
        vehicle_make_txt.setBounds(220, 320, 180, 40);

        vehicle_model_lb.setBounds(480, 320, 160, 40);
        vehicle_model_txt.setBounds(680, 320, 180, 40);

        vehicle_type_lb.setBounds(60, 380, 160, 40);
        vehicle_type_txt.setBounds(220, 380, 180, 40);

        vehicle_adometer_lb.setBounds(480, 380, 160, 40);
        vehicle_odometer_txt.setBounds(680, 380, 180, 40);

        vehicle_fran_lb.setBounds(240, 440, 160, 40);
        vehicle_fran_txt.setBounds(430, 440, 180, 40);


        Add.setBounds(520, 610, 160, 40);

        Back.setBounds(200, 610, 160, 40);

        vehicle_id_txt.setFont(f2);
        vehicle_name_txt.setFont(f2);
        vehicle_make_txt.setFont(f2);
        vehicle_model_txt.setFont(f2);
        vehicle_type_txt.setFont(f2);
        vehicle_odometer_txt.setFont(f2);
        vehicle_fran_txt.setFont(f2);

        vehicle_id_lb.setForeground(color1);
        vehicle_id_lb.setFont(f2);

        vehicle_name_lb.setForeground(color1);
        vehicle_name_lb.setFont(f2);

        vehicle_make_lb.setForeground(color1);
        vehicle_make_lb.setFont(f2);

        vehicle_model_lb.setForeground(color1);
        vehicle_model_lb.setFont(f2);

        vehicle_type_lb.setForeground(color1);
        vehicle_type_lb.setFont(f2);

        vehicle_adometer_lb.setForeground(color1);
        vehicle_adometer_lb.setFont(f2);

        vehicle_fran_lb.setForeground(color1);
        vehicle_fran_lb.setFont(f2);

        Add.setForeground(color2);
        Add.setFont(f);
        Add.setBackground(color1);

        Back.setForeground(color2);
        Back.setFont(f);
        Back.setBackground(color1);

        frame.setLayout(null);
        frame.add(title);
        frame.add(l);
        frame.add(vehicle_id_lb);
        frame.add(vehicle_id_txt);
        frame.add(vehicle_name_lb);
        frame.add(vehicle_name_txt);
        frame.add(vehicle_make_lb);
        frame.add(vehicle_make_txt);
        frame.add(vehicle_model_lb);
        frame.add(vehicle_model_txt);
        frame.add(vehicle_type_lb);
        frame.add(vehicle_type_txt);
        frame.add(vehicle_adometer_lb);
        frame.add(vehicle_odometer_txt);
        frame.add(vehicle_fran_lb);
        frame.add(vehicle_fran_txt);

        frame.add(Back);
        frame.add(Add);

        Back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });

        Add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "The Vehicle Details are Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });

    }
}
