package ru.imetrica.controller;

import ru.imetrica.form.LoginForm;
import ru.imetrica.form.RegisterForm;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.imetrica.model.User;
import ru.imetrica.service.UserService;
import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.imetrica.response.AuthRegisterResponse;

/**
 * Контроллер аутентификации
 * @author Rinat N Ziganshin
 */
@Controller
@RequestMapping( value = "/auth" )
public class AuthContoller 
{
    @Resource
    private UserService UserService;
    
    @RequestMapping("/login")
    public ResponseEntity login(@Valid LoginForm loginForm, BindingResult bindingResult) 
    {
        User User = null;
        //if (!bindingResult.hasErrors()) {
            
            User = new User();
            User.setLogin("admin");
            User.setPassword("password");
            User = UserService.add(User);
        //}
        return new ResponseEntity<>(User, HttpStatus.OK);
    }
    
    @RequestMapping("/register")
    public @ResponseBody AuthRegisterResponse register(@Valid RegisterForm registerForm, BindingResult bindingResult) 
    {
        AuthRegisterResponse AuthRegisterResponse = new AuthRegisterResponse();
        User User = null;
        if (!bindingResult.hasErrors()) 
        {
            User = new User();
            User.setEmail(registerForm.getEmail());
            User = UserService.add(User);
            AuthRegisterResponse.setResult(true);
            AuthRegisterResponse.setUser(User);
            
        }
        return AuthRegisterResponse;
    }
}
