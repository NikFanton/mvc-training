package ua.training.model.service;

public interface SecurityService {
    String findLoggedUsername();
    void autoLogin(String username, String password);
}
