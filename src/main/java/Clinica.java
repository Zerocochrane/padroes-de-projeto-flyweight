import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrarCliente(String nomeCliente, String nomeRaca, String descricaoRaca){
        Raca raca = RacaFactory.getRaca(nomeRaca, descricaoRaca);
        Cliente cliente = new Cliente(nomeCliente, raca);
        clientes.add(cliente);
    }

    public List<String> getClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes){
            saida.add(cliente.toString());
        }
        return saida;
    }
}
