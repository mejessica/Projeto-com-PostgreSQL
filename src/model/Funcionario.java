package model;

import java.util.Objects;

public class Funcionario {
	
	private String nome;
	private int codFuncionario;
	private String cpf;
	private String dataNascimento;
	private String login;
	private String senha;
	private double salario;
	private int cargaHoraria;
        private String status;
	
	public Funcionario() {
		
	}

    public Funcionario(String nome, int codFuncionario, String cpf, String dataNascimento, String login, String senha, double salario, int cargaHoraria, String status) {
        this.nome = nome;
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.status = status;
    }
    
     public Funcionario(String nome, int codFuncionario, String cpf, String dataNascimento, String login, String senha, double salario, int cargaHoraria) {
        this.nome = nome;
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws IllegalArgumentException {
            if(status.equalsIgnoreCase("ativo") || status.equalsIgnoreCase("inativo")) {
                this.status=status;
            }
            else throw new IllegalArgumentException("O funcionario precisa estar ativo ou inativo");
        }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.codFuncionario;
        hash = 37 * hash + Objects.hashCode(this.cpf);
        hash = 37 * hash + Objects.hashCode(this.dataNascimento);
        hash = 37 * hash + Objects.hashCode(this.login);
        hash = 37 * hash + Objects.hashCode(this.senha);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 37 * hash + this.cargaHoraria;
        hash = 37 * hash + Objects.hashCode(this.status);
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
        final Funcionario other = (Funcionario) obj;
        if (this.codFuncionario != other.codFuncionario) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (this.cargaHoraria != other.cargaHoraria) {
            return false;
        }
        if (this.status != other.status) {
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
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", codFuncionario=" + codFuncionario + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", login=" + login + ", senha=" + senha + ", salario=" + salario + ", cargaHoraria=" + cargaHoraria + ", status=" + status + '}';
    }
        
}