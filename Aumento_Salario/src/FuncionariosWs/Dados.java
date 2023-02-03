package FuncionariosWs;

public class Dados {
	private int id;
	private String nome;
	private double salario;
	
	public Dados(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void newSalary(double porcentagem) {
		 salario += salario * porcentagem / 100;
	}
	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}
	
	
}
