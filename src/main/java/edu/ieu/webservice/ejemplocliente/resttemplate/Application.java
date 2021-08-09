package edu.ieu.webservice.ejemplocliente.resttemplate;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Application {
	private static final String ruta = "http://localhost:8080/api/usuario/";
	public static void main(String[] args) {
		RestTemplate plantilla = new RestTemplate();

		@SuppressWarnings("unchecked")
//		List<Usuario> lista = plantilla.getForObject(ruta, List.class);
		
		ResponseEntity<List<Usuario>> responseEntity = 
				  plantilla.exchange(ruta, HttpMethod.GET, null,
				    new ParameterizedTypeReference<List<Usuario>>() {}
				  );
		List<Usuario> lista = responseEntity.getBody();
		for(Usuario user: lista) {
			System.out.println( user.toString() );
		}
		
		
		Usuario user = plantilla.getForObject(ruta + 1, Usuario.class);
		System.out.println("usuario 1: " + user.toString() );
		
		user.setApellidos("Prueba");
		
		plantilla.put( ruta + 1, user);
		
		user = plantilla.getForObject(ruta + 1, Usuario.class);
		System.out.println("usuario 1 actualizado: " + user.toString() );
		
		//SpringApplication.run(Application.class, args);
//		SpringApplication app = new SpringApplication(Application.class);
//		
//		app.run(args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		RestTemplate plantilla = new RestTemplate();
//		
//		@SuppressWarnings("unchecked")
//		List<Usuario> lista = plantilla.getForObject(ruta, List.class);
//		for(Usuario user: lista) {
//			System.out.println( user.toString() );
//		}
//	}

	
	
}
