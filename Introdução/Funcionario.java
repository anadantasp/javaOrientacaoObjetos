package pacoteJava;

import java.text.NumberFormat;

public class Funcionario {
	private String nomeFuncionario;
	private double salario;
	private int horasTrabalhadas;
	private double valorExtras;
	
	public Funcionario (String nome,double s,int horas,double horaExtra)
	{
		this.nomeFuncionario = nome;
		this.salario = s;
		this.horasTrabalhadas=horas;
		this.valorExtras = horaExtra;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void calculoExtras(int horas)
	{
		if(horas>40)
		{	
		valorExtras = (horas-40)*10;
		salario = salario + valorExtras;
		}
		else
		{
			salario = salario;
		}
		
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public String formatarDinheiro()
	{
		NumberFormat formatar = NumberFormat.getCurrencyInstance();
		formatar.setMinimumFractionDigits(2);
		String formatoDinheiro = formatar.format(valorExtras);
		return formatoDinheiro;
	}
	public void imprimir()
	{
		System.out.println("\n"+nomeFuncionario+"\t\t\t"+"Salario: "+this.formatarMoeda());
	}
	public void print()
	{
		System.out.println("\n"+nomeFuncionario+"\t\t\t"+"Valor horas extras: "+this.formatarDinheiro()+"\t\t"+"Salário total: "+this.formatarMoeda());
		System.out.println("\nOBS: O valor de horas extras só se aplica caso o número de horas semanais ultrapasse 40 horas");
	}
}
