import java.awt.Color;

public class StyleKit {

    private Color foreground;
    private Color background;
    private int cornerRadius;

    public StyleKit() {
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.cornerRadius = 0;
    }
    public StyleKit(Color foreground, Color background, int cornerRadius){
        this.foreground = foreground;
        this.background = background;
        this.cornerRadius = cornerRadius;
    }
    public Color getForeground() {
        return foreground;
    }
    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }
    public Color getBackground() {
        return background;
    }
    public void setBackground(Color background) {
        this.background = background;
    }
    public int getCornerRadius() {
        return cornerRadius;
    }
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
    
}
