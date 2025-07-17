# EventManager

EventManager is an Android app for managing event staffing for local clubs. It helps you organize workers, events, and track engagements, with CSV export for reporting.

## Features
- Worker management (add/edit/delete)
- Event management (add/edit/delete)
- Engagement tracking (assign workers, mark paid, notes)
- CSV export of all engagements

## Tech Stack
- Kotlin
- Jetpack Compose
- MVVM (ViewModel + Repository + UseCase)
- Room (SQLite)
- Hilt (DI)

## Setup Instructions
1. Open this project in Android Studio (Giraffe or newer recommended).
2. Let Gradle sync and download dependencies.
3. Build and run on an emulator or device (API 24+).
4. Grant file storage permissions for CSV export when prompted.

## Project Structure
- `data/` - Room entities, DAOs, repositories
- `domain/` - Use cases, models
- `ui/` - Jetpack Compose screens, ViewModels
- `di/` - Hilt modules
- `docs/` - Architecture and documentation

## Documentation
See the `docs/` folder for architecture, data model, export, and future work.

---

MIT License
