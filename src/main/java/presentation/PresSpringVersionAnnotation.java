package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringVersionAnnotation {
    public static void main(String[] args) {
        // au demmarage  si vous avez trouvez @componet creer moi un objet de cette classe dans les packages définis
        ApplicationContext context=new AnnotationConfigApplicationContext("metier","dao");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("Res"+metier.calcul());
    }
}
