package entidades;

public class Pessoa {
	
	private String nome;
	private String email;
	private Integer id;
	
	public Pessoa () {
		
	}

	public Pessoa(String nome, String email, Integer id) {
		this.nome = nome;
		this.email = email;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + ", Email = " + email + ", Id = " + id ;
	}
	

}
