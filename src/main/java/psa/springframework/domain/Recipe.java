/**
 * 
 */
package psa.springframework.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * Created by pyaesoneaung on 23/04/2020
 *
 */
@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    
    @Lob
    private Byte[] image;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the prepTime
	 */
	public Integer getPrepTime() {
		return prepTime;
	}
	/**
	 * @param prepTime the prepTime to set
	 */
	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}
	/**
	 * @return the cookTime
	 */
	public Integer getCookTime() {
		return cookTime;
	}
	/**
	 * @param cookTime the cookTime to set
	 */
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	/**
	 * @return the servings
	 */
	public Integer getServings() {
		return servings;
	}
	/**
	 * @param servings the servings to set
	 */
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the directions
	 */
	public String getDirections() {
		return directions;
	}
	/**
	 * @param directions the directions to set
	 */
	public void setDirections(String directions) {
		this.directions = directions;
	}
	/**
	 * @return the image
	 */
	public Byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Byte[] image) {
		this.image = image;
	}
	/**
	 * @return the notes
	 */
	public Notes getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
    
    

}