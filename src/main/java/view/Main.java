package view;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.Repository;

public class Main {

    public static void main(String[] args) {
    	//Declaracion de context necesario para spring
    	final AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });
    	context.registerShutdownHook();
        Repository repository = new Repository();
//        VoteUC useCase1 = new VoteUC(repository);
        VoteUC useCase1 = (VoteUC) context.getBean("uc1");
        repository = useCase1.endUserCase();
        ResultElectionUC useCase2 = (ResultElectionUC) context.getBean("uc2");
    }
    
}
