package library.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("home"); 
        registry.addViewController("/showBooks").setViewName("showBooks");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/ownPage").setViewName("ownPage");
        registry.addViewController("/registerSuccess").setViewName("registerSuccess");
        registry.addViewController("/borrow").setViewName("borrow");
        registry.addViewController("/confirmation").setViewName("confirmation");
        registry.addViewController("/editAuthorities").setViewName("editAuthorities");
        registry.addViewController("/users").setViewName("users");
        registry.addViewController("/showLoans").setViewName("showLoans");
        registry.addViewController("/adBooks").setViewName("addBooks");
        registry.addViewController("/return").setViewName("return");
    }   

}
