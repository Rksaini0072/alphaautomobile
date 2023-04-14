package com.example.demo;

import com.alphaautomobile.beans.AutomobileServics;
import com.alphaautomobile.services.impl.AutomobileServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan({"com.*"})
@EnableJpaRepositories({"com.*"})
@EntityScan("com.*")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("welcome to alpha automobile");
		AutomobileServics automobileServics = new AutomobileServics();
		automobileServics.setServiceCost(1223);
		automobileServics.setServiceDescription("car wash");
		automobileServics.setServiceId(9877);
		automobileServics.setServiceName("name");
		/*System.out.println(automobileServics.getServiceId());
		System.out.println(automobileServics.getServiceDescription());
		System.out.println(automobileServics.getServiceName());
		System.out.println(automobileServics.getServiceCost());*/
		AutomobileServicesImpl automobileServicesimpl = new AutomobileServicesImpl();
		AutomobileServics automobileServics1 = new AutomobileServics();
		automobileServics1.setServiceName("dilip");
		automobileServics1.setServiceCost(1233);
		automobileServics1.setServiceDescription("dilip");
		automobileServics1.setServiceId(255);

		automobileServicesimpl.addservic(automobileServics);
		automobileServicesimpl.addservic(automobileServics1);
		automobileServicesimpl.displayServices();
		SpringApplication.run(DemoApplication.class, args);


	}

}
