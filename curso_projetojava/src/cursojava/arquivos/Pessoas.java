package cursojava.arquivos;

import java.util.Objects;

public class Pessoas {
	
	private String email;
	private String nome;
	private int idade;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoas [email=" + email + ", nome=" + nome + ", idade=" + idade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoas other = (Pessoas) obj;
		return Objects.equals(email, other.email) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	
}
