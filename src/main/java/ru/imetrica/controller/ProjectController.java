package ru.imetrica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.imetrica.model.Project;

/**
 * Контроллер проектов
 * @author Rinat N Ziganshin
 */
@RestController
public class ProjectController 
{
    @RequestMapping("/project/get")
    public Project get(@RequestParam(value="name", defaultValue="World") String name) 
    {
        Project Project = new Project();
        Project.setId(0);
        Project.setTitle(name);
        //Project.setUserId(1);
        
        return Project;
    }
}
