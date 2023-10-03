package empleado;

public class empleado {

	private static float salario = 2000;
	private static float salarioNeto = 2000;
	private static float hExtraValor = 30;
	
	public static float calculanominabruta(TipoEmpleado tipo, float ventasMes, float horasExtra)
	{
		
		//Tipo de empleado
		if(tipo == TipoEmpleado.encargado)
		{
			salario = 2500;
		}
		else if(tipo == TipoEmpleado.vendedor)
		{
			salario = 2000;
		}
		else
		{
			salario = -1;
		}
		
		//Cantidad de ventas
		if(ventasMes >= 1000 && ventasMes < 1500)
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
	
	public static float calculoNominaNeta(float nominaBruta)
	{
		//Sin Comisión
	    salarioNeto = salario;
		//Comision 15%
		if (salario >= 2100 && salario < 2500)
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
