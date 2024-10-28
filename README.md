# 🎬 Movie Ticket Booking System

[![wakatime](https://wakatime.com/badge/user/018c271e-45c3-428e-96ed-b810274da52c/project/dcb09b21-ed90-44e2-9f00-37614f58f058.svg)](https://wakatime.com/badge/user/018c271e-45c3-428e-96ed-b810274da52c/project/dcb09b21-ed90-44e2-9f00-37614f58f058)

A Java-based **Movie Ticket Booking System** that allows users to view movies, select showtimes, reserve seats, and make payments. Admin users can manage movies, showtimes, and analyze revenue, providing a complete backend solution for a movie booking application.

## 📋 Table of Contents
- [About](#about)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Admin Functionalities](#admin-functionalities)
- [Future Improvements](#future-improvements)
- [License](#license)

---

## 📖 About

The **Movie Ticket Booking System** is a Java console application demonstrating **Object-Oriented Programming (OOP)** principles like encapsulation, inheritance, polymorphism, and abstraction. This project includes both user and admin functionalities, where users can browse movies and book tickets, while admins have the ability to manage the catalog and view revenue reports.

---

## 🌟 Features

### User Features
- **User Registration & Login**: Register as a new user or log in to an existing account.
- **Browse Movies**: View available movies along with details like title, genre, duration, and rating.
- **Showtime & Seat Selection**: Choose a showtime and select available seats for booking.
- **Payment Processing**: Multiple payment options (Credit Card, PayPal, Wallet) with dynamic pricing.
- **Booking Confirmation**: Receive booking confirmation details after successful payment.

### Admin Features
- **Movie Management**: Add, update, and delete movies from the catalog.
- **Showtime Management**: Manage showtimes, including setting ticket prices and available seats.
- **User Management**: View all registered users and their booking histories (planned).
- **Revenue Analysis**: View revenue by showtime, movie, and total earnings.
- **Promotions**: Manage discount codes and promotions (planned).

---

## 🗂 Project Structure

```
Movie-Ticket-Booking-System
│
├── AdminManager.java         # Manages admin-specific functionalities
├── Booking.java              # Handles booking details for seats and users
├── CreditCardPayment.java    # Implements credit card payment processing
├── LICENSE                   # License file
├── Main.java                 # Main entry point of the application
├── Movie.java                # Represents a movie entity with attributes
├── MovieManager.java         # Manages operations related to movies
├── Payment.java              # Abstract class for different payment types
├── PayPalPayment.java        # Implements PayPal payment processing
├── README.md                 # Project documentation
├── Seat.java                 # Represents a seat with booking status
├── Showtime.java             # Contains showtime details for movies
├── ShowtimeManager.java      # Manages showtime operations
├── User.java                 # Represents a user with login details
├── UserManager.java          # Manages user registration and login
└── WalletPayment.java        # Implements Wallet payment processing
```

---

## 🛠 Installation

### Prerequisites
- **Java JDK 8** or higher
- A **Java IDE** (e.g., IntelliJ, Eclipse) or a terminal for command-line execution

### Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Vikranth3140/Movie-Ticket-Booking-System.git
   cd Movie-Ticket-Booking-System
   ```

2. **Open the project** in your preferred Java IDE.

3. **Build the project**:
    - If you're using an IDE, build the project directly.
    - Alternatively, compile from the command line:
      ```bash
      javac *.java
      ```

4. **Run the application**:
   ```bash
   java Main
   ```

---

## 🚀 Usage

Upon running the application, you’ll be presented with a main menu offering user registration, login, and admin login.

### User Flow
1. **Register/Login**: Users can register or log in.
2. **Browse Movies & Showtimes**: View available movies and select showtimes.
3. **Book Seats & Payment**: Select seats and make a payment using credit card, PayPal, or Wallet.
4. **Confirmation**: View booking confirmation and booking history.

### Admin Flow
1. **Login as Admin**: Admins have access to advanced functionalities.
2. **Manage Movies**: Add, update, or delete movies in the system.
3. **Manage Showtimes**: Set showtimes, prices, and available seats for each movie.
4. **View Revenue Reports**: Access revenue by showtime, by movie, or total revenue.

---

## 🔐 Admin Functionalities

The application includes an **AdminManager** that provides extra controls for admin users. Admin functionalities include:

- **Register New Admins**: Existing admins can register new admin accounts.
- **Movie and Showtime Management**: Admins can add or update movies and their showtimes.
- **Revenue Reports**: Analyze revenue generated by individual showtimes or overall.

To log in as an admin, use the predefined credentials (or follow the instructions to create a new admin after logging in).

---

## 📈 Future Improvements

- **GUI**: Implement a JavaFX-based graphical interface for a more user-friendly experience.
- **Data Persistence**: Save and retrieve data from a database (e.g., MySQL, SQLite) for session persistence.
- **Advanced Analytics**: Include more detailed reports and trend analysis.
- **Discounts & Promotions**: Allow admins to add and manage promotional offers and discount codes.
- **User Management**: Allow admins to manage user accounts, reset passwords, or ban users if necessary.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to reach out if you have any questions or run into any issues! 🎥 Enjoy booking your movies! 🎬
