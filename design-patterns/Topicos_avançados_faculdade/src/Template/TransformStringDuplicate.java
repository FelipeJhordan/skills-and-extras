package Template;

public class TransformStringDuplicate extends TransformString{
    @Override
    public String transformString(String str) {
        return str+str;
    }
}
