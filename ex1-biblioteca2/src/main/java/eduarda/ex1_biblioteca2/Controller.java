package eduarda.ex1_biblioteca2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/biblioteca")
public class Controller {

    private List<Livro> livros;

    public Controller() {
        livros = new ArrayList<>();
        livros.add(new Livro(1, "Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro(2, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        livros.add(new Livro(3, "1984", "George Orwell", 1949));
    }

    @GetMapping("/livros")
    public List<Livro> getLivros(){
        return livros;
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping
    public String mensagemDeBemVindo() {
        return "Bem vindo a nossa Biblioteca!";
    }   

    // @GetMapping("/livros")
    // public String getLivros() {
    //     return "Lista de livros";
    // }
    
}
