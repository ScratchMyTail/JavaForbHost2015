import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Bil bil = new Bil("ya12345", "200hk", 4, 5);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("out.data"));
            objectOutputStream.writeObject(bil);
        }
        catch (FileNotFoundException ex){
            System.out.println("fila finnes ikke");
        }
        catch (IOException ex){
            System.out.println("feil med i/o");
            ex.printStackTrace();
        }

        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("out.data"));
            Bil bil2 = (Bil) objectInputStream.readObject();
            System.out.println(bil2.getRegNr());

        }
        catch(FileNotFoundException ex){
            System.out.println("fila finnes ikke");
        }
        catch(IOException ex){
            System.out.println("feil med i/o");
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            System.out.println("klassefeil");
        }

    }
}
