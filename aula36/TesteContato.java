package aula36;

public class TesteContato {

	public static void main(String[] args) {


		Contato contato = new Contato();
		
		contato.setNome("Kirby");
		
		Endereco endereco = new Endereco();
		
		endereco.setCep("ASDASDASD");
		endereco.setCidade("Green Greens");
		endereco.setEstado("Dreamland");
		
		contato.setEndereco(endereco);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getTelefones());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		Telefone telefone1 = new Telefone();
		
		telefone1.setTipo("Celular");
		telefone1.setNumero("99999-9999");
		telefone1.setDdd("085");
		
		Telefone telefone2 = new Telefone();
		
		telefone2.setTipo("Residencial");
		telefone2.setNumero("88888-8888");
		telefone2.setDdd("085");
		
		Telefone[] telefones = new Telefone[2];
		
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
