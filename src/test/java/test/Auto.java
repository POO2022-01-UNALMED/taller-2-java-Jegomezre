package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados; 
	
	int cantidadAsientos() {
		int total = 0;
		for (int i =0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				total +=1;
			}
		}
		return total;
	}
	
	String verificarIntegridad() {
		if (motor.registro != registro) {
			return "Las piezas no son originales";
		}
		
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null && asientos[i].registro != registro) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
}
