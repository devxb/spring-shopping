package shopping.auth.service.dto;

public final class TokenResponse {

    private String accessToken;

    public TokenResponse() {
    }

    public TokenResponse(final String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
