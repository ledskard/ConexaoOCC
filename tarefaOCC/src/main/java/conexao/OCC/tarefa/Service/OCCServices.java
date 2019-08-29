package conexao.OCC.tarefa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import conexao.OCC.tarefa.Feign.occFeignClient;
import conexao.OCC.tarefa.model.LoginDTO;


@Service
public class OCCServices {
	
	@Autowired
	private occFeignClient occClient;

	public LoginDTO searchbyid() {
		return login();
		
	}
	
	protected LoginDTO login() {
		String apiKey ="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTc0NTc3MS02OTNkLTQxODUtOWM1OC05ODJhNTU0YzczOTgiLCJpc3MiOiJhcHBsaWNhdGlvbkF1dGgiLCJleHAiOjE1OTgwMTg5NDksImlhdCI6MTU2NjQ4Mjk0OX0=.zePYV3XnRPEFpsAgoeibgWVMGXUqHAcE9tU10Y4oRN8="; 
		MultiValueMap<String, String> bodyRequest = new LinkedMultiValueMap<String, String>();
		bodyRequest.add("mode", "raw");
		bodyRequest.add("grant_type", "client_credentials");

		String token = "Bearer ".concat(apiKey);
		LoginDTO login = occClient.Login(token, bodyRequest);

		return login;
		

	}
	
}