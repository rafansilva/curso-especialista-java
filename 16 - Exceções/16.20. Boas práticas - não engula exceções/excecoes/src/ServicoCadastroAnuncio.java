import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of("/home/rafael/Repos/java/ej/16 - Exceções/16.20. Boas práticas - não engula exceções/avd", codigo + ".txt");

        /** Não engula exceções/não deixe o catch vazio. De um tratamento para exceções quando possível.
            try {
                Files.writeString(arquivo, descricao);
            } catch (IOException e) {
            }
         */

        /**
            try {
                Files.writeString(arquivo, descricao);
            } catch (IOException e) {

                // É melhor usar alguma biblioteca de logging para fazer isso.
                System.out.println("Erro ao escrever no arquivo. Ignorado...");
                e.printStackTrace();
            }
         */

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            throw new CadastroAnuncioException("Erro ao ler arquivo", e);
        }
    }
}
