package com.amitnteny.expensetracker.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Client {
   private String name;
   private List<Expense> expenses;
}
