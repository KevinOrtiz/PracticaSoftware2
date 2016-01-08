package calculadora;

public class icalservice {
iCalculator calc;
 	public int addTwoNumbers(int x , int y){
 		return calc.add(x, y);
 	}
	public iCalculator getCalc() {
		return calc;
	}
	/*
	 * Autor Kevin Ortiz
	 * Descripcion : esta funcion recibe una variable calculator y lo setea al atributo de la clase
	 * Input Calculator calc
	 * output void
	 * 
	 * 
	 * 
	 * */
	public void setCalc(iCalculator calc) {
		this.calc = calc;
	}
 	
 	
  
}
