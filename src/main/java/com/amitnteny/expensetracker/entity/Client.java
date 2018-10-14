package com.amitnteny.expensetracker.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "CLIENT")
public class Client {

   @Id
   @Column(name = "CLIENT_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long clientId;

   @Column(name = "CLIENT_NAME", nullable = false)
   private String clientName;

   @OneToMany(fetch = FetchType.LAZY)
   private List<Expense> expenses;

}
