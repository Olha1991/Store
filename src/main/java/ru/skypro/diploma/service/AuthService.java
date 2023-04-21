package ru.skypro.diploma.service;

import ru.skypro.diploma.dto.RegisterReq;
import ru.skypro.diploma.dto.Role;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register(RegisterReq registerReq, Role role);
}
