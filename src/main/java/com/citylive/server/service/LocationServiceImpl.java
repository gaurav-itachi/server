package com.citylive.server.service;

import com.citylive.server.datastructure.Position2D;
import com.citylive.server.datastructure.SimpleRangeTree;
import com.citylive.server.datastructure.SpatialDS;
import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@RestController
//@RequestMapping("/locationservice")
public class LocationServiceImpl{
//        implements LocationService {

//
//    @Autowired
//    MessagingService messagingService;
//
//
//    SpatialDS<String> spatialDS = new SimpleRangeTree<>();
//
//    Map<String,String> db = new HashMap<>();
//
//    @RequestMapping("/registerUser/{userid}/{key}")
//    @Override
//    public void registerUser(@PathParam("userid") String userId,@PathParam("key") String key) {
//        db.put(userId,key);
//    }
//
//    @RequestMapping("/updatePos/{userid}/{x}/{y}")
//    @Override
//    public void updatePos(String userId, double x, double y) {
//        spatialDS.updatePos(userId,new Position2D(x,y));
//    }
//
//    @RequestMapping("/notify/{userid}/{x}/{y}/{radius}")
//    @Override
//    public ResponseEntity notifyNearbyUsers(@PathParam("userid") String userId,@PathParam("x") double x,@PathParam("y") double y,@PathParam("radius") double radius) {
//        List<String> usersToNotify = spatialDS.getInRange(new Position2D(x,y),radius);
//
//            String res = usersToNotify
//                    .stream()
//                    .filter(id->!id.equals(userId))
//                    .map(id-> {
//                        try {
//                            return messagingService.sendNotificationToDevice(db.getOrDefault(id,"random"));
//                        } catch (FirebaseMessagingException e) {
//                            //e.printStackTrace();
//                            System.out.println("error");
//                        }
//                        return "error";
//                    })
//                    .reduce((a,b)->{
//                        return a+" "+b;
//                    })
//                    .orElse("Error Occured");
//
//            return ResponseEntity.ok(res);
//    }
}
