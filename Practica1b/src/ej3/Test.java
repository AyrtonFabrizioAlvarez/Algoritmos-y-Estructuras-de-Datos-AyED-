package ej3;

public class Test {

	public static void main(String[] args) {
		Estudiante[] vectorE = new Estudiante[2];
		
		Estudiante E1 = new Estudiante();
		E1.setNombre("Ayrton");
		E1.setApellido("Alvarez");
		E1.setComision(1);
		E1.setDireccion("siempre viva 123");
		E1.setEmail("sarasa@sarasa.com");
		
		Estudiante E2 = new Estudiante();
		E2.setNombre("John");
		E2.setApellido("Doe");
		E2.setComision(2);
		E2.setDireccion("siempre viva 1234");
		E2.setEmail("sarasa2@sarasa.com");
		
		vectorE[0] = E1;
		vectorE[1] = E2;
		
		
		Profesor[] vectorP = new Profesor[3];
		
		Profesor P1 = new Profesor();
		P1.setNombre("Profesor1");
		P1.setApellido("Apellido1");
		P1.setEmail("sarasa3@sarasa.com");
		P1.setCatedra("catedra1");
		P1.setFacultad("Unlp");
		
		Profesor P2 = new Profesor();
		P2.setNombre("Profesor2");
		P2.setApellido("Apellido2");
		P2.setEmail("sarasa4@sarasa.com");
		P2.setCatedra("catedra2");
		P2.setFacultad("Unlp");
		
		Profesor P3 = new Profesor();
		P3.setNombre("Profesor3");
		P3.setApellido("Apellido3");
		P3.setEmail("sarasa4@sarasa.com");
		P3.setCatedra("catedra3");
		P3.setFacultad("Unlp");
		
		vectorP[0] = P1;
		vectorP[1] = P2;
		vectorP[2] = P3;
		
		for (int i = 0; i < vectorE.length; i++) {
			System.out.println(vectorE[i].toString());
		}
		for (int i = 0; i < vectorP.length; i++) {
			System.out.println(vectorP[i].toString());
		}
	}

}
