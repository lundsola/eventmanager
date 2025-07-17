# Architecture

This project uses a modern Android architecture with a focus on testability, maintainability, and separation of concerns.

## Patterns & Layers
- **MVVM**: ViewModel, Repository, UseCase
- **Domain Layer**: Business logic, use cases, models
- **Data Layer**: Room entities, DAOs, repositories
- **UI Layer**: Jetpack Compose screens, ViewModels
- **Dependency Injection**: Hilt

## Data Flow
- UI interacts with ViewModels
- ViewModels use UseCases from the domain layer
- UseCases interact with repositories
- Repositories abstract data sources (Room, etc.)

## State Management
- Uses StateFlow or LiveData for reactive UI updates

## Why this architecture?
- **Separation of concerns**: Each layer has a clear responsibility
- **Testability**: Business logic is decoupled from UI
- **Scalability**: Easy to add features and maintain
