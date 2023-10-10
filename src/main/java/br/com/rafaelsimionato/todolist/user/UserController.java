package br.com.rafaelsimionato.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }

}
