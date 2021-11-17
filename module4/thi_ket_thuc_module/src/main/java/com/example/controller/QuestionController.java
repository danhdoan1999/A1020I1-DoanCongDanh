package com.example.controller;

import com.example.model.Question;
import com.example.model.QuestionType;
import com.example.service.QuestionService;
import com.example.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;

@Controller
public class QuestionController {
    @Autowired
    private QuestionTypeService questionTypeService;
    @Autowired
    private QuestionService questionService;
    @ModelAttribute("questionType")
    public Iterable<QuestionType> questionTypes(){
        return questionTypeService.findAll();
    }
    @GetMapping("/")
    public String showListQuestion(@RequestParam("keyword")Optional<String> title,
                                   @RequestParam("keyword")Optional<String> nameType,
                                   Model model, @PageableDefault(value = 3) Pageable pageable){
        Page<Question> questionList;
        if(!title.isPresent() || nameType.isPresent()){
            questionList = questionService.findAll(pageable);
        }else{
            questionList = questionService.findAllByQuestion_TittleOrQuestionType_Name(title.get(),nameType.get(),pageable);
        }
        model.addAttribute("questionList",questionList);
        return "question/list";
    }
    @GetMapping("/question/create")
    public String showFormCreate(Model model){
        model.addAttribute("question",new Question());
        return "question/create";
    }
    @PostMapping("/question/create")
    public String create(@Validated @ModelAttribute("question")Question question, BindingResult bindingResult , Model model , RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            return "question/create";
        }else{
            questionService.save(question);
            model.addAttribute("question",new Question());
            redirectAttributes.addFlashAttribute("message","New question has added to your List  !!! ");
            return "redirect:/";
        }
    }
    @GetMapping("/question/delete/{id}")
    public String removeQuestion(@PathVariable Integer id ){
        Question question = questionService.findById(id);
        questionService.delete(question);
        return "redirect:/";
    }

}
