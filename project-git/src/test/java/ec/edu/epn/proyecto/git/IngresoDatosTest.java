package ec.edu.epn.proyecto.git;

import static org.junit.Assert.*;
import org.junit.Test;

public class IngresoDatosTest {

	 
	@Test
	public void nombreProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("nombreProTest\n");
        String actual = i.nombrePro();
        System.out.println(actual);
        String expected = "Perro";
        assertEquals(expected, actual);
	}
	
	@Test
	public void pesoProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("pesoProTest\n");
        float actual = i.pesoPro();
        System.out.println(actual);
        float expected = 23;
        assertEquals(expected, actual, 0);
	}
	@Test
	public void cantidadProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("cantidadProTest\n");
        int actual = i.cantidadPro();
        System.out.println(actual);
        int expected = 3;
        assertEquals(expected, actual);
	}
	
	@Test
	public void tipoProtest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("tipoProTest\n");
        String actual = i.tipoPro();
        System.out.println(actual);
        String expected = "Animal";
        assertEquals(expected, actual);
	}
	
	@Test
	public void anchoProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("anchoProTest\n");
        float actual = i.anchoPro();
        System.out.println(actual);
        float expected = 13;
        assertEquals(expected, actual, 0);
	}
	
	@Test
	public void largoProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("largoProTest\n");
        float actual = i.largoPro();
        System.out.println(actual);
        float expected = 15;
        assertEquals(expected, actual, 0);
	}
	
	@Test
	public void altoProTest() {
		IngresoDatos i = new IngresoDatos();
        System.out.print("altoProTest\n");
        float actual = i.altoPro();
        System.out.println(actual);
        float expected = 20;
        assertEquals(expected, actual, 0);
	}	

}
