package dmacc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Palette;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PaletteRepository;

@SpringBootApplication
public class Week8ColorsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8ColorsApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Palette p = appContext.getBean("palette", Palette.class);
		
		System.out.println(p.toString());
		
		((AbstractApplicationContext) appContext).close();
	}
	
	@Autowired
	PaletteRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext (BeanConfiguration.class);
		
		Palette p = appContext.getBean("palette", Palette.class);
		p.setName("Pikachu");
		String pikachuColors = "f6e652, f6bd20, 9c5200, de9400, 623108, 41414a, 292929, fff6a4, c52018, e65a41, ffffff, 737383";
		p.setColors(pikachuColors);
		p.setCount(12);
		repo.save(p);
		
		List<Palette> palettes = repo.findAll();
		for (Palette palette : palettes) {
			System.out.println(palette.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
