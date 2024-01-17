package serializableTutorial;

import java.io.*;

public class Executor {
    public void execute() throws Exception{
        User user = new User(100);
        
        File userDataFile = new File("user_data");
        FileOutputStream fileOutputStream = new FileOutputStream(userDataFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(userDataFile);
        ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream);
        User userRead = (User) objectInputStream.readObject();
        objectInputStream.close();
        
        System.out.println(userRead.health);
    }
}
