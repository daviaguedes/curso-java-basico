package aula46;

public class Exercicio {

	public static void main(String[] args) {
		
		FiguraGeometrica[] figura = new FiguraGeometrica[6];
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		circulo.setNome("Circulo");
		circulo.setCor("Vermelho");
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("Quadrado");
		quadrado.setCor("Azul");
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(5);
		triangulo.setBase(7);
		triangulo.setNome("Triângulo");
		triangulo.setCor("Verde");
		
		Cubo cubo = new Cubo();
		cubo.setLado(4);
		cubo.setNome("Cubo");
		cubo.setCor("Roxo");
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		cilindro.setNome("Cilindro");
		cilindro.setCor("Rosa");
		
		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		piramide.setNome("Pirâmide");
		piramide.setCor("Amarelo");
		
		figura[0] = circulo;
		figura[1] = quadrado;
		figura[2] = triangulo;
		figura[3] = cubo;
		figura[4] = cilindro;
		figura[5] = piramide;
		
		for(FiguraGeometrica figuras : figura) {
			System.out.println("-----" + figuras.getNome()+ "-----" +  "\n");
			System.out.println(figuras.getCor());
			
			if(figuras instanceof Figura2D) {
				System.out.println("A área é " + ((Figura2D) figuras).calcularArea()+ "\n");
			}
			
			if(figuras instanceof Figura3D) {
				System.out.println("A área é " + ((Figura3D) figuras).calcularArea()+ "\n");
				System.out.println("O volume é " + ((Figura3D) figuras).calcularVolume()+ "\n");
			}
		}
	}

}
