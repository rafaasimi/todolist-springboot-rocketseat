package br.com.rafaelsimionato.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="tb_tasks")
public class TaskModel {
  
  /*
   * ID
   * Usuário (ID_USUARIO)
   * Título
   * Descrição
   * Data de início
   * Data de término
   * Prioridade da tarefa
   */

   @Id
   @GeneratedValue(generator = "UUID")
   private UUID id;

   @Column(length = 50)
   private String title;
   private String description;
   private LocalDateTime startAt;
   private LocalDateTime endAt;
   private String priority;

   private UUID idUser;

   @CreationTimestamp
   private LocalDateTime createdAt;

}
