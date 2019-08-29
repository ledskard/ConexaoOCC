package conexao.OCC.tarefa.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginDTO {
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("links")
	private List<Link> links;
	@JsonProperty("token_type")
	private String TokenType;
	@JsonProperty("expires_in")
	private Integer expiresIn;
	
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public String getTokenType() {
		return TokenType;
	}
	public void setTokenType(String tokenType) {
		TokenType = tokenType;
	}
	public Integer getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}
	
}




//
//"access_token": "eyJhbGciOiJSUzI1NiIsImprdSI6InR6ZHFhMGMwIiwia2lkIjpudWxsLCJ4NWMiOm51bGwsIng1dSI6Imh0dHBzOi8vY2NhZG1pbi10ZXN0LXpkcWEub3JhY2xlb3V0c291cmNpbmcuY29tL2NjYWRtaW4vdjEvdGVuYW50Q2VydENoYWluIn0=.eyJpYXQiOjE1NjcxMDE1ODcsImV4cCI6MTU2NzEwMTg4Nywic3ViIjoiYWE3NDU3NzEtNjkzZC00MTg1LTljNTgtOTgyYTU1NGM3Mzk4IiwiYXVkIjoiYXBwbGljYXRpb25BY2Nlc3MiLCJjb20ub3JhY2xlLmF0Zy5jbG91ZC5jb21tZXJjZS5yb2xlcyI6WyJzZXR0aW5nc1JvbGUiLCJtYXJrZXRpbmdSb2xlIiwicHVibGlzaGluZ1JvbGUiLCJkYXNoYm9hcmRSb2xlIiwicmVwb3J0aW5nUm9sZSIsImNhdGFsb2dSb2xlIiwiZGVzaWduUm9sZSIsIm1lZGlhUm9sZSIsInByZXZpZXdSb2xlIiwiYWNjb3VudE1hbmFnZXJSb2xlIiwic2VhcmNoUm9sZSJdLCJvY2NzLmFkbWluLnJvbGVzIjpbInNldHRpbmdzUm9sZSIsIm1hcmtldGluZ1JvbGUiLCJwdWJsaXNoaW5nUm9sZSIsImRhc2hib2FyZFJvbGUiLCJyZXBvcnRpbmdSb2xlIiwiY2F0YWxvZ1JvbGUiLCJkZXNpZ25Sb2xlIiwibWVkaWFSb2xlIiwicHJldmlld1JvbGUiLCJhY2NvdW50TWFuYWdlclJvbGUiLCJzZWFyY2hSb2xlIl0sImlzcyI6Imh0dHBzOi8vY2NhZG1pbi10ZXN0LXpkcWEub3JhY2xlb3V0c291cmNpbmcuY29tL29jY3MtYWRtaW4iLCJvY2NzLmFkbWluLmxvY2FsZSI6ImVuX1VTIiwib2Njcy5hZG1pbi50eiI6bnVsbCwib2Njcy5hZG1pbi50ZW5hbnRUeiI6IkFtZXJpY2EvU2FvX1BhdWxvIiwib2Njcy5hZG1pbi5rZWVwQWxpdmVVUkwiOiJodHRwczovL2NjYWRtaW4tdGVzdC16ZHFhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9rZWVwYWxpdmUiLCJvY2NzLmFkbWluLnRva2VuUmVmcmVzaFVSTCI6Imh0dHBzOi8vY2NhZG1pbi10ZXN0LXpkcWEub3JhY2xlb3V0c291cmNpbmcuY29tL2NjYWRtaW4vdjEvc3NvVG9rZW5zL3JlZnJlc2giLCJvY2NzLmFkbWluLnZlcnNpb24iOiIxOS40LjAuMSIsIm9jY3MuYWRtaW4uYnVpbGQiOiJqZW5raW5zLUFzc2VtYmxlX0Nsb3VkX0NvbW1lcmNlX0VBUnNfLW1hc3Rlci03MiIsIm9jY3MuYWRtaW4uZW1haWwiOm51bGwsIm9jY3MuYWRtaW4ucHJvZmlsZUlkIjoiYWE3NDU3NzEtNjkzZC00MTg1LTljNTgtOTgyYTU1NGM3Mzk4Iiwib2Njcy5hZ2VudC5vYm8iOm51bGwsIm9jY3MuYWRtaW4uZmlyc3ROYW1lIjpudWxsLCJvY2NzLmFkbWluLmxhc3ROYW1lIjpudWxsLCJvY2NzLmFkbWluLnB1bmNob3V0VXNlciI6ZmFsc2UsInN1Yl90eXBlIjpudWxsLCJzY29wZSI6bnVsbH0=.ADxkSGVqnon8C9hehaBLJnt29zzEYtfnGUVbK/RMTSp958U7JHxT8ACNJ4kDW3HntjSrzDlWa5UZH6AuGyPui6eshu75JXmYpsNz/1tmFMZKibypLAdn3ue1/Ol12RuXQhOMhhgpzSfgPu5VB8a9bAYmYY9qPnx0decgnxqRM7kxLNWPIUEhjEr1hhOuz8l5/LvxKA9oMSN9gIQhHUgmxpxt6rTu4+xcpoJCjDVOP/lD6KxH+RgEcOpQJiYBZ2UGxptEFUvgppyz4r4YUxJdG3Mbtybe6NC7+Z0aO8YyAZkFcNsmN4TtIScm2EjFqNFbvV2CQF7r5AahGYrLO0ikvQ==",
//"links": [
//    {
//        "rel": "self",
//        "href": "https://ccadmin-test-zdqa.oracleoutsourcing.com/ccadmin/v1/login"
//    }
//],
//"token_type": "bearer",
//"expires_in": 300