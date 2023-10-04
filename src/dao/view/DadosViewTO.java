package dao.view;

public class DadosViewTO {
    
    private int codCliente;
    private String nome;
    private int codVenda;
    private double valorVenda;
    
    public DadosViewTO(){
        
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "DadosViewTO{" + "codCliente=" + codCliente + ", nome=" + nome + ", Vezes vendido=" + 
                codVenda + ", valorVenda=" + valorVenda + '}';
    }
    
}

