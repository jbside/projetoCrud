package br.com.apex.aula03;

public class Aluno {
	
	private long matricula;
	private String nome;
	private String email;
	private String curso;
	private String fone;
	private String cel;
	private String endereco;
	
	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, String email, String curso, String fone, String cel, String endereco) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.fone = fone;
		this.cel = cel;
		this.endereco = endereco;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
