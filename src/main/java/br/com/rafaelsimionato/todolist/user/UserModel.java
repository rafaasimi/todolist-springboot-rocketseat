package br.com.rafaelsimionato.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * @Data -> Colocar Getters e Setters para todas as variveis
 * @Getters -> Colocar somente os métodos de Getters
 * @Setters -> Colocar somente os métodos de Setters
 */

@Data
@Entity(name="tb_users")
public class UserModel {
  
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  // @Column(name="usuario")
  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
