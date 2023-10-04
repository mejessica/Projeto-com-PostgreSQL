package model;

import java.util.Objects;

public class Proposta {
	
	private int codProposta;
	private Carro carro;
	private Funcionario funcionario;
	private Cliente cliente;
	private double valorInicial;
	private double valorVenda;
         private String status;

         public Proposta() {
		
	}
         
    public Proposta(int codProposta, Carro carro, Funcionario funcionario, Cliente cliente, double valorInicial, double valorVenda, String status) {
        this.codProposta = codProposta;
        this.carro = carro;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.valorInicial = valorInicial;
        this.valorVenda = valorVenda;
        this.status = status;
    }

    public int getCodProposta() {
        return codProposta;
    }

    public void setCodProposta(int codProposta) {
        this.codProposta = codProposta;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codProposta;
        hash = 53 * hash + Objects.hashCode(this.carro);
        hash = 53 * hash + Objects.hashCode(this.funcionario);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valorInicial) ^ (Double.doubleToLongBits(this.valorInicial) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valorVenda) ^ (Double.doubleToLongBits(this.valorVenda) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proposta other = (Proposta) obj;
        if (this.codProposta != other.codProposta) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorInicial) != Double.doubleToLongBits(other.valorInicial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorVenda) != Double.doubleToLongBits(other.valorVenda)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.carro, other.carro)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return Objects.equals(this.cliente, other.cliente);
    }

    @Override
    public String toString() {
        return "Proposta ----- "+"\n"+ "Código da proposta = " + codProposta + "\n"+ carro 
            +"\n"+  funcionario +"\n" + cliente 
             +"\n"+ "Valor inicial da proposta = " + valorInicial + "\n" +  "Valor final da proposta = " + valorVenda +"\n" +  "Status da proposta = " + status ;
    }
       
      
	
	
	


   
	

	
}
