# 🚀 API Automation Framework (Rest Assured + Java)

## 📘 Overview
This project is a **scalable and maintainable API Automation Framework** built using **Java** and the **Rest Assured** library.  
It follows clean design principles to ensure reusability, readability, and easy CI/CD integration.

---

## 🌐 Swagger Documentation
🔗 [**View API Docs Here**](http://64.227.160.186:8080/swagger-ui/index.html#/Authentication)

---

## 🧠 Key Features
- ✅ **Rest Assured-based API testing** for RESTful services  
- 🧩 **Service Object Model** for modular, maintainable test structure  
- 🏗️ **Builder Design Pattern** for dynamic request and payload creation  
- 🪵 **Custom Loggers, Listeners, and Filters** for detailed reporting and debugging  
- ⚙️ **CI/CD Integration with GitHub Actions** for automated test execution on every push or pull request  
- 📊 **Extensible Framework Design** – easy to scale for new endpoints or environments  

---

## 🧱 Framework Structure
src
┣ 📂 main
┃ ┣ 📂 java
┃ ┃ ┣ 📂 services # API service classes (Service Object Model)
┃ ┃ ┣ 📂 builders # Builder classes for payload construction
┃ ┃ ┣ 📂 utils # Common utilities (config, logging, reporting)
┣ 📂 test
┃ ┣ 📂 java
┃ ┃ ┣ 📂 tests # API test cases
┃ ┃ ┣ 📂 listeners # Custom listeners for logging and reporting
┣ 📄 pom.xml # Maven dependencies and build configuration
┣ 📄 README.md # Project documentation




---

## 🔄 Continuous Integration (CI/CD)
This repository is integrated with **GitHub Actions** for automated test execution.  
Each push or pull request triggers:
1. Framework build and dependency installation  
2. API test execution using Rest Assured  
3. Test report generation and log upload as workflow artifacts  

---

## 📊 Reporting & Logging
- **Detailed request/response logging** for every API call  
- **Custom listeners and filters** to capture execution details and API performance  
- Optionally supports **Extent Reports** or **Allure Reports** for visual test reporting  

---

## 🧩 Tech Stack

| Component | Technology |
|------------|-------------|
| Language | Java |
| Automation Library | Rest Assured |
| Build Tool | Maven |
| CI/CD | GitHub Actions |
| Documentation | Swagger |
| Logging | Log4j / Custom Logger |
| Reporting | Extent / Allure (optional) |

---

## 🧪 Test Execution

### Run Tests Locally
```bash
mvn clean test


💡 Future Enhancements

🔹 Add environment-based execution (QA / Staging / Prod)

🔹 Integrate Allure Reports for enhanced test analytics

🔹 Enable parallel execution to reduce test cycle time

🔹 Add data-driven testing using JSON, CSV, or Excel


This framework provides a solid foundation for API testing, combining clean architecture, design patterns, and continuous integration.
It’s flexible enough to grow with your project and ensures consistent, reliable API validation in every build.
