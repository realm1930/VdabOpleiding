package be.vdab.gastenboek;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenBoekManager {

    private final static Path PAD = Path.of("/data/gastenboek.ser");
    public void schrijf(Gastenboek gastenboek){
        try (var stream = new ObjectOutputStream(
                Files.newOutputStream(PAD))){
            stream.writeObject(gastenboek);

        } catch (IOException ex){
            System.err.println(ex);
        }
    }

    public Gastenboek lees(){
        if (Files.exists(PAD)){
            try (var stream = new ObjectInputStream(
                    Files.newInputStream(PAD))){
                return (Gastenboek) stream.readObject();
            } catch (Exception ex){
                System.err.println(ex);
                return null;
            }
        }
        return new Gastenboek();
    }


}
