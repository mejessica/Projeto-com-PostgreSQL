package model;


import java.util.Objects;

public class Carro {
	
	private int codCarro;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private double valor;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, double valor, int anoFabricacao, int codCarro) {
		this.codCarro = codCarro;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}

  
	public int getCodCarro() {
		return codCarro;
	}
	public void setCodCarro(int codCarro) {
		this.codCarro = codCarro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.codCarro;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + this.anoFabricacao;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
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
        final Carro other = (Carro) obj;
        if (this.codCarro != other.codCarro) {
            return false;
        }
        if (this.anoFabricacao != other.anoFabricacao) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }
	
	

	
	@Override
	public String toString() {
		return "Carro [codCarro=" + codCarro + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + ", valor=" + valor + "]";
	}

}
