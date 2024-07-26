import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NFrame extends JFrame implements ActionListener {

    private ArrayList<MButton> buttons;
    private MButton scopedButton;

    
    public NFrame() {
        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.buttons = new ArrayList<MButton>();
    }
    public NFrame(int width, int height) {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.buttons = new ArrayList<MButton>();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.scopedButton = (MButton) e.getSource();
        this.scopedButton.switchAction();
    }  
    public void setScopedButton(MButton button) {
        this.scopedButton = button;
    }
    public MButton getScopedButton() {
        return this.scopedButton;
    }
    public ArrayList<MButton> getButtons() {
        return this.buttons;
    }



    public void createButton(String name, int x, int y, int width, int height, StyleKit style) {
        MButton button = new MButton(name, style);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        button.setText("[UNNAMED BUTTON]");
        this.add(button);
        this.buttons.add(button);
    }
    
    
    
}
