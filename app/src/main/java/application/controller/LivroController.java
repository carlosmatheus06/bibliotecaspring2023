package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.LivroRepository;

@Controller
@RequestMapping("/Livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepo;
    
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAtribute("livros", livrRepo.fidnAll());
        return "/WEB-INF/livro/list.jsp";
    }
}
