    import java.awt.*;
    import java.awt.event.*;
    import java.sql.Time;

    import javax.swing.*;

    public class MyPanel extends JPanel implements ActionListener{

        final int PANEL_WHITH = 500;
        final int PANEL_HEIGHT = 500;
        Image Messi1;
        Image backgroundImage;
        Timer timer;
        int xVelocity = 1;
        int yVelocity = 1;
        int x = 0;
        int y = 0;

        MyPanel(){
            this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WHITH));
            this.setBackground(Color.black);
            Messi1 = new ImageIcon("Messi1.png").getImage();      
            timer = new Timer(1000, null);
            timer.start();
        
        
        
            }

        public void paint(Graphics g){

            super.paint(g); // paint background

            Graphics2D g2D = (Graphics2D) g;

            g2D.drawImage(Messi1, x , y, null);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
    
            x = x + xVelocity;

        }
        }
