package model;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private int codCliente;
	private String cpf;
	private String dataNascimento;
	private int telefone;
	private String endereco;
	private String email;
        private String status;
	
	public Cliente() {
		
	}

         
         
    public Cliente(int codCliente, String nome,  String cpf, String dataNascimento, int telefone, String endereco, String email, String status) {
        this.nome = nome;
        this.codCliente = codCliente;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.status = status;
    }

    public Cliente(int codCliente, String nome, String cpf, String dataNascimento, int telefone, String endereco, String email) {
        this.nome = nome;
        this.codCliente = codCliente;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
            if(status.equalsIgnoreCase("ativo") || status.equalsIgnoreCase("inativo")) {
                this.status=status;
            }
            else throw new IllegalArgumentException("O cliente precisa estar ativo ou inativo");
        }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + this.codCliente;
        hash = 13 * hash + Objects.hashCode(this.cpf);
        hash = 13 * hash + Objects.hashCode(this.dataNascimento);
        hash = 13 * hash + this.telefone;
        hash = 13 * hash + Objects.hashCode(this.endereco);
        hash = 13 * hash + Objects.hashCode(this.email);
        hash = 13 * hash + Objects.hashCode(this.status);
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
        final Cliente other = (Cliente) obj;
        if (this.codCliente != other.codCliente) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", codCliente=" + codCliente + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email + ", status=" + status + '}';
    }
	
	

 
}
