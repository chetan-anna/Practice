
# 📚 Design Patterns - Prototype Pattern

## 📌 What is the Prototype Pattern?
- **Definition**: Create new objects by **copying existing ones** instead of building from scratch.
- **Use Case**: When object creation is **costly** (CPU/memory) or **complex**.

---

## 🛠 Structure

| Component | Description |
|:---|:---|
| Prototype | Interface declaring `clone()` |
| ConcretePrototype | Class that implements the `clone()` method |
| Client | Class that asks for a copy instead of `new` |

---

## 📋 Key Points
- `Object.clone()` method in Java is **protected** ➔ must **override as public**.
- If interface `Prototype` declares `clone()`, your class must make `clone()` **public**.
- Use **shallow copy** for simple objects.
- Use **deep copy** for objects with nested objects.

---

## ⚡ Common Errors + Solutions

| Error | Cause | Solution |
|:---|:---|:---|
| `The inherited method Object.clone() cannot hide the public abstract method in Prototype` | `Object.clone()` is protected, but interface method must be public | Override `clone()` as **public** |
| `CloneNotSupportedException` | Calling `super.clone()` on a class not implementing `Cloneable` | Implement `Cloneable` interface or handle exception properly |

---

## 🧪 Code Example 1 - Basic Prototype

```java
interface Prototype {
    Prototype clone();
}

class Book implements Prototype, Cloneable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void showInfo() {
        System.out.println("Book: " + title);
    }
}
```

---

## 🧪 Code Example 2 - Deep Copy

```java
class Address {
    String city;
    Address(String city) { this.city = city; }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.address = new Address(address.city); // Deep copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
```

---

## 🎯 Best Practices
- Prefer **copy constructors** or **serialization** for deep cloning if the object graph is complex.
- Always implement `Cloneable` if you use `Object.clone()`.
- Handle exceptions cleanly inside clone() method for better API design.

---

## 📋 Quick Recap Checklist
- [ ] Interface `Prototype` with `clone()`.
- [ ] `clone()` must be **public**.
- [ ] Implement `Cloneable` interface.
- [ ] Handle `CloneNotSupportedException`.
- [ ] Decide between **shallow** and **deep** copy.

---

# 🚀 Personal Notes
- "Remember: `clone()` visibility must be **upgraded** to public."
- "Catch `CloneNotSupportedException` inside clone(), not outside for clean code."
- "Use deep copies when cloning objects containing other objects."

---

# 📈 Next Steps
- Practice building a **Prototype Registry** (map of prototypes).
- Try cloning objects with multiple levels of nested objects.

---

# 🗂 How to Store This
- **Folder**: `/Notes/Design Patterns/`
- **File Name**: `Prototype_Pattern.md`
- **Tag**: `#designpatterns` `#prototype` `#java`
