
package rent_a_car;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
import javax.swing.table.AbstractTableModel;

public class ViewVehicle {
    
    
    public ViewVehicle() throws FileNotFoundException, IOException {

        JFrame frame = new JFrame();

        // frame.setLayout(new BorderLayout());
        JTable table = new JTable();

        JPanel SearchPanel=new JPanel();
        JPanel toppanel = new JPanel();
        JPanel btnpanel = new JPanel();
        JLabel reservationslable=new JLabel("           Vehicles");
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
        JTextField Search=new JTextField(){
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
        
        JButton Search_btn=new JButton("Search"){
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
        Search.setPreferredSize(new Dimension(240,30));
        Search.setMaximumSize(new Dimension(240, 30));
        
        Search_btn.setPreferredSize(new Dimension(140,40));
        Search_btn.setMaximumSize(new Dimension(140,40));
        
        
        
      //  Search_btn.setMaximumSize(new Dimension(120, 30));
        reservationslable.setPreferredSize(new Dimension(340,90));
        reservationslable.setMaximumSize(new Dimension(340,90));
        reservationslable.setFont(TitleFont);
        reservationslable.setForeground(color2);
        reservationslable.setBackground(color1);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l.setBorder(border);
        reservationslable.setBorder(border);
        reservationslable.setOpaque(true);
        l.setPreferredSize(new Dimension(300,40));
        l.setMaximumSize(new Dimension(300,40));
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
        frame.add(SearchPanel,BorderLayout.NORTH);
        frame.setTitle("View Vehicles");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
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
                HomeScreen home=new HomeScreen();
            }
        });
        
        Update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               String veh_id_update= JOptionPane.showInputDialog("Please input Vehicle ID:");
            }
        });
        
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               String veh_id_delete= JOptionPane.showInputDialog("Please input Vehicle ID:");
            }
        });

    }
    class PropertyTableModel extends AbstractTableModel {

        private ArrayList<Property> list = new ArrayList<Property>();
        private String[] columnNames = {"Vehicle ID", "Vehicle Name", "Make", "Model", "Type", "Franchise ID"};

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
                    return list.get(rowIndex).getVehicle_id();
                case 1:
                    return list.get(rowIndex).getVehicleName();
                case 2:
                    return list.get(rowIndex).getMake();
                case 3:
                    return list.get(rowIndex).getModel();
                case 4:
                    return list.get(rowIndex).getType();
                case 5:
                    return list.get(rowIndex).getFranchise_id();
                default:
                    return null;
            }
        }
    }

    class Property {

        private String vehicle_id;
        private String vehicle_name;
        private String make;
        private String model;
        private String type;
        private String franchise_id;
       

        public String getVehicle_id() {
            return vehicle_id;
        }

        public void setVehicle_id(String vehicleid) {
            this.vehicle_id = vehicleid;
        }

        public String getVehicleName() {
            return vehicle_name;
        }

        public void setVehicleName(String vehiclename) {
            this.vehicle_name = vehiclename;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String Make) {
            this.make = Make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFranchise_id() {
            return franchise_id;
        }

        public void setFranchise_id(String franchise) {
            this.franchise_id = franchise;
        }

    }

}
