How to Compile and Run
<br>
1. Make sure Java is installed on your computer.
<br>2. Compile : javac filename.java
<br>3. Run : java filename
<br>4. Example:
<br>Compile: javac BracketChecker.java
<br>Run: java BracketChecker

<br><br>Input Format + Example Usage

<br><br>Question 1 — Bracket Checker
<br>Checks whether brackets in a string are balanced using a stack.

<br>Input Format:
<br>User enters a string containing brackets.

<br>Example:
<br>Masukkan bracket:
<br>{[()]}

<br>Output:
<br>Bracket BALANCED

<br><br>Invalid Example:
<br>Input:
<br>{[(])}

<br>Output:
<br>Bracket NOT BALANCED


<br><br>Question 2 — Reverse Polish Notation Evaluation
<br>Evaluates postfix expressions using a stack.

<br>Input Format:
<br>User enters tokens separated by spaces.

<br>Example:
<br>2 1 + 3 *

<br>Output:
<br>9

<br>Explanation:
<br>(2 + 1) * 3 = 9


<br><br>Question 3 — Chrono Stack Engine
<br>Reconstructs a sequence of stack instructions (1, d, +) that produces the final timeline.

<br>Input Format:
<br>First line: number of timeline values
<br>Second line: list of integers

<br>Example Input:
<br>4
<br>5 6 3 2

<br>Example Output:
<br>BANANA
<br>1d+1+d+d+1d+1+d+d+1d+d+d+1+1d+d+1d+


<br><br>Question 4 — Cheat Buster Security System
<br>Processes numbers using a stack mechanism and outputs them in ascending order.

<br>Input Format:
<br>User enters numbers separated by spaces.

<br>Example Input:
<br>42 9 17 63 28 5 74

<br>Example Output:
<br>KASMIR TAMPAN
<br>KASMIR GANTENG BANGET
<br>5 9 17 28 42 63 74


<br><br>Question 5 — Operation Chastise
<br>Simulates bomb momentum bounces until reaching the target velocity.

<br>Input Format:
<br>Single integer representing velocity.

<br>Example Input:
<br>50

<br>Example Output:
<br>1 2 4 8 16 32 50


<br><br>Assumptions and Edge Cases

<br><br>Question 1
<br>- Empty string is considered balanced.
<br>- Input containing non-bracket characters is ignored.
<br>- Only (), {}, and [] are evaluated.

<br><br>Question 2
<br>- Division assumes integer division.
<br>- Invalid expressions (not enough operands) will produce an error.
<br>- Expression must be a valid postfix expression.

<br><br>Question 3
<br>- Stack errors occur if 'd' is used on an empty stack.
<br>- '+' requires at least two elements in the stack.
<br>- The system prints "BANANA" before executing instructions.

<br><br>Question 4
<br>- Input numbers are separated by spaces.
<br>- Numbers can be any integer.
<br>- Duplicate numbers are allowed.
<br>- The program prints "KASMIR TAMPAN" before stack processing.
<br>- The program prints "KASMIR GANTENG BANGET" during stacking formation.

<br><br>Question 5
<br>- Velocity must be greater than 0.
<br>- If the next bounce exceeds the velocity, it will be capped at the target value.

<br><br>cgpt