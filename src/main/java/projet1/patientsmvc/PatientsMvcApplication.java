package projet1.patientsmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projet1.patientsmvc.entities.Patient;
import projet1.patientsmvc.repositories.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(PatientsMvcApplication.class, args);
	}
	//@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			patientRepository.save(new Patient(null,"Hassan",new Date(),false, 122));
			patientRepository.save(new Patient(null,"Mohamed",new Date(),true, 321));
			patientRepository.save(new Patient(null,"Yasmine",new Date(),true, 165));
			patientRepository.save(new Patient(null,"Hanae",new Date(),false, 132));

			patientRepository.findAll().forEach(p->{
				System.out.println(p.getNom());
			});
		};
	}

}
