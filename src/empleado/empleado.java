package empleado;

public class empleado {

	private float salario;
	
	public float calculanominabruta(TipoEmpleado tipo, float ventasMes, float horasExtra)
	{
		//Tipo de empleado
		if(tipo == TipoEmpleado.vendedor)
		{
			salario = 2000;
		}
		else
		{
			salario = 2500;
		}
		//Cantidad de ventas
		if(ventasMes >= 1000)
		{
			salario = salario + 100;
		}
		else if(ventasMes >= 1500)
		{
			salario = salario + 200;
		}
		//Horas extra
		salario = salario + 30 * horasExtra;
		
		
	}
}
