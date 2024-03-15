# Food Delivery Platform APIs

Welcome to our food delivery platform project developed using the Spring Boot framework. This README provides an overview of the project's structure, components, and how to interact with the APIs.

## Frameworks and Language Used
- **Language:** Java
- **Framework:** Spring Boot
- **Database:** SQL

## Data Flow

### Model
The `model` package contains classes representing different entities in our system:
- `Admin`: Represents administrative data.
- `User`: Represents user data.
- `Address`: Represents address data.
- `Order`: Represents order data.
- `Food`: Represents food-related data.
- `Restaurant`: Represents restaurant data.

### Controller
The `controller` package includes controllers for handling HTTP requests:
- `AdminController`: Manages administrative operations.
- `UserController`: Handles user-related operations.

### Services
Service classes manage business logic and interact with repositories:
- `AdminService`, `UserService`, `FoodService`, `AddressService`, `OrderService`, `RestaurantService`: Handle operations related to their respective entities.
- `UserAuthService`, `AdminAuthService`: Provide authentication services for users and administrators, respectively.

### Repository
Repository interfaces extend `JpaRepository` and manage data persistence:
- `IAdminRepo`, `IUserRepo`, `IFoodRepo`, `IAddressRepo`, `IOrderRepo`, `IRestaurantRepo`: Handle CRUD operations for entities.
- `IUserAuthRepo`, `IAdminAuthRepo`: Manage authentication data.

### Database Design
The database schema mirrors the structure of the models, storing relevant data required for platform functionality.

## Data Structures Used
Standard Java data structures like Lists, Maps, and POJOs are used to manage data and implement logic.

## Project Summary
Our food delivery platform offers efficient management of admin and user operations. Users can place orders from different restaurants, ensuring secure authentication through `UserAuth` and `AdminAuth` classes.

The system is structured with clear separation of concerns, facilitating maintainability and scalability. For more details, refer to the source code and accompanying documentation.

## Installation and Setup

### Prerequisites
- JDK (Java Development Kit) installed on your machine.
- Maven installed for dependency management.
- MySQL database server running and accessible.

### Installation Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/premganwani619/food-delivery-apis.git
   ```

2. **Build the Project:**
   ```bash
   mvn clean install
   ```

3. **Configure Database:**
   - Open `application.properties`.
   - Set database connection properties (`spring.datasource.url`, `spring.datasource.username`, `spring.datasource.password`, `spring.datasource.driver-class-name`) according to your setup.

4. **Run the Application:**
   ```bash
   java -jar target/food-delivery-api.jar
   ```

5. **Access Swagger UI:**
   - Open a web browser and navigate to [Swagger UI](https://food-delivery-apis-yt3r.onrender.com/swagger-ui/index.html) to explore and interact with the APIs.
   - Alternatively, after running the application, Swagger UI is accessible at `http://localhost:8080/swagger-ui/index.html`.

<img width="944" alt="Screenshot 2024-03-16 003526" src="https://github.com/premganwani619/food-delivery-apis/assets/83330321/ea517602-51ee-4afd-a37d-b448d1350e55">
```
