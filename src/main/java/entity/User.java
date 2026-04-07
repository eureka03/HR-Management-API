package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;



@Table(name="User")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_email_address")
    private String emailAddress;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="created_at")
    private LocalDate createdAt;

    @Column(name="updated_at")
    private LocalDate updatedAt;

    @PrePersist
    public void init(){
        createdAt =LocalDate.now();
    }

    @PreUpdate
    public void initUpdate(){
        updatedAt = LocalDate.now();
    }

}
