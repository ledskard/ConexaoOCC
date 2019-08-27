package conexao.OCC.tarefa.Feign;

import java.awt.PageAttributes.MediaType;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import feign.Headers;

public class FeignClient {
	@PostMapping(value = "/ccadmin/v1/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@Headers("Content-Type: application/x-www-form-urlencoded")
	ResponseEntity<Map<String, Object>> login(@RequestHeader("Authorization") String token,
			@RequestBody MultiValueMap<String, String> body) {
		return null;
	}
}
