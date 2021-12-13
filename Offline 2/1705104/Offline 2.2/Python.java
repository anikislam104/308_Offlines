package Offline2;

public class Python implements Parser{
    private Aesthetics font;
    private Aesthetics style;
    private Aesthetics color;
    private String extention;

    public Python() {
        style=new style();
        color=new color();
        extention="c";
        font=new font();
        style.setName("Normal");
        color.setName("Blue");
        font.setName("Consolas");
    }

    public String getFont() {
        return font.getName();
    }

    public void setFont(String Font) {
        font.setName(Font);
    }
}
