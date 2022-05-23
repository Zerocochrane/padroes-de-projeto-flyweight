import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ClinicaTest {

    @Test
    void deveRetornarClientes() {
        Clinica clinica = new Clinica();
        clinica.cadastrarCliente("Bella", "Pastor Alemão", "O Pastor-alemão tem personalidade forte, é extremamente protetor e atencioso com a própria família");
        clinica.cadastrarCliente("Lady", "Border Collie", "A raça ficou conhecida por pastorear ovelhas e auxiliar na segurança das fazendas");
        clinica.cadastrarCliente("Luna", "Husky Siberiano", "Originado no nordeste da Ásia, essa raça possui uma espessa camada protetora de pele e pelos, como se fosse um casaco, que o mantém quente e com uma excepcional tolerância ao frio, mesmo em temperaturas congelantes" );
        clinica.cadastrarCliente("Mila", "Rottweiler ", "Eles são grandes, fortes e apesar da cara de mau são cães muito amorosos e extremamente apegados aos seus humanos");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Bella', raca='Pastor Alemão', descricao='O Pastor-alemão tem personalidade forte, é extremamente protetor e atencioso com a própria família'}",
                "Cliente{nome='Lady', raca='Border Collie', descricao='A raça ficou conhecida por pastorear ovelhas e auxiliar na segurança das fazendas'}",
                "Cliente{nome='Luna', raca='Husky Siberiano', descricao='Originado no nordeste da Ásia, essa raça possui uma espessa camada protetora de pele e pelos, como se fosse um casaco, que o mantém quente e com uma excepcional tolerância ao frio, mesmo em temperaturas congelantes'}",
                "Cliente{nome='Mila', raca='Rottweiler ', descricao='Eles são grandes, fortes e apesar da cara de mau são cães muito amorosos e extremamente apegados aos seus humanos'}");

        assertEquals(saida, clinica.getClientes());
    }
}