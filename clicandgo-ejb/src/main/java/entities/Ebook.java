package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ebooks
 *
 */
@Entity

public class Ebook implements Serializable {

	
	private Integer id;
	private String title;
	private String author;
	private String description;
	private String category;
	private String type;
	private int nbOfWords;
	private static final long serialVersionUID = 1L;

	public Ebook() {
		super();
	} 
	
	@Override
	public String toString() {
		return "Ebook [title=" + title + ", author=" + author
				+ ", description=" + description + ", category=" + category
				+ ", type=" + type + ", nbOfWords=" + nbOfWords + "]";
	}

	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public int getNbOfWords() {
		return this.nbOfWords;
	}

	public void setNbOfWords(int nbOfWords) {
		this.nbOfWords = nbOfWords;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
   
}
