package com.example.notification.Repository;

import com.example.notification.Entites.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository  extends JpaRepository<Notification,Integer> {
}
