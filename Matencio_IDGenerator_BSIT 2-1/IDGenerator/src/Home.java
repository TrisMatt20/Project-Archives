import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class Home {

    static Color clrWhite = new Color(0xFFFFFF);
    static Color clrGray = new Color(0x2C2B2B);
    static Color clrLightGray = new Color(0x575757);

    public static void main(String[] args){
        
		// DECLARE ALL COMPONENTS
		JFrame frm = new JFrame();

		JPanel pnlTitle = new JPanel();
		JPanel pnlContent = new JPanel();
        
        JScrollPane scr = new JScrollPane(pnlContent);

        JLabel lblTitle = new JLabel("ID TEMPLATE GENERATOR");

        // PANEL SETTINGS
        scr.setBorder(null);

        // TITLE PANEL
        pnlTitle.setLayout(new GridLayout());
        pnlTitle.setPreferredSize(new Dimension(1080, 145));
        pnlTitle.setBackground(clrLightGray);

        lblTitle.setFont(new Font("Monstserrat", Font.BOLD, 40));
        lblTitle.setForeground(clrWhite);
        lblTitle.setPreferredSize(new Dimension(664, 48));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);

        // CONTENT PANEL SETTINGS
        pnlContent.setLayout(null);
        pnlContent.setBackground(clrGray);

        // ID GENERATOR

        String [][] pros = {
            {"ANOYO", "MICA", "CAPILI", "012173", "05/05/2027", "03/31/2030", "12/17/2003", "Anoyo.png"},
            {"BARDIAGO", "PRINCESS DESIREI", "PADILLO", "034586", "05/15/2028", "03/31/2031", "11/17/2003", "Bardiago.png"},
            {"BELLEZA", "RHEALYN", "GLIM", "015056", "05/29/2029", "03/31/2032", "06/26/2004", "Belleza.png"},
            {"CASTILLO", "LAARNIE PRINCESS", "ESPINIRIO", "016945", "05/06/2027", "04/30/2030", "06/02/2004", "Castillo.png"},
            {"DEOMAMPO", "KRISTINE JANE", "MAGSINO", "0324912", "05/13/2028", "03/31/2031", "11/09/2004", "Deomampo.png"},
            {"JAYME", "KYLA YVONNE", "ROBLES", "0623448", "05/23/2029", "03/20/2032", "08/12/2004", "Jayme.png"},
            {"MALIJAN", "JUSTINE CARL", "FERNANDEZ", "021467", "05/28/2027", "04/30/2030", "05/29/2004", "Malijan.png"},
            {"MALOLOS", "ALEXA KAYE", "ROCAS", "015056", "05/27/2027", "03/31/2030", "01/22/2004", "Malolos.png"},
            {"MANAIG", "KENCIE", "MANAIG", "023781", "05/06/2027", "03/31/2030", "02/05/2004", "Manaig.png"},
            {"MANUEL", "GLENN", "SALAVANTE", "013794", "05/27/2027", "03/31/2030", "03/07/2004", "Manuel.png"},
            {"VERGARA", "CLARISE", "SANGALANG",  "046535", "05/15/2027", "03/31/2030", "07/13/2004", "Vergara.png"}
            };

        int yAxis = 72;

        for(String[] pro : pros){
            
            URL imgurl = IdGenerator.class.getResource("/"+pro[7]);
            ImageIcon icon = new ImageIcon(imgurl);
            IdGenerator pnlID = new IdGenerator(pro[0], pro[1], pro[2], pro[3], pro[4], pro[5], pro[6], icon, yAxis);
            yAxis += 477;
            pnlContent.add(pnlID);

        }

        pnlContent.setPreferredSize(new Dimension(1080, yAxis));

        // SET FRAME SETTINGS
        URL imgurl = IdGenerator.class.getResource("prc.png");
        ImageIcon icon = new ImageIcon(imgurl);
		frm.setTitle("ID TEMPLATE GENERATOR");
		frm.setVisible(true);
		frm.setSize(1080, 720);
		frm.setLayout(new BorderLayout());
        frm.setIconImage(icon.getImage());
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
        frm.setResizable(false);

        // ADD TO PANELS
        frm.add(pnlTitle, BorderLayout.NORTH);
        frm.add(scr, BorderLayout.CENTER);

        pnlTitle.add(lblTitle);

    }
}
