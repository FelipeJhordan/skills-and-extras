package Template;

import java.util.Locale;

public class TransformStringUpper extends TransformString{
    @Override
    public String transformString(String str) {
        return str.toUpperCase(Locale.ROOT);
    }
}
