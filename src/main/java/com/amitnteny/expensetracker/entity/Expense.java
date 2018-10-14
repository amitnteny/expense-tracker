package com.amitnteny.expensetracker.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = "EXPENSE")
public class Expense {

   @Id
   @Column(name = "EXPENSE_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long expenseID;

   @Column(name = "TITLE", nullable = false)
   private String title;

   @Column(name = "DESCRIPTION")
   private String description;

   @Column(name = "AMOUNT", nullable = false)
   private BigDecimal amount;

   @Column(name = "CURRENCY", nullable = false)
   private String currency;

   @Column(name = "TIMESTAMP_OF_EXPENSE", nullable = false)
   private long timestampOfExpense;
}
