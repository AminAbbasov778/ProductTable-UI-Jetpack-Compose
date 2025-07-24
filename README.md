# 📊 Product Table (Jetpack Compose + Clean Architecture)

**Product Table UI** is a clean, Jetpack Compose-based Android application that displays a list of products in a structured table layout. The project is built with **Kotlin**, **Hilt for DI**, and follows **Clean Architecture** principles. It's ideal for demonstrating how to handle static or local data and render it using modern **Material 3** UI components.

---

## 🖼️ Screenshots

| Product Table UI |
|------------------|
| ![screenshot](screenshots/product_table.png) |


---

## 🧩 Key Features

- 🧱 Clean Architecture (Data / Domain / Presentation)
- 💉 Dependency Injection with **Hilt**
- 🖥️ Jetpack **Compose UI** (Material3)
- 🗃️ Local static product list rendering
- 🎨 Modern Card-style UI table
- ✅ Scalable and testable architecture

---

## 🚀 Technologies Used

| Technology            | Role                               |
|------------------------|-------------------------------------|
| **Kotlin**             | Primary language                   |
| **Jetpack Compose**    | Declarative UI                     |
| **Material 3**         | UI Design System                   |
| **Hilt**               | Dependency Injection               |
| **Clean Architecture** | Codebase separation                |
| **ViewModel**          | State management                   |

---

## 🧠 Architecture Overview

The project follows the Clean Architecture pattern, split into three main layers:

├── data
│   ├── model         // Data classes (e.g., Product)
│   ├── repository    // Repository implementations
│   └── mapper        // Data-to-Domain model mapping
│
├── domain
│   ├── model         // Domain models (e.g., ProductModel)
│   ├── interfaces    // Repository interfaces
│   └── usecases      // Business logic (use cases)
│
├── presentation
│   ├── viewmodels    // ViewModel classes for UI state
│   ├── screens       // Composables and Activities
│   ├── mapper        // Domain-to-UI model mapping
│   ├── components    // Reusable UI components
│   └── model         // UI models (e.g., ProductUi)
│
└── di
    └── Module.kt     // Dependency injection with Hilt



---

## 📦 Project Modules Description

| Component                  | Description                                      |
|---------------------------|--------------------------------------------------|
| `ProductRepositoryImpl`    | Provides static list of `Product` data            |
| `GetProductDataUseCase`    | Retrieves product list from the repository        |
| `ProductModel`             | Domain layer data class                            |
| `ProductUi`                | UI layer data class                               |
| `Table()`                  | Main composable displaying the product table      |
| `ActivityViewModel`        | Manages UI state and exposes product data         |
| `TableCellText()`          | Reusable composable for displaying table cells    |

---

## ▶️ How to Run

### ✅ Prerequisites

- Android Studio Giraffe or later
- Kotlin 1.8+
- Minimum SDK 26 (Android 8.0 Oreo)

### 🛠️ Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/product-table-ui.git
