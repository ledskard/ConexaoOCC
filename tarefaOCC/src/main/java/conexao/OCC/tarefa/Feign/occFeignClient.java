package conexao.OCC.tarefa.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import conexao.OCC.tarefa.model.Example;
import conexao.OCC.tarefa.model.DTO.LoginDTO;
import conexao.OCC.tarefa.model.DTO.SearchAllDTO;
import feign.Headers;


@FeignClient(name="OccClient", url="https://ccadmin-test-zdqa.oracleoutsourcing.com")
public interface occFeignClient {
	@PostMapping(value = "/ccadmin/v1/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@Headers("Content-Type: application/x-www-form-urlencoded")
	LoginDTO Login(
		@RequestHeader("Authorization") String bearer,
		@RequestBody MultiValueMap<String, String> body);
	

	@GetMapping(value="/ccadmin/v1/orders")
	@Headers("Content-Type: applicatin/json")
	public SearchAllDTO searchAll(
			@RequestParam(name = "limit")String limit,
			@RequestHeader("Authorization") String bearer);

	@GetMapping(value="/ccadmin/v1/orders/{id}")
	public Example SearchById(
			@PathVariable(name="id") String id,
			@RequestHeader("Authorization") String bearer);
	
	
	@GetMapping(value="/ccadmin/v1/orders/")
	@Headers("Content-Type: applicatin/json")
	public SearchAllDTO searchOrderByCpf(
			@RequestParam(name = "limit") String limit,
			@RequestHeader("Authorization") String bearer,
			@RequestParam String cpf
			);
			
			
}

