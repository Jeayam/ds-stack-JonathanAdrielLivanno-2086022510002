How to Compile and Run
<br>
1. Make sure Java is installed on your computer.
<br>2.  Compile : javac filename.java, run : java filename
<br>3. Example: javac BracketChecker.java, Run: java BracketChecker

<br><br>- input format + example usage
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
<br>7
<br>42 9 17 63 28 5 74
<br>Example Output
<br>5 9 17 28 42 63 74

<br><br>Question 5 — Operation Chastise
<br>Simulates bomb momentum bounces until reaching the target velocity.
<br>Input Format: Single integer representing velocity.
<br>Example:
<br>50
<br>Example Output: 1 2 4 8 16 32 50

<br><br>- Assumptions and Edge Cases
<br>Question 1: Empty string is considered balanced, Input containing non-bracket characters is ignored.

<br><br>Question 2: Division assumes integer division, Invalid expressions (not enough operands) will produce an error.

<br><br>Question 3: Stack errors occur if d is used on an empty stack. requires at least two elements in the stack.

<br><br>Question 4: Input numbers can be any integer, Duplicate numbers are allowed.

<br><br>Question 5: Velocity must be greater than 0, If the next bounce exceeds the velocity, it is capped at the target value.
<br><br>~chatgpt