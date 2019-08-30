package conexao.OCC.tarefa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import conexao.OCC.tarefa.Service.OCCServices;

@RestController
public class OCCcontroller {
	
	
	@Autowired
	private OCCServices occServices;
	
	@GetMapping("/getToken")
	public ResponseEntity<?> getToken(){
		return ResponseEntity.ok(occServices.login());
	}
	
	@GetMapping("/getOrders")
	public ResponseEntity<?> SearchTenOrders(){
		return ResponseEntity.ok(occServices.searchTenUsers());
	}
	
	@GetMapping("/getOneOrder/{id}")
	public ResponseEntity<?> searchOneOrder(@PathVariable("id")String id){
		return ResponseEntity.ok(occServices.SearchOneUser(id));
	}
		
}
