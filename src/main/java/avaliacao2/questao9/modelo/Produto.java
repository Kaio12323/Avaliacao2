package avaliacao2.questao9.modelo;
import java.sql.Date;



public class Produto{
	private int id;
	private String nome;
	private String descricao;
	private String desconto;
	private Float valor;
	private Date datainicio;
	
	
	
	public Produto(int id, String nome, String descricao, Float valor, String desconto){
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
		this.valor = valor;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Date getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}
	@Override
	public String toString() {
		return "\nID: "+id+ "\n Nome: "+nome+"\n Descrição: "+descricao+"\n";
	}
}
