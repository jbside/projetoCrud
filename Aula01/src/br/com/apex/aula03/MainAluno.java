package br.com.apex.aula03;

public class MainAluno {
	
		public static void main(String[] args) {
			
			Aluno aluno1 = new Aluno();
			Aluno aluno2 = new Aluno();
			
			aluno1.setMatricula(001);
			aluno1.setNome("Jesiel");
			aluno1.setEmail("jesyborges@gmail.com");
			aluno1.setCurso("Java avancado");
			aluno1.setFone("33239540");
			aluno1.setCel("996312998");
			aluno1.setEndereco("Rua Julio Moser");
			
			aluno2.setMatricula(002);
			aluno2.setNome("Paulo");
			aluno2.setEmail("paulo.jorge@gmail.com");
			aluno2.setCurso("php");
			aluno2.setFone("332394340");
			aluno2.setCel("996312458");
			aluno2.setEndereco("Rua Julio Moser");
		
		
		System.out.println(aluno1.getMatricula());
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getEmail());
		System.out.println(aluno1.getCurso());
		System.out.println(aluno1.getFone());
		System.out.println(aluno1.getCel());
		System.out.println(aluno1.getEndereco());
		System.out.println();
		
		System.out.println(aluno2.getMatricula());
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getEmail());
		System.out.println(aluno2.getCurso());
		System.out.println(aluno2.getFone());
		System.out.println(aluno2.getCel());
		System.out.println(aluno2.getEndereco());
		
		
		}
		
		

}
