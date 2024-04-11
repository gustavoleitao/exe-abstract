import java.util.UUID;

public class Util {

    public static String filename(Class clazz, String data){
        String sufix = UUID.randomUUID().toString().substring(0,8);
        String prefix = clazz.getName().toLowerCase();
        String base = data.toLowerCase().replaceAll(" ", "_");
        return String.format("%s-%s-%s.jj", prefix, base, sufix);
    }

}
