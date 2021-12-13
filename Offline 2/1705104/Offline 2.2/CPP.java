package Offline2;

public class CPP implements Parser{
    private Aesthetics font;
    private Aesthetics style;
    private Aesthetics color;
    private String extention;

    public CPP() {
        style=new style();
        color=new color();
        extention="cpp";
        font=new font();
        style.setName("Normal");
        color.setName("Blue");
        font.setName("Monaco");
    }

    public String getFont() {
        return font.getName();
    }

    public void setFont(String Font) {
        font.setName(Font);
    }
}
