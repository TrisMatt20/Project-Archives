import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class IdGenerator extends JPanel {

    static Color clrWhite = new Color(0xD3DBDD);
    static Color clrWhiteFont = new Color(0xFFFFFF);
    static Color clrGray = new Color(0x2C2B2B);
    static Color clrLightGray = new Color(0x575757);
    static Color clrBlack = new Color(0x000000);

    public IdGenerator(String lastName, String firstName, String middleName, 
                String regNo, String regDate, String expDate, String bday, ImageIcon imgPic, int yAxis){
        
        this.setLayout(null);
        this.setBounds(200, yAxis, 681,417);

        this.setBackground(clrWhite);
     
        JLabel lblTitleTop = new JLabel();
        JLabel lblProfID = new JLabel();
        JLabel lblBullets = new JLabel();
        JLabel lblBarCode = new JLabel();
        JLabel lblPerson = new JLabel();
        JLabel lblBday = new JLabel(bday);
        
        URL imgurl1 = IdGenerator.class.getResource("titleTop.png");
        ImageIcon icon1 = new ImageIcon(imgurl1);
        lblTitleTop.setIcon(icon1);
        lblTitleTop.setBounds(0,0,681,126);

        URL imgurl2 = IdGenerator.class.getResource("profID.png");
        ImageIcon icon2 = new ImageIcon(imgurl2);
        lblProfID.setIcon(icon2);
        lblProfID.setBounds(17,126,430,40);

        URL imgurl3 = IdGenerator.class.getResource("bullets.png");
        ImageIcon icon3 = new ImageIcon(imgurl3);
        lblBullets.setIcon(icon3);
        lblBullets.setBounds(195,174,30,153);

        URL imgurl4 = IdGenerator.class.getResource("barCode.png");
        ImageIcon icon4 = new ImageIcon(imgurl4);
        lblBarCode.setIcon(icon4);
        lblBarCode.setBounds(0,329,447,88);
       
        lblPerson.setBounds(475,135,178,178);
        lblPerson.setIcon(imgPic);

        lblBday.setBounds(507, 354, 135, 21);
        lblBday.setFont(new Font("Monstserrat", Font.BOLD, 20));

        String[] labels = {
            "LAST NAME",
            "FIRST NAME",
            "MIDDLE INITIAL/NAME",
            "REGISTRATION NO.",
            "REGISTRATION DATE",
            "VALID UNTIL"
        };

        int yAxisLbl = 183;
        int yAxisInfo = 183;
        for(String label : labels){
            
            JLabel lblLabel = new JLabel(label);
            lblLabel.setFont(new Font("Monstserrat", Font.PLAIN, 16));
            lblLabel.setForeground(clrBlack);
            lblLabel.setHorizontalAlignment(JLabel.LEFT);
            lblLabel.setBounds(17, yAxisLbl, 180, 18);

            yAxisLbl += 25;

            this.add(lblLabel);

        };
        
        String[] infos = {
            lastName,
            firstName,
            middleName,
            regNo,
            regDate,
            expDate
        };
    
        for(String info : infos){
            
            JLabel lblInfo = new JLabel(info);
            lblInfo.setFont(new Font("Monstserrat", Font.BOLD, 16));
            lblInfo.setForeground(clrBlack);
            lblInfo.setHorizontalAlignment(JLabel.LEFT);
            lblInfo.setBounds(233, yAxisInfo, 214, 18);

            yAxisInfo += 25;

            this.add(lblInfo);

        };

        // ADD TO PANELS
        this.add(lblTitleTop);
        this.add(lblProfID);
        this.add(lblBullets);
        this.add(lblBarCode);
        this.add(lblPerson);
        this.add(lblBday);

    }

}
