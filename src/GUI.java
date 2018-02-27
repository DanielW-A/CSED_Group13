import javax.swing.*;

public class GUI {
    private JTabbedPane TabbedPannel;
    private JPanel PanelMain;
    private JPanel pnlMainMenu;
    private JPanel pnlMyStats;
    private JPanel pnlSettings;
    private JButton btnStart;
    private JComboBox lstCatergory;
    private JCheckBox chkEnableNotifications;
    private JButton btnSchedule;
    private JLabel lbl1;
    private JLabel lbl2;

    public GUI() {

        JFrame frame = new JFrame();
        frame.setContentPane(PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("ProjectX");

        frame.setSize(600,500);

    }

}
