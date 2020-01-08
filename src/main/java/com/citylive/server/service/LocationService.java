package com.citylive.server.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


public interface LocationService {
    void registerUser(String userId,String key);
    void updatePos(String userId, double x,double y);
    ResponseEntity notifyNearbyUsers(String userId, double x, double y, double radius);
}
