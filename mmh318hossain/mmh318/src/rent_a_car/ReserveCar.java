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

public class ReserveCar {

    JFrame frame;

    public ReserveCar() {

        frame = new JFrame("Reserve Car");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel title = new JLabel("      Reserve A Car");
        JLabel l = new JLabel();
        JLabel customer_id = new JLabel("Customer ID:");
        JLabel duration_lb = new JLabel("Duration (hrs):");
        JLabel reserv_time_lb = new JLabel("Reservation Time:");
        JLabel month_lb = new JLabel("Month:");

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
        JLabel cartype_lb = new JLabel("Car Type:");
        JLabel status_lb = new JLabel("Status:");
        JLabel Franchise = new JLabel("Franchise:");

        String[] car_type = {"Select", "Luxery", "Go+", "Go", "Normal"};
        String[] status = {"Select", "In Progress", "Pending", "Complete"};
        String[] city = {"Select", "New York", "Texas", "other"};

        JComboBox<String> cartype_combo = new JComboBox<String>(car_type);
        JComboBox<String> status_combo = new JComboBox<String>(status);
        JComboBox<String> franchise_combo = new JComboBox<String>(city);
        cartype_combo.setSelectedIndex(0);

        cartype_combo.addActionListener(new ActionListener() {
            String cartype_string;

            @Override
            public void actionPerformed(ActionEvent ae) {
                JComboBox cb = (JComboBox) ae.getSource();
                cartype_string = (String) cb.getSelectedItem();

            }
        });

        status_combo.setSelectedIndex(0);

        status_combo.addActionListener(new ActionListener() {
            String status_string;

            @Override
            public void actionPerformed(ActionEvent ae) {
                JComboBox cb = (JComboBox) ae.getSource();
                status_string = (String) cb.getSelectedItem();

            }
        });

        franchise_combo.setSelectedIndex(0);

        franchise_combo.addActionListener(new ActionListener() {
            String fran_string;

            @Override
            public void actionPerformed(ActionEvent ae) {
                JComboBox cb = (JComboBox) ae.getSource();
                fran_string = (String) cb.getSelectedItem();

            }
        });

        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("  " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();

        JTextField duration_txt = new JTextField() {
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

        JTextField reserv_time_txt = new JTextField() {
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

        JTextField month_txt = new JTextField() {
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

        JButton Reserve = new JButton("Reserve") {
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

        cartype_combo.setBounds(680, 260, 160, 40);
        cartype_lb.setBounds(480, 260, 180, 40);

        customer_id.setBounds(60, 260, 140, 40);
        customer_id_txt.setBounds(220, 260, 180, 40);

        duration_lb.setBounds(60, 340, 140, 40);
        duration_txt.setBounds(220, 340, 180, 40);

        reserv_time_lb.setBounds(480, 340, 180, 40);
        reserv_time_txt.setBounds(680, 340, 180, 40);

        month_lb.setBounds(60, 420, 140, 40);
        month_txt.setBounds(220, 420, 180, 40);

        status_lb.setBounds(480, 420, 140, 40);
        status_combo.setBounds(680, 420, 160, 40);

        Franchise.setBounds(280, 500, 140, 40);
        franchise_combo.setBounds(480, 500, 160, 40);

        Reserve.setBounds(520, 610, 160, 40);

        Back.setBounds(200, 610, 160, 40);

        customer_id_txt.setFont(f2);
        month_txt.setFont(f2);
        reserv_time_txt.setFont(f2);
        duration_txt.setFont(f2);

        customer_id.setForeground(color1);
        customer_id.setFont(f2);

        cartype_lb.setForeground(color1);
        cartype_lb.setFont(f2);

        duration_lb.setForeground(color1);
        duration_lb.setFont(f2);

        reserv_time_lb.setForeground(color1);
        reserv_time_lb.setFont(f2);

        month_lb.setForeground(color1);
        month_lb.setFont(f2);

        status_lb.setForeground(color1);
        status_lb.setFont(f2);

        Franchise.setForeground(color1);
        Franchise.setFont(f2);

        Reserve.setForeground(color2);
        Reserve.setFont(f);
        Reserve.setBackground(color1);

        Back.setForeground(color2);
        Back.setFont(f);
        Back.setBackground(color1);

        frame.setLayout(null);
        frame.add(title);
        frame.add(l);
        frame.add(cartype_combo);
        frame.add(customer_id);
        frame.add(customer_id_txt);
        frame.add(cartype_lb);
        frame.add(duration_lb);
        frame.add(duration_txt);
        frame.add(reserv_time_lb);
        frame.add(reserv_time_txt);
        frame.add(month_lb);
        frame.add(month_txt);
        frame.add(status_lb);
        frame.add(status_combo);
        frame.add(Franchise);
        frame.add(franchise_combo);
        frame.add(Back);
        frame.add(Reserve);

        Back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });

        Reserve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "The Car is Reserved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home=new HomeScreen();
            }
        });

    }
}
