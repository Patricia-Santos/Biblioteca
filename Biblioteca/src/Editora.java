import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Editora implements Identificavel{
	
	@Id
	@GeneratedValue(generator="editora_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="editora_seq", sequenceName="editora_seq")
	
	private int id;
	private String nome;
	private String cidade;
	

	@OneToMany(mappedBy = "e")
	private Set<Livros> livros;
	
	
	public Integer getId() {
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public void setId(Integer id) {
				
	} 
	
	
	
	
}
