import java.util.regex.PatternSyntaxException;

public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] nilaiKasumi = {80, 80, 80, 80};
        sayCongrats("kasumi", nilaiKasumi);

        sayCongrats("saaya", 80,70,60,20,30);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalvalue = total / values.length;
        if (finalvalue >= 75){
            System.out.println("selamat " + name + ", anda lulus");
        } else {
            System.out.println("maaf " + name + ", anda tidak lulus");
        }
    }
}
