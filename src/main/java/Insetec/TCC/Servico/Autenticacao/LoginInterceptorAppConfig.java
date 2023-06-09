package Insetec.TCC.Servico.Autenticacao;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
 public class LoginInterceptorAppConfig extends WebMvcConfigurerAdapter {
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
     registry.addInterceptor(new LoginInterceptor())
         .excludePathPatterns(
         "/login",
         "/error",
         "/logar",
         "/vendor/**",
         "/js/**",
         "/favicon.ico",
         "/css/**",
         "/home2",
         "/img/**",
          "/registro",
          "/registrar",
          "/registro/registrar"
         );
    }
 }

