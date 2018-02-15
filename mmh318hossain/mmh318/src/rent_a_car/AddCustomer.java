
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;

public class AddCustomer {
    
    
    JFrame frame;

    public AddCustomer() {

        frame = new JFrame("Add Customer");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel title = new JLabel("   Customer Details");
        JLabel l = new JLabel();
        JLabel customer_id = new JLabel("Customer ID:");
        JLabel cust_name_lb = new JLabel("Full Name:");
        JLabel cust_address_lb = new JLabel("Address:");
        JLabel cust_ph_lb = new JLabel("Phone Number:");
        JLabel cust_city_lb = new JLabel("City:");
        JLabel cust_mem_lb = new JLabel("Group MemberShip:");
        JLabel cust_disc_lb = new JLabel("Discount Code:");
        JTextField customer_id_txt = new JTextField() {
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
        JLabel driver_id_lb = new JLabel("Driver ID");
        JLabel driver_name_lb = new JLabel("Driver Name:");
        JLabel driver_ph_lb = new JLabel("Driver Phone:");
        
        JLabel driver_address_lb = new JLabel("Driver Address:");
        JLabel driver_license_lb = new JLabel("License Number:");
        

        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("  " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();

        JTextField cust_name_txt = new JTextField() {
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

        JTextField cust_address_txt = new JTextField() {
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

        JTextField cust_ph_txt = new JTextField() {
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
        
        JTextField cust_city_txt = new JTextField() {
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
        
        
        JTextField cust_memb_txt = new JTextField() {
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
        
        JTextField cust_disc_txt = new JTextField() {
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
        
        JTextField driver_id_txt = new JTextField() {
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
        
        JTextField driver_name_txt = new JTextField() {
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
        
        JTextField driver_ph_txt = new JTextField() {
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
        
        JTextField driver_address_txt = new JTextField() {
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
        
        JTextField license_txt = new JTextField() {
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

        cust_name_txt.setBounds(680, 180, 180, 40);
        cust_name_lb.setBounds(480, 180, 160, 40);

        customer_id.setBounds(60, 180, 160, 40);
        customer_id_txt.setBounds(220, 180, 180, 40);

        cust_address_lb.setBounds(60, 240, 160, 40);
        cust_address_txt.setBounds(220, 240, 180, 40);

        cust_ph_lb.setBounds(480, 240, 160, 40);
        cust_ph_txt.setBounds(680, 240, 180, 40);

        cust_city_lb.setBounds(60, 300, 160, 40);
        cust_city_txt.setBounds(220, 300, 180, 40);

        cust_mem_lb.setBounds(480, 300, 160, 40);
        cust_memb_txt.setBounds(680, 300, 180, 40);

        cust_disc_lb.setBounds(60, 360, 160, 40);
        cust_disc_txt.setBounds(220, 360, 180, 40);
        
        driver_id_lb.setBounds(480, 360, 160, 40);
        driver_id_txt.setBounds(680, 360, 180, 40);
        
        driver_name_lb.setBounds(60, 420, 160, 40);
        driver_name_txt.setBounds(220, 420, 180, 40);
        
        driver_ph_lb.setBounds(480, 420, 160, 40);
        driver_ph_txt.setBounds(680, 420, 180, 40);
        
        driver_address_lb.setBounds(60, 480, 160, 40);
        driver_address_txt.setBounds(220, 480, 180, 40);
        
        driver_license_lb.setBounds(480, 480, 160, 40);
        license_txt.setBounds(680, 480, 180, 40);
        
        
        

        Add.setBounds(520, 610, 160, 40);

        Back.setBounds(200, 610, 160, 40);

        customer_id_txt.setFont(f2);
        cust_name_txt.setFont(f2);
        cust_city_txt.setFont(f2);
        cust_ph_txt.setFont(f2);
        cust_address_txt.setFont(f2);
        cust_memb_txt.setFont(f2);
        cust_disc_txt.setFont(f2);
        driver_id_txt.setFont(f2);
        driver_name_txt.setFont(f2);
        driver_address_txt.setFont(f2);
        driver_ph_txt.setFont(f2);
        license_txt.setFont(f2);

        customer_id.setForeground(color1);
        customer_id.setFont(f2);

        cust_name_lb.setForeground(color1);
        cust_name_lb.setFont(f2);

        cust_ph_lb.setForeground(color1);
        cust_ph_lb.setFont(f2);

        cust_address_lb.setForeground(color1);
        cust_address_lb.setFont(f2);

        cust_city_lb.setForeground(color1);
        cust_city_lb.setFont(f2);

        cust_mem_lb.setForeground(color1);
        cust_mem_lb.setFont(f2);

        cust_disc_lb.setForeground(color1);
        cust_disc_lb.setFont(f2);
        
        driver_id_lb.setForeground(color1);
        driver_id_lb.setFont(f2);
        
        driver_name_lb.setForeground(color1);
        driver_name_lb.setFont(f2);
        
        driver_address_lb.setForeground(color1);
        driver_address_lb.setFont(f2);
        
        driver_ph_lb.setForeground(color1);
        driver_ph_lb.setFont(f2);
        
        driver_license_lb.setForeground(color1);
        driver_license_lb.setFont(f2);

        Add.setForeground(color2);
        Add.setFont(f);
        Add.setBackground(color1);

        Back.setForeground(color2);
        Back.setFont(f);
        Back.setBackground(color1);

        frame.setLayout(null);
        frame.add(title);
        frame.add(l);
        frame.add(cust_name_lb);
        frame.add(customer_id);
        frame.add(customer_id_txt);
        frame.add(cust_name_txt);
        frame.add(cust_address_lb);
        frame.add(cust_address_txt);
        frame.add(cust_city_lb);
        frame.add(cust_city_txt);
        frame.add(cust_ph_lb);
        frame.add(cust_ph_txt);
        frame.add(cust_mem_lb);
        frame.add(cust_memb_txt);
        frame.add(cust_disc_lb);
        frame.add(cust_disc_txt);
        frame.add(driver_id_lb);
        frame.add(driver_id_txt);
        frame.add(driver_name_lb);
        frame.add(driver_name_txt);
        frame.add(driver_address_lb);
        frame.add(driver_address_txt);
        frame.add(driver_ph_lb);
        frame.add(driver_ph_txt);
        frame.add(driver_license_lb);
        frame.add(license_txt);
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
                JOptionPane.showMessageDialog(null, "The Customer Details are Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });

    }
}
