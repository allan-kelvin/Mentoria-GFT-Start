
package mentoria.gft.start.Models;


public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco enderco;

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco enderco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.enderco = enderco;
    }
    
    public FuncionarioCLT(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEnderco() {
        return enderco;
    }

    public void setEnderco(Endereco enderco) {
        this.enderco = enderco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" + "nome=" + nome + ", documento=" + documento + ", valorSalario=" + valorSalario + ", enderco=" + enderco + '}';
    }
    
    
    
}
