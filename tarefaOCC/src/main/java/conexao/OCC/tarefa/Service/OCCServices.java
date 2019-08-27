package conexao.OCC.tarefa.Service;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OCCServices {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	protected String login() {

	MultiValueMap<String, String> bodyRequest = new LinkedMultiValueMap<String, String>();
	bodyRequest.add("mode", "raw");
	bodyRequest.add("grant_type", "client_credentials");

	String token = "Bearer ".concat(apiKey);

	try {
		ResponseEntity<Map<String, Object>> login = occClient.login(token, bodyRequest);

		Map<String, Object> response = login.getBody();

		return "Bearer ".concat((String) response.get("access_token"));
	} catch (Exception e) {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
}
