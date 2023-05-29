import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface Arquivo {
    default void escrever(Jogo jogo) {
        try {
            FileWriter file = new FileWriter("Jogos.txt",true);
            file.write(jogo.getNome() + ";");
            file.write(jogo.getGenero() + ";");
            file.write(jogo.getPreco() + "\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    default ArrayList ler() {
        ArrayList arquivo_formatado = new ArrayList<>();
        try {
            List<String> arquivo = Files.readAllLines(Path.of("Jogos.txt"));

            for (int i = 0; i < arquivo.size(); i++) {
                arquivo_formatado.add(arquivo.get(i).split(";"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arquivo_formatado;
    }
}
