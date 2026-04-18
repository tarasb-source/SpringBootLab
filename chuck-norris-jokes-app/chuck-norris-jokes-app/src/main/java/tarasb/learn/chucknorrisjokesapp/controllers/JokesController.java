package tarasb.learn.chucknorrisjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tarasb.learn.chucknorrisjokesapp.services.JokeServiceImpl;

@Controller
public class JokesController {

  private final JokeServiceImpl jokeService;

  public JokesController(JokeServiceImpl jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {
    model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }
}
