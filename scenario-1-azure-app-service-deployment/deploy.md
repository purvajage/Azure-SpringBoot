# 🚀 Spring Boot Application Deployment to Azure App Service

This guide provides step-by-step instructions to deploy a Spring Boot application to **Azure App Service for Linux** using the **Azure Web App Maven Plugin**.

---

## 📁 Project Structure

```
Azure-SpringBoot/
└── scenario-1-azure-app-service-deployment/
    ├── springbootazureapp/
    │   ├── pom.xml
    │   └── target/springbootazureapp.jar
    └── deploy.md
```

---

## 🛠 Prerequisites

Make sure you have the following set up:

- Java 11 or 17 (compatible with your Spring Boot app)
- Maven installed
- Azure account
- Resource Group and App Service Plan (can be created via Azure Portal)

---

## 🔌 Add Azure Maven Plugin to `pom.xml`

Add the following configuration to `springbootazureapp/pom.xml` inside the `<build><plugins>` section:

```xml
<plugin>
  <groupId>com.microsoft.azure</groupId>
  <artifactId>azure-webapp-maven-plugin</artifactId>
  <version>1.15.0</version>
  <configuration>
    <resourceGroup>YourResourceGroupName</resourceGroup>
    <appName>YourAppServiceName</appName>
    <region>Central India</region>
    <runtime>
      <os>linux</os>
      <javaVersion>Java 11</javaVersion>
      <webContainer>JAVA</webContainer>
    </runtime>
    <deployment>
      <resources>
        <resource>
          <directory>${project.basedir}/target</directory>
          <includes>
            <include>*.jar</include>
          </includes>
        </resource>
      </resources>
    </deployment>
  </configuration>
</plugin>
```
> **Replace** `YourResourceGroupName` and `YourAppServiceName` with your actual Azure resource group and app service names.

---

## ✅ Deployment Steps

### 1. Navigate to Project Directory

```bash
cd scenario-1-azure-app-service-deployment/springbootazureapp
```

### 2. Build the Project

```bash
mvn clean package
```

### 3. Login to Azure

```bash
az login
```
*Alternatively, you can use:*
```bash
mvn azure-webapp:auth
```
*to authenticate via browser.*

### 4. Deploy to Azure

```bash
mvn azure-webapp:deploy
```

---

## 🌐 Access Your Application

Once deployed, access your app at:

```
https://<YourAppServiceName>.azurewebsites.net
```
> Replace `<YourAppServiceName>` with your actual web app name.

---
