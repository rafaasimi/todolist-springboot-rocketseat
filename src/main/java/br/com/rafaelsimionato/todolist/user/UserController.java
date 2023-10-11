package br.com.rafaelsimionato.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

  /**
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) numeros decimais 0.000000
   * Float (float) numeros decimais 0.00
   * char (Caracteres)
   * Date (data)
   * void (sem retorno)
   */

  @Autowired // O Spring de forma automatica gerencia esse reposito, instanciando
  private IUserRepository userRepository;

  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());
    
    if(user != null) {
      System.out.println("Usuário já existe.");
      // Mensagem de erro
      // Status Code
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
    }

    var passwordHashred = BCrypt.withDefaults()
    .hashToString(12, userModel.getPassword().toCharArray());

    userModel.setPassword(passwordHashred);

    var userCreated = this.userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }

}
