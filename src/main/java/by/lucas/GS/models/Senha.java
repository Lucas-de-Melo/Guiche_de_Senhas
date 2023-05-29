package by.lucas.GS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SENHAS")
public class Senha {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(nullable = false)
  private int numero;

  @Column(nullable = false, length = 11)
  private String tipo;

  @Column(nullable = false)
  private Boolean atendida; 

  
}
