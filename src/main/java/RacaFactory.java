import java.util.HashMap;
import java.util.Map;

public class RacaFactory {
        private static Map<String, Raca> racas = new HashMap<>();

        public static Raca getRaca(String nome, String descricao) {
            Raca raca = racas.get(nome);
            if (raca == null) {
                raca = new Raca(nome, descricao);
                racas.put(nome, raca);
            }
            return raca;
        }
}
