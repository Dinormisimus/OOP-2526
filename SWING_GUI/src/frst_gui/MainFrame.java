package frst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton mainBtn;
    private JScrollPane txtAreaScroll;

    public MainFrame(){
        super("Simple Gui app!");
        initComps();
        layoutComps();
        activateFrame();
        initFrame();
    }

    private void initFrame(){
        setSize(650, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void activateFrame() {
        mainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String line = ae.toString() + ae.paramString() + Integer.toHexString(ae.hashCode()) + "\n";
                setText2TxtArea(line);
            }
        });
        ToolBar.addActionListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccured(String eventCommand) {
                String line = eventCommand + "\n";
                setText2TxtArea(line);
            }
        });
    }

    private void initComps() {
        textArea = new JTextArea();
        mainBtn = new JButton("Click me!");
        txtAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(txtAreaScroll, BorderLayout.CENTER);
        add(mainBtn, BorderLayout.SOUTH);
        add(new ToolBar(), BorderLayout.NORTH);;
    }

    private void setText2TxtArea(String txt){
        textArea.append(txt);
    }
}
