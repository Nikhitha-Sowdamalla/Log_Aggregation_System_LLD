# 📜 Log Aggregation System API (Spring Boot)  

This is a **Log Aggregation System API** built using **Spring Boot** that allows:  
✅ Collecting logs from different services (like **Auth, Payment, Orders, etc.**).  
✅ Storing logs temporarily in **memory (ArrayList)** without a database.  
✅ Filtering logs based on:  
- 📅 **Timestamp** (From and To).  
- 🚦 **Log Level** (ERROR, INFO, DEBUG).  
- 💻 **Service Name** (Auth, Payment, etc.).  

---

## 💡 Features  
- ✅ **Receive Logs** from multiple microservices (like Auth, Payment, etc.).  
- ✅ **Filter Logs** by timestamp, log level, or service name.  
- ✅ **In-memory storage (ArrayList)**, no database is used.  
- ✅ Fast and simple API design.  

---

## 📊 API Endpoints  
Here are the available API endpoints:  

### **1. Collect Logs (POST)**  
**Endpoint:**  
```plaintext
POST: http://localhost:8080/logs/collect
```  

**Request Body (JSON):**  
```json
{
  "serviceName": "AuthService",
  "logLevel": "ERROR",
  "message": "Invalid Token",
  "timestamp": "2025-03-11T10:15:30"
}
```  

✅ Supported **log levels:**  
- `ERROR`  
- `INFO`  
- `DEBUG`  

**Response:**  
```plaintext
✅ Log saved successfully.
```  

---

### **2. Get All Logs (GET)**  
**Endpoint:**  
```plaintext
GET: http://localhost:8080/logs/all
```  

**Response:**  
```json
[
  {
    "serviceName": "AuthService",
    "logLevel": "ERROR",
    "message": "Invalid Token",
    "timestamp": "2025-03-11T10:15:30"
  },
  {
    "serviceName": "PaymentService",
    "logLevel": "INFO",
    "message": "Payment processed successfully",
    "timestamp": "2025-03-11T10:18:00"
  }
]
```  

---

### **3. Filter Logs (GET)**  
✅ **Filter by Service Name:**  
```plaintext
GET: http://localhost:8080/logs/filter?serviceName=AuthService
```  

✅ **Filter by Log Level:**  
```plaintext
GET: http://localhost:8080/logs/filter?logLevel=ERROR
```  

✅ **Filter by Time Range:**  
```plaintext
GET: http://localhost:8080/logs/filter?from=2025-03-11T10:00:00&to=2025-03-11T11:00:00
```  

✅ **Combine Filters (Optional):**  
```plaintext
GET: http://localhost:8080/logs/filter?serviceName=PaymentService&logLevel=INFO
```  

**Example Response:**  
```json
[
  {
    "serviceName": "PaymentService",
    "logLevel": "INFO",
    "message": "Payment processed successfully",
    "timestamp": "2025-03-11T10:18:00"
  }
]
```  

---

## 💻 How to Run This Project  
### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/Log-Aggregation-System.git
cd Log-Aggregation-System
```  

---

### 2️⃣ Build the Project  
Build it using Maven:  
```bash
mvn clean install
```  

---

### 3️⃣ Run the Application  
Run the application using:  
```bash
mvn spring-boot:run
```  
or simply run the `LogAggregatorApplication.java` in IntelliJ/Eclipse.  

---

### 4️⃣ Test the Endpoints  
Use **Postman** or **cURL** to test the APIs:  

✅ **Send a Log (Auth Service):**  
```plaintext
POST: http://localhost:8080/logs/collect
Body:
{
  "serviceName": "AuthService",
  "logLevel": "ERROR",
  "message": "Invalid Token",
  "timestamp": "2025-03-11T10:15:30"
}
```  

✅ **Filter Logs by Service:**  
```plaintext
GET: http://localhost:8080/logs/filter?serviceName=AuthService
```  

✅ **Get All Logs:**  
```plaintext
GET: http://localhost:8080/logs/all
```  

---

## 📅 Expected Output  
If you send logs from different microservices, you may get output like:  

```json
[
  {
    "serviceName": "AuthService",
    "logLevel": "ERROR",
    "message": "Invalid Token",
    "timestamp": "2025-03-11T10:15:30"
  },
  {
    "serviceName": "PaymentService",
    "logLevel": "INFO",
    "message": "Payment processed successfully",
    "timestamp": "2025-03-11T10:18:00"
  }
]
```  

---

## ✅ Supported Filters  
| Filter Type         | Query Example                                                                 |  
|--------------------|--------------------------------------------------------------------------------|  
| Service Name        | `/logs/filter?serviceName=AuthService`                                          |  
| Log Level           | `/logs/filter?logLevel=ERROR`                                                   |  
| Time Range          | `/logs/filter?from=2025-03-11T10:00:00&to=2025-03-11T11:00:00`                  |  
| Combined Filters    | `/logs/filter?serviceName=PaymentService&logLevel=INFO`                        |  

---

## 📊 Supported Microservices  
By default, you can collect logs from any microservice. Here are some examples:  

| Service Name       | Example Log Level    | Example Message                |  
|--------------------|---------------------|-------------------------------|  
| **AuthService**     | ERROR                | Invalid Token                  |  
| **PaymentService**  | INFO                 | Payment Successful              |  
| **OrderService**    | DEBUG                | Order placed successfully       |  
| **InventoryService**| INFO                 | Item Out of Stock              |  

---

## 📅 Future Improvements (Optional)  
If you want, I can upgrade this project to:  
✅ **Store logs in a database (MySQL/MongoDB)**.  
✅ **Stream logs in real-time using Kafka**.  
✅ **Add a Dashboard (React/Angular) to visualize logs**.  
✅ **Send alerts via Email/SMS if critical logs appear**.  
