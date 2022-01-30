package Template;

import java.util.Scanner;

public abstract class TransformString {
    public  abstract String transformString(String str);

    public void ActionString() {
        System.out.println("Digite uma nova String");
        Scanner sc = new Scanner(System.in);
        String entrada =  sc.nextLine();
        System.out.println(transformString(entrada));
    }

}
