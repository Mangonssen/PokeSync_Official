import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class MButton extends JButton{

    private String name;
    private String actionCode;


    public MButton(String name, StyleKit style) {
        super();
        this.actionCode = "DEFAULT";
        this.name = name;
        setOpaque(true);
        setContentAreaFilled(true);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(style.getForeground());
        setBackground(style.getBackground());
    }

    public MButton(String name, String actionCode) {
        super();
        this.actionCode = actionCode;
        this.name = name;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public void switchAction() {
        
        switch(this.getActionCode()) {
            case "ADD_POKEMON":
                System.out.println("Adding a pokemon");
                break;
            case "DEFAULT":
                System.out.println("Error: No Action set");
                break;
        }
    }

    public void setText(String text) {
        super.setText(text);
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
    }
}
