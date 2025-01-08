### ### Mazaady Task Android
This project is an Android application built to demonstrate form handling, category and subcategory selection. The app uses clean architecture with MVVM architecture, Retrofit for networking, and Dagger Hilt for dependency injection.

### ### Project Overview
The Mazaady Task app allows users to select categories and subcategories from a predefined set and dynamically renders input fields based on the selected category.

Features
Dynamic Form Generation: Dynamically adds input fields based on category selection.
Category and Subcategory Selection: Allows selection of categories with data retrieved from an API.
Dependency Injection: Uses Dagger Hilt for clean dependency management.
Unit Testing: Includes unit tests for repository classes.
Architecture
This project follows the Clean Architecture with MVVM (Model-View-ViewModel) architecture, ensuring a clean separation of concerns and testability.

Layers
Model Layer (data/): Handles data operations and defines the data model structure.

Repositories: Fetch data from the API or other data sources.
Data Models: Represent the data structure.
Api: Uses Retrofit for network requests.
ViewModel Layer (presentation/viewmodel/): Manages UI-related data and communicates with the Model layer.

ViewModels: Expose data to the UI through LiveData.
LiveData: Observes changes in data and notifies the view layer.
View Layer (presentation/view/): Displays data to the user and observes the ViewModel.

Fragments/Activities: Render the UI components and observe data from ViewModels.
Adapters: Manage dynamic rendering in lists or containers.
Dependency Injection (di/): Uses Dagger Hilt to inject dependencies across the app.

Utilities Layer (util/): Provides helper functions and data state management.

Benefits of Clean Architecture in This Project
Separation of Concerns: Each layer is responsible for a specific part of the application, such as data handling, business logic, or user interface. This separation makes code easier to maintain and understand.
Testability: By isolating business logic in use cases and repository classes, the app is easier to test independently of the UI or data sources, leading to more robust unit testing.
Scalability: Clean Architecture provides a strong foundation for scaling the app. Adding new features or data sources does not affect the core business logic, allowing for modular expansion of the app.
Independence of Frameworks: Frameworks like Retrofit or Room can be swapped out with minimal impact on the app's core functionality, as dependencies are injected and isolated in specific layers.
Easier Refactoring: Changes in the UI or data layers require minimal refactoring in the business logic layer. This flexibility makes it simpler to adjust to evolving requirements.
Reusable Components: Components like use cases and repositories can be reused across different projects or parts of the application, improving development efficiency.
Benefits of MVVM in This Project
Scalability: Easily add new features and data sources.
Testability: Isolates business logic in ViewModels and Repositories for easy testing.
Separation of Concerns: Each layer has a focused responsibility.
Project Structure
data/: Contains data models, repositories, and API service definitions.
presentation/: Contains UI-related classes like Activities, Fragments, and ViewModels.
util/: Utility classes and extension functions.
di/: Dependency injection setup using Dagger Hilt.
