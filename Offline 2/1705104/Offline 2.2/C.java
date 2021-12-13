package Offline2;


public class C implements Parser {
    private Aesthetics font;
    private Aesthetics style;
    private Aesthetics color;
    private String extention;

    public C() {
        style=new style();
        color=new color();
        extention="c";
        font=new font();
        style.setName("Normal");
        color.setName("Blue");
        font.setName("Courier New");
    }

    public String getFont() {
        return font.getName();
    }

    public void setFont(String Font) {
        font.setName(Font);
    }
}
