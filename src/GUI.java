import javax.swing.*;

public class GUI {
    private JTabbedPane TabbedPannel;
    private JTextField helloWorldTextField;
    private JPanel PanelMain;
    private JPanel pnlMainMenu;
    private JPanel pnlMyStats;
    private JPanel pnlSettings;

    public GUI() {

        JFrame frame = new JFrame();
        frame.setContentPane(PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.setSize(800,720);

    }

}
