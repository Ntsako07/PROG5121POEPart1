# PROG5121POEPart1
# Registration and Login System (Java)

## Project Overview

This project is a simple **Java-based Registration and Login System**. It allows users to:
* Register with a username, password, and phone number
* Validate user input based on specific rules
* Log in using stored credentials
* Receive feedback messages based on login success or failure
---
## Technologies Used

* Java (JDK 8+)
* JUnit (for unit testing)
* Console-based input/output
---
## Project Structure
```
registration.and.login/
│
├── Login.java          # Handles registration and login logic
├── Registration.java   # Contains validation methods
├── Unit_Test.java      # JUnit test cases
---
## Features

### 1. Username Validation

* Must contain an underscore (`_`)
* Must not exceed 5 characters

### 2. Password Validation

* Minimum 8 characters
* At least one uppercase letter
* At least one number
* At least one special character

### 3. Phone Number Validation

* Must be:

  * South African format: `0XXXXXXXXX`
  * OR international format: `+27XXXXXXXXX`

### 4. User Registration

* Validates all inputs before storing
* Displays appropriate success/error messages

### 5. User Login

* Compares input credentials with stored values
* Returns a success or failure message
---
## How to Run

1. Open the project in your IDE (e.g., IntelliJ, Eclipse, NetBeans)
2. Compile the program
3. Run the `Login.java` file
4. Follow console prompts:
   ```
   Enter username:
   Enter password:
   Enter phone number:

## Running Tests

1. Ensure JUnit is added to your project
2. Run `Unit_Test.java`
3. Tests include:

   * Username validation
   * Password validation
   * Phone number validation
   * Registration success
   * Login success
---
## Example

### Registration Input

```
Username: kyl_1
Password: Ch&&sec@ke99!
Phone: +27838968976
```
### Output
```
Registration successful!
```
### Login Output
```
Welcome kyl_1, it is great to see you again!
---
## Limitations

* Data is stored temporarily (no database)
* Only one user can be stored at a time
* Console-based (no GUI)
---
## Author
Ntsako


