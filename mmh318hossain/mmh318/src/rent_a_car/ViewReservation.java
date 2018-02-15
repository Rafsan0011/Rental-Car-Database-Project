package rent_a_car;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class ViewReservation {

//    URL url1 = getClass().getResource("Sale.txt");
//    URL url2 = getClass().getResource("Rent-Lease.txt");
    public ViewReservation() throws FileNotFoundException, IOException {

        JFrame frame = new JFrame();

        // frame.setLayout(new BorderLayout());
        JTable table = new JTable();

        JPanel SearchPanel = new JPanel();
        JPanel toppanel = new JPanel();
        JPanel btnpanel = new JPanel();
        JLabel reservationslable = new JLabel("       Reservations");
        JLabel l = new JLabel();
        //   String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        ActionListener updateClockAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Assumes clock is a custom component
                // yourClock.setTime(System.currentTimeMillis());
                // OR
                // Assumes clock is a JLabel
                l.setText("  " + new Date().toString());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();

//        URL url = getClass().getResource("rent-car-logo.png");
//        ImageIcon imageIcon = new ImageIcon(url.getPath());
//        Image image = imageIcon.getImage(); // transform it 
//        Image newimg = image.getScaledInstance(280, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
//        imageIcon = new ImageIcon(newimg);  // transform it back
        // JLabel rent_car = new JLabel(imageIcon);
        JTextField Search = new JTextField() {
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

        JButton Search_btn = new JButton("Search") {
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

        LayoutManager btnlayout = new BoxLayout(btnpanel, BoxLayout.X_AXIS);
        LayoutManager searchlayout = new BoxLayout(SearchPanel, BoxLayout.Y_AXIS);

        JButton back = new JButton("Back") {
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

        JButton delete = new JButton("Delete") {
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

        JButton Update = new JButton("Update") {
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
        // JButton Delete = new JButton("Delete");
        toppanel.setLayout(new BorderLayout());
        // SearchPanel.setLayout(new BorderLayout());
        String readLine = null;
        File file = null;
        PropertyTableModel tableModel = new PropertyTableModel();
//        if (Sale_Or_Rent.equalsIgnoreCase("Sale")) {
//            file = new File(url1.getPath());
//        } else if (Sale_Or_Rent.equalsIgnoreCase("Rent")) {
//            file = new File(url2.getPath());
//        } else {
//
//        }

//        FileReader reader = new FileReader(file);
//        BufferedReader bufReader = new BufferedReader(reader);
        ArrayList<Property> property = new ArrayList<Property>();
//        while ((readLine = bufReader.readLine()) != null) {
//            String[] splitData = readLine.split(" ");
//
//            Property prp = new Property();
//            prp.setReserv_id(splitData[0]);
//            prp.setDurationHrs(splitData[1]);
//            prp.setTime(splitData[2]);
//            prp.setMonth(splitData[3]);
//            property.add(prp);
//        }

        tableModel.setList(property);
        table.setModel(tableModel);
        Dimension d = new Dimension(200, 60);
        Color color1 = new Color(90, 130, 199);
        Color color2 = new Color(255, 255, 255);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        Font TitleFont = new Font("SansSherif", Font.BOLD, 32);
        //  javax.swing.border.Border b = BorderFactory.createLineBorder(Color.BLACK);
        //back.setMinimumSize(d);
        // Delete.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toppanel.add(new JScrollPane(table), BorderLayout.CENTER);
        btnpanel.setLayout(btnlayout);
        SearchPanel.setLayout(searchlayout);
        back.setBackground(color1);
        back.setForeground(color2);

        delete.setBackground(color1);
        delete.setForeground(color2);

        Update.setBackground(color1);
        Update.setForeground(color2);

        //  Delete.setBackground(color2);
        back.setMaximumSize(new Dimension(160, 30));

        delete.setMaximumSize(new Dimension(160, 30));
        Update.setMaximumSize(new Dimension(160, 30));
        //button.setMaximumSize(...);
        Search.setPreferredSize(new Dimension(240, 30));
        Search.setMaximumSize(new Dimension(240, 30));

        Search_btn.setPreferredSize(new Dimension(140, 40));
        Search_btn.setMaximumSize(new Dimension(140, 40));

        //  Search_btn.setMaximumSize(new Dimension(120, 30));
        reservationslable.setPreferredSize(new Dimension(340, 90));
        reservationslable.setMaximumSize(new Dimension(340, 90));
        reservationslable.setFont(TitleFont);
        reservationslable.setForeground(color2);
        reservationslable.setBackground(color1);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l.setBorder(border);
        reservationslable.setBorder(border);
        reservationslable.setOpaque(true);
        l.setPreferredSize(new Dimension(300, 40));
        l.setMaximumSize(new Dimension(300, 40));
        l.setFont(f);
        l.setBackground(color1);
        l.setForeground(color2);
        l.setOpaque(true);
        back.setFont(f);
        Search_btn.setFont(f);
        Search_btn.setForeground(color2);
        Search_btn.setBackground(color1);

        btnpanel.setPreferredSize(new Dimension(920, 100));

        delete.setFont(f);
        Update.setFont(f);
        // Delete.setFont(f1);
//        back.setBorder(BorderFactory.createCompoundBorder(b,
//                BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        // Delete.setBorder(BorderFactory.createCompoundBorder(b,
        //     BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        btnpanel.add(Box.createRigidArea(new Dimension(130, 0)));
        btnpanel.add(back);
        btnpanel.add(Box.createRigidArea(new Dimension(60, 0)));
        btnpanel.add(delete);
        btnpanel.add(Box.createRigidArea(new Dimension(60, 0)));
        btnpanel.add(Update);
        btnpanel.add(Box.createRigidArea(new Dimension(60, 0)));

        SearchPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        reservationslable.setAlignmentX(CENTER_ALIGNMENT);
        // SearchPanel.add(Box.createRigidArea(new Dimension(20, 5)));
        SearchPanel.add(reservationslable);
        SearchPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        l.setAlignmentX(CENTER_ALIGNMENT);
        SearchPanel.add(l);
        SearchPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        Search.setAlignmentX(CENTER_ALIGNMENT);
        SearchPanel.add(Search);
        SearchPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        Search_btn.setAlignmentX(CENTER_ALIGNMENT);
        SearchPanel.add(Search_btn);
        SearchPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        // SearchPanel.setMaximumSize(d);
//        btnpanel.add(back);
//        btnpanel.add(Box.createRigidArea(new Dimension(50, 20)));
        // btnpanel.add(Delete);

        frame.add(toppanel, BorderLayout.CENTER);
        // toppanel.add(btnpanel, BorderLayout.SOUTH);
        frame.add(btnpanel, BorderLayout.SOUTH);
        frame.add(SearchPanel, BorderLayout.NORTH);
        frame.setTitle("View Reservations");
        frame.setSize(920, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    Color color1 = new Color(181, 220, 249);
        table.setBackground(color1);
        // frame.pack();
        //  frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                frame.dispose();
                HomeScreen home = new HomeScreen();
            }
        });
        
        Update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               String reserv_id_update= JOptionPane.showInputDialog("Please input Reservation ID:");
            }
        });
        
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               String reserv_id_delete= JOptionPane.showInputDialog("Please input Reservation ID:");
            }
        });

    }

    class PropertyTableModel extends AbstractTableModel {

        private ArrayList<Property> list = new ArrayList<Property>();
        private String[] columnNames = {"Reservation ID", "Duration Hours", "Reservation Time", "Month", "Status", "Customer ID", "Vehicle ID"};

        public void setList(ArrayList<Property> list) {
            this.list = list;
            fireTableDataChanged();
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        public int getRowCount() {
            return list.size();
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return list.get(rowIndex).getReserv_id();
                case 1:
                    return list.get(rowIndex).getDurationHrs();
                case 2:
                    return list.get(rowIndex).getTime();
                case 3:
                    return list.get(rowIndex).getMonth();
                case 4:
                    return list.get(rowIndex).getStatus();
                case 5:
                    return list.get(rowIndex).getCustomerID();
                case 6:
                    return list.get(rowIndex).getVehicleID();
                default:
                    return null;
            }
        }
    }

    class Property {

        private String reserv_id;
        private String duration_hrs;
        private String time;
        private String month;
        private String status;
        private String customer_id;
        private String vehicle_id;

        public String getReserv_id() {
            return reserv_id;
        }

        public void setReserv_id(String reservationid) {
            this.reserv_id = reservationid;
        }

        public String getDurationHrs() {
            return duration_hrs;
        }

        public void setDurationHrs(String hrs) {
            this.duration_hrs = hrs;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCustomerID() {
            return customer_id;
        }

        public void setCustomerID(String customerID) {
            this.customer_id = customerID;
        }

        public String getVehicleID() {
            return vehicle_id;
        }

        public void setVehicleID(String vehicleID) {
            this.vehicle_id = vehicleID;
        }
    }

}
