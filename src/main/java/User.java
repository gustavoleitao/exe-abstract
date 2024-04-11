import java.util.UUID;

public class User extends Entity {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String fileName() {
        return Util.filename(getClass(), name);
    }

    @Override
    public boolean validar() {
        return name.length() > 5;
    }

    public String getName() {
        return name;
    }
}
