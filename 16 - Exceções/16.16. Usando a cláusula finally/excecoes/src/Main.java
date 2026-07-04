import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path file = Path.of("/home/rafael/Repos/java/ej/16 - Exceções/16.16. Usando a cláusula finally/file.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(file);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}