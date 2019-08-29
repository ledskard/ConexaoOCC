package conexao.OCC.tarefa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import conexao.OCC.tarefa.Service.OCCServices;
import conexao.OCC.tarefa.model.LoginDTO;

@RestController
public class OCCcontroller {
	
	
	@Autowired
	private OCCServices occServices;
	
	@GetMapping("/batata")
	public ResponseEntity<LoginDTO> teste(){
		return ResponseEntity.ok(occServices.searchbyid());
	}
	
	
}
