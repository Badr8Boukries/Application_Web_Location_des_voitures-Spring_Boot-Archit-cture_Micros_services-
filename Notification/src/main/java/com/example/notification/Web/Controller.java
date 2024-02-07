package com.example.notification.Web;

import com.example.notification.Entites.Notification;
import com.example.notification.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ ")
public class Controller {

    @Autowired
    NotificationRepository notificationRepository;

    @GetMapping("/notifications")
    public List<Notification> getall(){
        return notificationRepository.findAll();
    }

    @DeleteMapping("/notifications/{id}")
    public void delete(@PathVariable("id") Integer id){
        notificationRepository.deleteById(id);
    }

}
