# 📚 DSA Notes 

Welcome to the **DSA Notes Repository** – your one-stop reference for mastering **Data Structures and Algorithms** with clear explanations, real-world applications, and interview-ready concepts.

---

## 🧠 What is DSA?

**DSA** stands for **Data Structures and Algorithms**:

- **Data Structures**: Techniques to store and organize data efficiently (e.g., Arrays, Linked Lists, Trees, Graphs).
- **Algorithms**: Step-by-step procedures to solve problems (e.g., Sorting, Searching, Dynamic Programming).

---

## 🚀 Why Learn DSA?

- 🔍 **Efficient Problem Solving**: Write optimized and scalable code.
- 💼 **Crack Tech Interviews**: Top companies (FAANG, etc.) focus heavily on DSA.
- 🧠 **Improve Logic**: Develop strong analytical and coding skills.
- ⚙️ **Real-world Usage**: Powers search engines, social networks, compilers, and more.

---

## 📅 When to Use DSA?

- ✅ While building real-world apps (e.g., autocomplete with Tries, maps with Graphs)
- ✅ In coding interviews and competitive programming
- ✅ When performance and scalability matter
- ✅ During algorithm-heavy tasks like scheduling, routing, or caching

---

## 📘 Topics Covered

- ✅ Arrays & Strings
- ✅ Linked Lists
- ✅ Stacks & Queues
- ✅ Hashing
- ✅ Trees & Binary Trees
- ✅ Binary Search Trees
- ✅ Graphs (BFS, DFS, Dijkstra's, etc.)
- ✅ Recursion & Backtracking
- ✅ Sorting & Searching Algorithms
- ✅ Greedy Algorithms
- ✅ Dynamic Programming
- ✅ Bit Manipulation
- ✅ Sliding Window, Two Pointer Techniques

---

## 🛠 Tech Stack / Tools (Optional)

- Language: `C++` / `Java` / `Python` / `JavaScript`
- IDE: VS Code, LeetCode, HackerRank, GFG, Codeforces
- Compiler: GCC / Online Judge / Custom

---

# ☕ Java Data Types, Type Conversion & Casting

---

## 📦 1. Java Data Types

### ✅ Primitive Data Types

Java has **8 primitive types**:

| Type    | Size    | Example                 | Description                  |
| ------- | ------- | ----------------------- | ---------------------------- |
| byte    | 1 byte  | `byte b = 10;`          | Small integers (-128 to 127) |
| short   | 2 bytes | `short s = 1000;`       | Larger than byte             |
| int     | 4 bytes | `int a = 10000;`        | Default for integers         |
| long    | 8 bytes | `long l = 9999999999L;` | For very large numbers       |
| float   | 4 bytes | `float f = 12.5f;`      | Decimal (less precise)       |
| double  | 8 bytes | `double d = 12.54321;`  | Default for decimals         |
| char    | 2 bytes | `char c = 'A';`         | Single character             |
| boolean | 1 bit   | `boolean flag = true;`  | `true` or `false` only       |

---

## 🧠 2. Type Conversion (Widening / Implicit)

Automatically done by Java when **smaller type is assigned to larger type**.

### ✅ Example:

```java
int a = 10;
long b = a;     // int → long (OK)
float f = b;    // long → float (OK)
```

| From                                          | To                   | Allowed? |
| --------------------------------------------- | -------------------- | -------- |
| byte    → short → int → long → float → double | ✅ Yes (no data loss) |          |

---

## ⚠️ 3. Type Casting (Narrowing / Explicit)

When assigning **larger to smaller type**, you must use **casting** — it may cause **data loss**.

### ❌ Example:

```java
double d = 123.456;
int a = (int)d; // loses decimal part
System.out.println(a); // Output: 123
```

### ✅ Syntax:

```java
targetType variable = (targetType) value;
```

---

## ⚠️ 4. Data Loss in Type Casting

### 🔴 Example 1: Decimal to Integer

```java
float f = 99.99f;
int x = (int)f;   // x = 99, .99 lost
```

### 🔴 Example 2: Overflow

```java
int a = 130;
byte b = (byte)a;
System.out.println(b); // Output: -126 (Overflow)
```

Because `byte` range is -128 to 127 → 130 wraps around.

---

## 🧪 Summary Table

| Operation      | Safe? | Example               | Notes                   |
| -------------- | ----- | --------------------- | ----------------------- |
| int → long     | ✅     | `long b = a;`         | Widening (no cast)      |
| float → int    | ❌     | `int x = (int)f;`     | Decimal part lost       |
| double → float | ❌     | `float f = (float)d;` | Possible precision loss |
| long → byte    | ❌     | `byte b = (byte)l;`   | Overflow may occur      |

---

## ✅ Best Practices

* Use `int` for integers unless very large values are needed.
* Use `double` for precise decimal work (e.g., finance, math).
* Always cast carefully from higher → lower types.
* Be cautious of **overflow** and **precision loss**.

---

## 📌 Quick Quiz

1. What is the result of:

   ```java
   byte b = (byte)130;
   System.out.println(b);
   ```

   ✅ Answer: `-126`

2. Will this compile?

   ```java
   float f = 12.5;
   ```

   ❌ No! `12.5` is `double` by default → Use `12.5f`


