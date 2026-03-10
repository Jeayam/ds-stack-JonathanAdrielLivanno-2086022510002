How to Compile and Run
<br>
1. Make sure Java is installed on your computer.
<br>2.  Compile : javac filename.java, run : java filename
<br>3. Example: javac BracketChecker.java, Run: java BracketChecker

<br>i<br>nput format + example usage
<br>Question 1 — Bracket Checker
<br>Checks whether brackets in a string are balanced using a stack.
<br>Input Format: User enters a string containing brackets.

<br>Example:
<br>Masukkan bracket:
<br>{[()]}
<br>Output:
<br>Bracket BALANCED

<br><br>Question 2 — Reverse Polish Notation Evaluation
<br>Evaluates postfix expressions using a stack.
<br>Input Format: User enters tokens separated by spaces.
<br>Example:
<br>2 1 + 3 *
<br> Output: 9

<br><br>Question 3 — Chrono Stack Engine
<br>Reconstructs a sequence of stack instructions (1, d, +) that produces the final timeline.
<br>Input Format First line: number of timeline values, Second line: list of integers
<br>Example:
<br>4
<br>5 6 3 2
<br>Example Output:
<br>1d+1+d+d+1d+1+d+d+1d+d+d+1+1d+d+1d+

<br><br>Question 4 — Cheat Buster Security System
<br>Processes numbers using a stack mechanism and outputs them in ascending order.
<br>Input Format:First line: number of elements, Second line: list of integers

<br>Example:

7
42 9 17 63 28 5 74
Example Output
5 9 17 28 42 63 74
Question 5 — Operation Chastise

Simulates bomb momentum bounces until reaching the target velocity.

Input Format

Single integer representing velocity.

Example:

50
Example Output
1 2 4 8 16 32 50
Assumptions and Edge Cases
Question 1

Empty string is considered balanced.

Input containing non-bracket characters is ignored.

Question 2

Division assumes integer division.

Invalid expressions (not enough operands) will produce an error.

Question 3

Stack errors occur if d is used on an empty stack.

+ requires at least two elements in the stack.

Question 4

Input numbers can be any integer.

Duplicate numbers are allowed.

Question 5

Velocity must be greater than 0.

If the next bounce exceeds the velocity, it is capped at the target value.