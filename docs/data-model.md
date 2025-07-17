# Data Model

## Entities

### WorkerEntity
- id: Long (PK)
- name: String
- email: String
- phone: String

### EventEntity
- id: Long (PK)
- name: String
- date: String (ISO 8601)
- location: String
- feePerWorker: Int (default 50 SEK)

### EngagementEntity
- id: Long (PK)
- workerId: Long (FK to WorkerEntity)
- eventId: Long (FK to EventEntity)
- paid: Boolean
- notes: String?

## Relationships
- One Worker can have many Engagements
- One Event can have many Engagements
- Engagement links a Worker to an Event
