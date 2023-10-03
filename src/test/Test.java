package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import empleado.*;

class Test {

	//test encargado,vendedor,otro, 1 test positivo y otro negativo
	
	TipoEmpleado tipoaux;
	float horas;
	float ventas;
	float salarioaux;
	
	float salida;
	float valorEsperado;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	//Calculo Nomina Bruta
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaVendedor() {
		horas = 0;
		ventas = 0;
		tipoaux = TipoEmpleado.vendedor;
		
		valorEsperado = 2000;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaEncargado() {
		horas = 0;
		ventas = 0;
		tipoaux = TipoEmpleado.encargado;
		
		valorEsperado = 2500;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaOtro() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaMenor0() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaMenor1000() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaMayor1000() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaMenor1500() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaMayor1500() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaHorasExtraPositiva() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculanominabrutaHorasExtraNegativa() {
		fail("Not yet implemented");
	}
	
	//Calculo de NominaNeta
	
	@org.junit.jupiter.api.Test
	void testCalculoNominaNetaPositivo() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculoNominaNetaNegativo() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculoNominaNetaMenor2100() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculoNominaNeta2100a2500() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculoNominaNetaMayor2500() {
		fail("Not yet implemented");
	}
	

}
