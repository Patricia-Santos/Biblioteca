import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Categoria implements Identificavel{
	
	
	@Id
	@GeneratedValue(generator="categoria_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="categoria_seq", sequenceName="categoria_seq")
	
	private int id;
	private int codigo;
	private String descricao;
	
	
	@OneToMany(mappedBy = "c")
	private Set<Livros> livros;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	@Override
	public void setId(Integer id) {
		
		
	}
	
	
}
