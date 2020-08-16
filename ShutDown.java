import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Aug 15 20:33:51 CST 2020
 */



/**
 * @author https://zhile.io
 */
public class ShutDown {
    public static void main(String[] args) {
        var s  = new ShutDown();

    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        try {
            Runtime.getRuntime().exec("shutdown -s -t "+textPane1.getText());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    ShutDown()
    {   initComponents();
        frame1.setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        try {
            Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        frame1 = new JFrame();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        textPane1 = new JTextPane();
        button1 = new JButton();
        button2 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[grow,center]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("\u8bf7\u8f93\u5165\u5012\u8ba1\u65f6\u5173\u673a\u65f6\u95f4(s)");
            frame1ContentPane.add(label1, "cell 0 0");

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(textPane1);
            }
            frame1ContentPane.add(scrollPane2, "tag other,cell 0 1,alignx center,growx 0");

            //---- button1 ----
            button1.setText("\u786e\u5b9a");
            button1.addActionListener(e -> button1ActionPerformed(e));
            frame1ContentPane.add(button1, "cell 0 2");

            //---- button2 ----
            button2.setText("\u53d6\u6d88\u5173\u673a");
            button2.addActionListener(e -> button2ActionPerformed(e));
            frame1ContentPane.add(button2, "cell 0 3");
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame frame1;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JTextPane textPane1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
