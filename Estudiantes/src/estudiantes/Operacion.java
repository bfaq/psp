package estudiantes;

public class Operacion {
	private String label;

	private double nta1,nta2,nta3,res;
	public Operacion(double nta1, double nta2, double nta3){
		this.nta1 = nta1;
		this.nta2 = nta2;
		this.nta3 = nta3;
	}
	public void resultado() {
		res = ((nta1 * 0.35) + (nta2 * 0.35) + (nta3 * 0.30));
	}
	public String mostrar() {
		resultado();
		if(res>=3) {
			label = "El alumno ha APROBADO la materia! nota: "+res;
		}else {
			label = "El alumno ha REPROBADO la materia! nota: "+res;
		}
		return label;
	}
	public double mostrarNota() {
		resultado();
		return res;
		
	}
	
}