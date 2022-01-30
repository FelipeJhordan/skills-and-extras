package Template;

public class TransformStringCapitalize extends TransformString{
    @Override
    public String transformString(String str) {
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }
}
