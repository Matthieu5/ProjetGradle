package ProjetGradle.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model implements IModel {
    @Override
    public String getMessage() {
        try(BufferedReader isr=new BufferedReader(new InputStreamReader(Model.class.getResourceAsStream("message.txt"))))
        {
            return isr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

