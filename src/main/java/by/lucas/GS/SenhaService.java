package by.lucas.GS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenhaService {
  
  private final RepositorioSenha repositorioSenha;

  @Autowired
  public SenhaService(RepositorioSenha repositorioSenha) {
    this.repositorioSenha = repositorioSenha;
 }

 // ADICIONAR OPERAÇÕES CRUD AQUI
}
