package cuentas;

/** Este es el primer comentario tipo javadoc para la realización de la Tarea 4
 * 
 * @author lucia
 *  
 *  */

public class CCuenta {
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	private double getAtri() {
		return tipoInterés;
	}

	private void setAtri(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	/** Este es el último comentario para cerrar el ejercicio
	 * 
	 *   @author lucia
	 *   
	 */
}
