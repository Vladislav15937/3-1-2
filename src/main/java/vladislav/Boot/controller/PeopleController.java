package vladislav.Boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vladislav.Boot.model.User;
import vladislav.Boot.servise.UserServise;


@Controller
@RequestMapping("/")
public class PeopleController {

    private UserServise userServise;

    public PeopleController(UserServise userServise) {
        this.userServise = userServise;
    }

    @GetMapping("/")
    public String allPeople(Model model) {
        model.addAttribute("people", userServise.getAllPeople());
        return "/allPeople";
    }

    @GetMapping("/new")
    public String newPerson(Model model) {
        model.addAttribute("user", new User());
        return "/new";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        userServise.save(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", userServise.personById(id));
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
        userServise.update(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        userServise.delete(id);
        return "redirect:/";
    }
}
