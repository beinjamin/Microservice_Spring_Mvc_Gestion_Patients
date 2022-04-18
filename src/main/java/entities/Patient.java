package entities;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data @AllArgsConstructor 
public class Patient {
	private Long id;
	private String nom;
	private Date dateNaissance;
	private boolean malade;
	private int score;

}
