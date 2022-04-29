
package mentoria.gft.start;

import mentoria.gft.start.Models.Endereco;
import mentoria.gft.start.Models.Gerente;
import mentoria.gft.start.Models.OperadorCaixa;
import mentoria.gft.start.Models.Vendedor;

public class Main {
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco("Zulmiro trova","Rua sem Saida","jardim santo andre");
        
        Vendedor vendedor1= new Vendedor();
        vendedor1.setDocumento("488625154");
        vendedor1.setNome("Allan Kelvin dos santos");
        vendedor1.setValorSalario(2900.0);
        vendedor1.setEnderco(endereco1);
        
        System.out.println(vendedor1);
        
        OperadorCaixa operador1 = new OperadorCaixa("488625154","Marcos",1500.0,endereco1);
        
        Gerente gerente1 = new Gerente();
        
        gerente1.setDocumento("45646587");
        gerente1.setEndereco(endereco1);
        gerente1.setHorasTrabalhadas(12);
        gerente1.setNome("Camila");
        gerente1.setValorHora(20.0);
        gerente1.setValorRemuneracao(5000.0);
        
        gerente1.calculaRemunecao();
        gerente1.calculaBonificacao(3.0);
        
        System.out.println(gerente1);
    }
    
}
