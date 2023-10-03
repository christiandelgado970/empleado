package empleado;

public class empleado {

	private float salario = 2000;
	private float salarioNeto = 2000;
	private float hExtraValor = 30;
	
	public float calculanominabruta(TipoEmpleado tipo, float ventasMes, float horasExtra)
	{
		//Tipo de empleado
		if(tipo == TipoEmpleado.encargado)
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
		salario = salario + hExtraValor * horasExtra;
		
		return salario;
	}
	
	float calculoNominaNeta(float nominaBruta)
	{
		//Sin Comisión
		if (salario < 2100)
		{
			salarioNeto = salario;
		}
		//Comision 15%
		else if (salario >= 2100 && salario < 2500)
		{
			salarioNeto = salario * (float) 0.85;
		}
		//Comision 18%
		else if (salario > 2500)
		{
			salarioNeto = salario * (float) 0.82;
		}
		
		return salarioNeto;
	}
}
