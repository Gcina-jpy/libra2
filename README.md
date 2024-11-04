# Library Management System

## Overview
The Library Management System is a Java-based application designed to manage library items, primarily books. Users can add new books, view all items in the library, and interact with the system through a simple console interface.

## Features
- **Add Books**: Allows users to add new books to the library with details such as ID, title, and author.
- **View All Items**: Displays all items currently in the library.
- **Search Books**: (Optional) Search for books by title or author.
- **User-Friendly Interface**: Simple console-based menu for easy navigation.

## Requirements
- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## Getting Started

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
Navigate to the project directory:
bash
Copy code
cd library-management-system
Compile the Java files:
bash
Copy code
javac book/library/*.java
Run the application:
bash
Copy code
java book.library.Library
Usage
Launch the application to see the main menu.
Choose an option by entering the corresponding number.
Follow the prompts to add books or view library items.
Code Structure
LibraryItem: Base class for all library items.
Book: Extends LibraryItem, representing a book with attributes such as author.
Library: Manages library items, handles user input, and implements the main menu.
Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please fork the repository and create a pull request.
