package polymorphism;
/**
 * Created by Administrator on 2017/6/12.
 */
class Glyph
{
    void draw()
    {
        System.out.println("Glyph.draw()");
    }
     Glyph()
    {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph
{
    private int radius=1;
    public RoundGlyph(int r)
    {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius="+radius);
    }
}
public class PolyConstructors
{
    public static void main(String[] args)
    {
        new RoundGlyph(5);
    }
}
