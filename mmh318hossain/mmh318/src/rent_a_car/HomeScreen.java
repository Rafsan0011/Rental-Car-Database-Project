package rent_a_car;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class HomeScreen {

    JFrame frame;
    private final JLabel time = new JLabel();
    private final SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
    private int currentSecond;
    private Calendar calendar;
    JButton view_reservations;

    public HomeScreen() {
        frame = new JFrame("Rent A Car");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        JLabel l = new JLabel();
        //   String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Assumes clock is a custom component
                // yourClock.setTime(System.currentTimeMillis());
                // OR
                // Assumes clock is a JLabel
                l.setText("   " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();

        URL url = getClass().getResource("rent-car-logo.png");
        ImageIcon imageIcon = new ImageIcon(url.getPath());
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(280, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back
        JLabel rent_car = new JLabel(imageIcon);
        rent_car.setBounds(330, 20, 280, 120);
        l.setBounds(330, 150, 280, 50);
        Color color1 = new Color(90, 130, 199);
        Color color2 = new Color(255, 255, 255);
        Font f = new Font("SansSherif", Font.BOLD, 18);
        frame.add(rent_car);
        frame.add(l);
        l.setFont(f);
        l.setForeground(color2);
        l.setBackground(color1);
        l.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l.setBorder(border);
        view_reservations = new JButton("View Reservations") {
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
        JButton reserve_car = new JButton("Reserve a Car") {
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
        JButton add_customer = new JButton("Add Customer") {
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
        JButton view_vehicle = new JButton("View Vehicles") {
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
        JButton add_vehicle = new JButton("Add Vehicle") {
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
        JButton view_franchise = new JButton("View Franchise") {
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
        JButton generate_invoice = new JButton("Generate Invoice") {
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
        JButton view_available_cars = new JButton("View Available Cars") {
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
        JButton settings = new JButton("Settings") {
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
        JButton Quit = new JButton("Quit") {
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

        view_reservations.setBackground(color1);
        view_reservations.setForeground(color2);
        view_reservations.setFont(f);
        view_reservations.setBounds(60, 250, 220, 50);
        view_reservations.setRequestFocusEnabled(false);
        frame.add(view_reservations);
//        view_reservations.addFocusListener(new FocusListener() {
//
//            @Override
//            public void focusGained(FocusEvent fe) {
//               // view_reservations.setSize(240, 50);
//                view_reservations.setForeground(Color.yellow);
//            }
//
//            @Override
//            public void focusLost(FocusEvent fe) {
//               // view_reservations.setSize(220, 40);
//            }
//        });

        reserve_car.setBackground(color1);
        reserve_car.setForeground(color2);
        reserve_car.setFont(f);
        reserve_car.setBounds(60, 350, 220, 50);
        
        reserve_car.setRequestFocusEnabled(false);
        frame.add(reserve_car);
        
        add_customer.setBackground(color1);
        add_customer.setForeground(color2);
        add_customer.setFont(f);
        add_customer.setBounds(60, 450, 220, 50);
        
        add_customer.setRequestFocusEnabled(false);
        frame.add(add_customer);
        
        view_vehicle.setBackground(color1);
        view_vehicle.setForeground(color2);
        view_vehicle.setFont(f);
        view_vehicle.setBounds(340, 250, 220, 50);
        
        view_vehicle.setRequestFocusEnabled(false);
        frame.add(view_vehicle);
        
        add_vehicle.setBackground(color1);
        add_vehicle.setForeground(color2);
        add_vehicle.setFont(f);
        add_vehicle.setBounds(340, 350, 220, 50);
        
        add_vehicle.setRequestFocusEnabled(false);
        frame.add(add_vehicle);
        
        view_franchise.setBackground(color1);
        view_franchise.setForeground(color2);
        view_franchise.setFont(f);
        view_franchise.setBounds(340, 450, 220, 50);
        
        view_franchise.setRequestFocusEnabled(false);
        frame.add(view_franchise);
        
        generate_invoice.setBackground(color1);
        generate_invoice.setForeground(color2);
        generate_invoice.setFont(f);
        generate_invoice.setBounds(620, 250, 220, 50);
        
        generate_invoice.setRequestFocusEnabled(false);
        frame.add(generate_invoice);
        
        view_available_cars.setBackground(color1);
        view_available_cars.setForeground(color2);
        view_available_cars.setFont(f);
        view_available_cars.setBounds(620, 350, 220, 50);
        
        view_available_cars.setRequestFocusEnabled(false);
        frame.add(view_available_cars);
        
        settings.setBackground(color1);
        settings.setForeground(color2);
        settings.setFont(f);
        settings.setBounds(620, 450, 220, 50);
        
        settings.setRequestFocusEnabled(false);
        frame.add(settings);
        
        Quit.setBackground(color1);
        Quit.setForeground(color2);
        Quit.setFont(f);
        Quit.setBounds(340, 550, 220, 50);
        
        Quit.setRequestFocusEnabled(false);
        frame.add(Quit);
        
        view_reservations.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frame.setVisible(false);
               frame.dispose();
                try {
                    ViewReservation reservation=new ViewReservation();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        view_vehicle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frame.setVisible(false);
               frame.dispose();
                try {
                    ViewVehicle vehicle=new ViewVehicle();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        view_franchise.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frame.setVisible(false);
               frame.dispose();
                try {
                    ViewFranchise franchise=new ViewFranchise();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        view_available_cars.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frame.setVisible(false);
               frame.dispose();
                try {
                    AvailableVehicles available=new AvailableVehicles();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        reserve_car.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               frame.setVisible(false);
               frame.dispose();
               ReserveCar reserve=new ReserveCar();
            }
        });
        
        add_customer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                AddCustomer addcustomer=new AddCustomer();
            }
        });
        
        add_vehicle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               AddVehicle addvehicle=new AddVehicle();
            }
        });
        
        generate_invoice.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                GenerateInvoice invoice = new GenerateInvoice();
            }
        });
        
        settings.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Settings settings = new Settings();
            }
        });
        
        Quit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               System.exit(0);
            }
        });
        
    }

}
