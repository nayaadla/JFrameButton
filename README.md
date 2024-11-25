# JFrameButton
Overview
JFrameButton is a simple Java Swing-based application that demonstrates GUI programming. The program creates a graphical window with a button that displays a pop-up message when clicked. This project is perfect for beginners learning to work with Java Swing components.

Features
Graphical User Interface (GUI): Utilizes Swing components like JFrame, JLabel, JButton, and JOptionPane to create an interactive user interface.
Event Handling: Implements an ActionListener to handle button click events.
Custom Styling: Features a modern layout with customized fonts and alignment for labels and buttons.
Program Flow
Create a JFrame:
The main window (JFrame) is set up with a title, size, and layout.
Add Components:
A label (JLabel) is added at the top to display a welcome message.
A button (JButton) is placed in the center for interaction.
Button Interaction:
When the button is clicked, a dialog box (JOptionPane) pops up with the message "Go Hatters!".
Display the Frame:
The GUI becomes visible after adding all components.

JFrameButton Java Program - README
Overview
JFrameButton is a simple Java Swing-based application that demonstrates GUI programming. The program creates a graphical window with a button that displays a pop-up message when clicked. This project is perfect for beginners learning to work with Java Swing components.

Features
Graphical User Interface (GUI): Utilizes Swing components like JFrame, JLabel, JButton, and JOptionPane to create an interactive user interface.
Event Handling: Implements an ActionListener to handle button click events.
Custom Styling: Features a modern layout with customized fonts and alignment for labels and buttons.
Program Flow
Create a JFrame:
The main window (JFrame) is set up with a title, size, and layout.
Add Components:
A label (JLabel) is added at the top to display a welcome message.
A button (JButton) is placed in the center for interaction.
Button Interaction:
When the button is clicked, a dialog box (JOptionPane) pops up with the message "Go Hatters!".
Display the Frame:
The GUI becomes visible after adding all components.
How to Run
Setup Environment: Ensure you have the Java Development Kit (JDK) installed.
Compile the Program:
bash
Copy code
javac JFrameButton.java
Run the Program:
bash
Copy code
java JFrameButton
Interact with the Application:
Click the "Click Me" button to see the pop-up message.
Example Output
Initial Screen
A window appears with the message "Welcome to the Click Me App!" and a clickable button labeled "Click Me."
On Button Click
A pop-up message dialog displays:
text
Copy code
Go Hatters!
Customization
Change the Label Text:
Modify the label.setText("Your Message Here"); line to change the welcome message.
Change Button Label:
Update the JButton button = new JButton("Click Me"); line to rename the button.
Update Pop-Up Message:
Edit the JOptionPane.showMessageDialog(frame, "Go Hatters!"); line to display a custom message.
Adjust Window Size:
Change the dimensions in frame.setSize(400, 300);.
Learning Objectives
Understand the basics of Java Swing for GUI development.
Work with layouts and components like JLabel, JButton, and JOptionPane.
Implement event-driven programming using ActionListener.
