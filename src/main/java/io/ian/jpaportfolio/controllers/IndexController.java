package io.ian.jpaportfolio.controllers;

import io.ian.jpaportfolio.models.Project;
import io.ian.jpaportfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @Autowired
    private ProjectRepository projectRepo;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/projects")
    public String projects(Model model) {
        model.addAttribute("project", new Project());
        model.addAttribute("myProjects", projectRepo.findAll());
        return "projects";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    public String projectsGet() {
        return "redirect:/projects";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String indexGet() {
        return "redirect:/";
    }

    @RequestMapping(value = "/about")
    public String aboutGet() {
        return "about";
    }
}

