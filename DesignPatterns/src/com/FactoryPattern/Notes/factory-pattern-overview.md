# 🏭 Factory Pattern Overview

The **Factory Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass, but allows subclasses or logic to alter the type of objects that will be created.

---

## 📌 Definition

> Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

---

## 🎯 Intent

- Encapsulate object creation logic
- Promote loose coupling between client and product classes
- Support **Open/Closed Principle** – open for extension, closed for modification

---

## 🧱 Structure

```
Client --> Factory --> Product
                   ↳ ConcreteProductA
                   ↳ ConcreteProductB
```

---

## 🛠️ Components

- **Product (Interface or Abstract Class)**: Defines the interface of objects the factory creates.
- **ConcreteProduct**: Implements the Product interface.
- **Factory (Creator)**: Declares the factory method.
- **ConcreteFactory**: Implements the factory method to return an instance of a ConcreteProduct.

---

## 🧨 Use Cases

- When object creation is complex or conditional.
- When the client code should be decoupled from actual object classes.
- Useful in frameworks and libraries where exact types aren't known until runtime.

---

## ✅ Benefits

- Clean separation of concerns
- Easy to introduce new product types
- Centralized object creation logic

---

## ⚠️ Drawbacks

- May introduce too many small classes
- Slightly increases complexity

---

## 🔤 Example (Java)

```java
// Product
interface Animal {
    void speak();
}

// Concrete Products
class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory
class AnimalFactory {
    public static Animal getAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog": return new Dog();
            case "cat": return new Cat();
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
```

---

## 💡 Java 8 Functional Style Example

```java
Map<String, Supplier<Animal>> animalMap = new HashMap<>();
animalMap.put("dog", Dog::new);
animalMap.put("cat", Cat::new);

Animal animal = animalMap.get("dog").get(); // Woof!
```

---

## 📚 Related Patterns

- **Abstract Factory** – For families of related products
- **Builder** – For step-by-step object creation
- **Prototype** – For cloning pre-created objects

---

## 🧠 Summary

The Factory Pattern is essential in designing scalable, flexible systems. It's especially useful in test automation, plugin systems, or when using AI agents that must create different objects dynamically.
