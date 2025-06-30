# 🍕 OOP-Based Pizza Billing System (Java-OOPS)

Welcome to the **Pizza Billing System**, a simple yet practical console-based Java project demonstrating core **Object-Oriented Programming (OOP)** concepts such as **inheritance**, **encapsulation**, **method overriding**, and **constructor chaining**.

---

## 🔍 Project Overview

This project simulates a pizza ordering and billing system with customizable options such as:
- Extra cheese
- Extra toppings
- Takeaway packaging

It also includes a special type of pizza: **DeluxePizza**, which automatically comes with both extra cheese and toppings.

---

## 🧱 Features

- Base pizza with different prices for Veg and Non-Veg
- Optional:
  - Extra Cheese (+₹100)
  - Extra Toppings (+₹150)
  - Takeaway Packing (+₹20)
- DeluxePizza auto-includes both cheese and toppings
- Detailed bill generation with breakdown

---

## 💡 OOP Concepts Used

| Concept         | Usage Example |
|----------------|----------------|
| **Encapsulation** | Private fields and public methods to manage pizza data |
| **Inheritance**   | `DeluxePizza` extends `Pizza` |
| **Polymorphism**  | Overriding `addExtraCheese` and `addExtraToppings` in `DeluxePizza` |
| **Constructor Chaining** | Calling `super()` from `DeluxePizza` constructor |

---

## 📁 Project Structure

Pizza.java # Base class for pizza orders
DeluxePizza.java # Subclass with automatic cheese + toppings
Main.java # Main file to test the system

## 🚀 How to Run

1. Clone this repository or copy the files into your Java project.
2. Compile and run the `Main` class.
