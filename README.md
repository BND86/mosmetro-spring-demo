# Mosmetro Gateway API

## GET /stations
```json
[
  {
    "id": "119",
    "name": "Курская"
  },
  {
    "id": "24",
    "name": "Проспект Вернадского"
  }
]
```

## GET /stations/173/trains
```json
[
  {
    "prevStation": 171,
    "arrivalTime": 68
  },
  {
    "prevStation": 174,
    "arrivalTime": 8
  }
]
```