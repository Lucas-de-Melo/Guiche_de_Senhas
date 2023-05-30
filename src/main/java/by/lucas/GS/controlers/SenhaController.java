package by.lucas.GS.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SenhaController {

  // ... outros métodos do controlador ...

  @GetMapping("/guiche")
  public String exibirGuiche(Model model) {
    // Adicione qualquer lógica adicional que você precise para a view aqui
    return "guiche";
  }

  @PostMapping("/gerar-senha-geral")
  public String gerarSenhaGeral() {
    // Lógica para gerar a senha geral
    return "redirect:/sucesso";
  }

  @PostMapping("/gerar-senha-prioritaria")
  public String gerarSenhaPrioritaria() {
    // Lógica para gerar a senha prioritária
    return "redirect:/sucesso";
  }

  @PostMapping("/gerar-senha-exames")
  public String gerarSenhaExames() {
    // Lógica para gerar a senha de exames
    return "redirect:/sucesso";
  }

  @GetMapping("/sucesso")
  public String exibirSucesso() {
    // Lógica para exibir uma página de sucesso ou a senha gerada
    return "guiche";
  }
}
