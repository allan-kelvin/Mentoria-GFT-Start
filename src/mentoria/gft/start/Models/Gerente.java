
package mentoria.gft.start.Models;

public class Gerente extends FuncionarioPJ implements CalculaBonificao{
    private Double valorBonificao;
    
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
       this.valorBonificao =(super.getValorRemuneracao()*(porcentagemBonificacao/100))+100d;
    }

    @Override
    public String toString() {
        return "Gerente{" + "valorBonificao=" + valorBonificao + '}';
    }
    
    
}
