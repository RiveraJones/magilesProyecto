package ec.edu.epn.proyecto.git;

import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		Producto prod = new Producto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese el nombre del producto: ");
		prod.setNombre(sc.nextLine());
		
		System.out.println("Por favor ingrese el peso del producto: ");
		prod.setPeso(sc.nextFloat());
		
		System.out.println("Por favor ingrese la cantidad de productos: ");
		prod.setCantidad(sc.nextInt());
		
		System.out.println("Por favor ingrese el tipo de producto: ");
		prod.setTipo(sc.next());
		
		System.out.println("Por favor ingrese el ancho del producto: ");
		prod.setAncho(sc.nextFloat());
		
		System.out.println("Por favor ingrese el alto del producto: ");
		prod.setAlto(sc.nextFloat());
		
		System.out.println("Por favor ingrese el largo del producto: ");
		prod.setLargo(sc.nextFloat());
		
		System.out.println("Ud. desea enviar "+prod.getCantidad()+" "+prod.getNombre()+"(s)");
		System.out.println("Peso: "+prod.getPeso());
		System.out.println("Tipo: "+prod.getTipo());
		System.out.println("Dimensiones:\nlargo: "+prod.getLargo()+" ancho: "+prod.getAncho()+" alto: "+prod.getAlto());
		
		
	}
}