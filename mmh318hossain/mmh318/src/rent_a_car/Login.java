package rent_a_car;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicBorders;

public class Login {

    JFrame frame;
    JPasswordField password_txt;
    JTextField username_txt;

    public Login() {
        frame = new JFrame("Rent A Car");
        frame.setSize(920, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        URL url = getClass().getResource("login-logo.png");
        ImageIcon imageIcon = new ImageIcon(url.getPath());
        username_txt = new JTextField(20) {
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
        password_txt = new JPasswordField(14) {
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

        JButton Login = new JButton("Login") {
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

        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(240, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back
        JLabel login_label = new JLabel(imageIcon);
        JLabel username = new JLabel("Username:");
        JLabel password = new JLabel("Password:");
        Color color1 = new Color(90, 130, 199);
        Color color2 = new Color(255, 255, 255);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        password_txt.setFont(f);
        username_txt.setFont(f);

        Login.setFont(f);

        // Login.setBorder(new RoundedCornerBorder());
        Login.setBackground(color1);
        Login.setForeground(color2);

        Login.setBounds(480, 430, 120, 50);
        password.setLabelFor(password_txt);
        username.setLabelFor(username_txt);
        username.setFont(f);
        password.setFont(f);
        username.setForeground(color1);
        password.setForeground(color1);
        username.setBounds(240, 280, 140, 50);
        username_txt.setBounds(420, 280, 200, 50);
        //  username_txt.setBorder(border);
        password.setBounds(240, 360, 140, 50);
        password_txt.setBounds(420, 360, 200, 50);
        //  password_txt.setBorder(border);
        login_label.setBounds(330, 40, 240, 120);
        frame.add(login_label);
        frame.add(username);
        frame.add(password);
        frame.add(username_txt);
        frame.add(password_txt);
        frame.add(Login);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //    DropShadow shadow = new DropShadow();
        //  Login.setFocusable(true);
        // Border border = new BasicBorders.FieldBorder(Color.BLACK, 13);
        username_txt.setToolTipText("<html><b><font color=red>"
                + "Please enter username here" + "</font></b></html>");

        password_txt.setToolTipText("<html><b><font color=red>"
                + "Please enter password here" + "</font></b></html>");

      //  username_txt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
        Login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (username_txt.getText().equalsIgnoreCase("admin") && isPasswordCorrect(password_txt.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Successfully LoggedIn", "Success", JOptionPane.INFORMATION_MESSAGE);
                    frame.setVisible(false);
                    frame.dispose();
                    HomeScreen home=new HomeScreen();
                    
                }
                else if(!username_txt.getText().equalsIgnoreCase("admin") || !isPasswordCorrect(password_txt.getPassword())){
                    JOptionPane.showMessageDialog(null, "The username or password is wrong", "Success", JOptionPane.ERROR_MESSAGE);
                    username_txt.setText("");
                    password_txt.setText("");
                    
                }

            }
        });

    }

    private static boolean isPasswordCorrect(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = {'i', 'a', 'm', 'a', 'd', 'm', 'i', 'n'};

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(input, correctPassword);
        }

        //Zero out the password.
        Arrays.fill(correctPassword, '0');

        return isCorrect;
    }

}

class RoundedCornerBorder extends AbstractBorder {

    private static final Color ALPHA_ZERO = new Color(0x0, true);

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape border = getBorderShape(x, y, width - 1, height - 1);
        g2.setPaint(ALPHA_ZERO);
      //  g2.setPaint(new Color(90,130,199));
        Area corner = new Area(new Rectangle2D.Double(x, y, width, height));
        corner.subtract(new Area(border));
        g2.fill(corner);
        g2.setPaint(Color.GRAY);
        g2.draw(border);
        g2.dispose();
    }

    public Shape getBorderShape(int x, int y, int w, int h) {
        int r = h; //h / 2;
        return new RoundRectangle2D.Double(x, y, w, h, r, r);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(4, 8, 4, 8);
        return insets;
    }
}
