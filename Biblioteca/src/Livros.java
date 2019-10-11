import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Livros implements Identificavel{
	
	@Id
	@GeneratedValue(generator="livros_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="livros_seq", sequenceName="livros_seq")
	
	
	private int id;
	private int ISBN;
	private String titulo;
	private Date data;
	private String editora;
	private String autores;
	
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	Categoria c;
	
	@ManyToOne
	@JoinColumn(name = "id_editora")
	Editora e;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	@Override
	public void setId(Integer id) {
				
	}
	
	
}
