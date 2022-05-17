package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "emailAddress"))
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long userId;

   @NotNull
   @Size(max = 20)
   private String firstName;

   @NotNull
   @Size(max = 20)
   private String lastName;

   @NotNull
   @Email
   private String emailAddress;

   @NotNull
   private String password;

   @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
   private List<Authority> authorities;
}
