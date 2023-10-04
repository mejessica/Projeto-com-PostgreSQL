package model;

import java.util.Objects;

public class Venda {
	
	private int codVenda;
	private Carro Carro;
	private double valorVenda;
	private Funcionario funcionario;
	private Cliente cliente;
	
	public Venda() {
		
	}
	
	public Venda(int codVenda, Carro carro, double valorVenda, Funcionario funcionario, Cliente cliente) {
		this.codVenda = codVenda;
		this.Carro = carro;
		this.valorVenda = valorVenda;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

   
	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public Carro getCarro() {
		return Carro;
	}

	public void setCarro(Carro carro) {
		this.Carro = carro;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.codVenda;
        hash = 43 * hash + Objects.hashCode(this.Carro);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.valorVenda) ^ (Double.doubleToLongBits(this.valorVenda) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.funcionario);
        hash = 43 * hash + Objects.hashCode(this.cliente);
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
        final Venda other = (Venda) obj;
        if (Double.doubleToLongBits(this.valorVenda) != Double.doubleToLongBits(other.valorVenda)) {
            return false;
        }
        if (!Objects.equals(this.codVenda, other.codVenda)) {
            return false;
        }
        if (!Objects.equals(this.Carro, other.Carro)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }
        
	@Override
	public String toString() {
		return "Venda ---- "+"\n"+"Código da venda=" + codVenda +"\n" + Carro +"\n" + "Valor da venda = "+valorVenda + "\n"
				+ funcionario +"\n"+ cliente + "]";
	}

}
