# CSV Export

The app can export all engagements to a CSV file for reporting or bookkeeping.

## Exported Fields
- Worker Name
- Event Name
- Date
- Paid Status
- Fee per Worker

## How it works
- The export feature queries all Engagements, joining Worker and Event data.
- Data is formatted as CSV and written to a file in device storage.
- The app requests file storage permission if needed.
- The user can share or open the CSV file from the app.
