package Template;

import java.util.Locale;

public class TransformStringLower extends TransformString{
    @Override
    public String transformString(String str) {
        return str.toLowerCase(Locale.ROOT);
    }
}
