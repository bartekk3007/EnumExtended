import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Size.SMALL);
        Size size = Enum.valueOf(Size.class, "MEDIUM");
        System.out.println(size);
        Size[] values = Size.values();
        System.out.println(Arrays.toString(values));
        System.out.println(Size.LARGE.ordinal());
        System.out.println("Abbreviation of " + Size.LARGE + " is " + Size.LARGE.getAbbreviation());
    }
}