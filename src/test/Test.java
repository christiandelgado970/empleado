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
		horas = 0;
		ventas = 0;
		tipoaux = TipoEmpleado.vendedor;
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	//Calculo Nomina Bruta
	
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaVendedor() {
		
		valorEsperado = 2000;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaEncargado() {
		tipoaux = TipoEmpleado.encargado;
		
		valorEsperado = 2500;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaOtro() {
		tipoaux = TipoEmpleado.otro;
		
		valorEsperado = -1;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaMenor0() {
		ventas = -200;
		
		valorEsperado = 2000;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaMenor1000() {
		ventas = 800;
		
		valorEsperado = 2000;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaMayoroIgual1000Menor1500() {
		ventas = 1400;
		
		valorEsperado = 2100;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaMayoroIgual1500() {
		ventas = 1600;
		
		valorEsperado = 2200;
		salida = empleado.calculanominabruta(tipoaux,ventas,horas);
		
		assertEquals(valorEsperado, salida);
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaHorasExtraPositiva() {
		fail("Not yet implemented");
	}
	@org.junit.jupiter.api.Test
	void testCalculaNominabrutaHorasExtraNegativa() {
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
