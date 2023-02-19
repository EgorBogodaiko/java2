package dz2;
import java.nio.file.Files;
import java.nio.file.Path;
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
public class task2 {
    public static void main(String[] args) {
    Path file = Path.of("file.txt");
    boolean exists =Files.exists(file);
    String towright="";
    if (exists==false){
        try {
            Files.createFile(file);
        } catch (Exception e) {
            System.out.println("Already exists");
        }  
    } 
    for (int i=0; i<100;i++){
    towright+="TEST \n";
    }
    System.out.println(towright);
        try {
            Files.writeString(file,towright);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

