package conexao.OCC.tarefa.Feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import conexao.OCC.tarefa.model.LoginDTO;
import feign.Headers;


@FeignClient(name="OccClient", url="https://ccadmin-test-zdqa.oracleoutsourcing.com")
public interface occFeignClient {
	@PostMapping(value = "/ccadmin/v1/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@Headers("Content-Type: application/x-www-form-urlencoded")
	LoginDTO Login(
		@RequestHeader("Authorization") String bearer,
		@RequestBody MultiValueMap<String, String> body);
}

