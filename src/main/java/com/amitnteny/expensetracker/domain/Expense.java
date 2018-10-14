package com.amitnteny.expensetracker.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Builder
@Data
public class Expense {
   private String expenseTitle;
   private String description;
   private Currency currency;
   private BigDecimal amount;
   private Long timestampOfExpense;
}
