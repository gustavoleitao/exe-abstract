import java.io.*;

public abstract class Entity implements Serializable {

    public abstract String fileName();

    private boolean saveFile(){
        try (FileOutputStream f = new FileOutputStream(fileName())){
            try (ObjectOutputStream o = new ObjectOutputStream(f)){
                o.writeObject(this);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean salvar(){
        if (validar()){
            return saveFile();
        }
        return false;
    }

    public abstract boolean validar();

}
