import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        Path arquivo = Path.of("/home/rafael/Repo/java/ej/16 - Exceções/16.8. Capturando checked exceptions/teste.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}