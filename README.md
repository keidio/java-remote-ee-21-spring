# Spring exercises

### Useful  git commands

###  MVC pattern
- Model
- View
- Controller

### Stack architecture based and MVC pattern
- Controller
- Model (data + operations on data) = Service + Repository

- Controller -> get the request from the user and returns the view
- Service -> business logic (what application should do)
- Repository -> direct access to the data (doesn't matter where data is)

### View - it's a view which user is  able to play with
- html pages
- json payload

### Model data
- dto (Data Transfer Object)
- Entity

### REST Architecture/Restful API
- exposing data through html protocol
- every resource has url (address/identifier)
- standard methods to play with those resources
- CRUD methods: Create/Read/Update/Delete
- car as an example - our proposition
  - get all cars (url + Http verb): GET /all-cars
  - get one particular car(url + http verb): POST /VIN; POST /bmw
  - create new car(url + Http verb): POST /add-car; POST /add-new-car
  - delete car (url + Http verb): DELETE /VIN; DELETE /delete-car
  - update car (url + Http verb): PATCH /VIN-patch; PATCH /update-car