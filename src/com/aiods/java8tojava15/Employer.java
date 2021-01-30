package com.aiods.java8tojava15;
//sealed can we apply to class or interface
public sealed  interface Employer permits Department, Employee {
    String getName();
}
