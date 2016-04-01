package controller;

import crowdfunding.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CategoryService;
import service.ProjectService;

@Controller
@RequestMapping("/categories/{categoryId}/projects/{projectId}")
public class DonateController {
    @Autowired
    ProjectService projectService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/donate")
    public String donate(Model model,@PathVariable int categoryId,@PathVariable int projectId) {

        Project project = projectService.findById(projectId);

        model.addAttribute("projectId",projectId);
        model.addAttribute("project",project);
        model.addAttribute("categories",categoryService.selectAll());

        return "donate";
    }
}
