## Public Sites - Middleware - Coding exercise


### Context

This test is designed to provide an opportunity to write production-quality 
code in an unsupervised environment and serve as a starting point for further 
technical discussions. We’ll be reviewing certain aspects of the solution, such
as ***testing, OO design, design patterns, performance and readability***.

While it should be written in Java, there are no restrictions as to what 
libraries, frameworks and approaches should be used. Make sure you follow your 
usual development process, and if you need to make assumptions, please document
them as you may see fit. The exercise should approximately take about **1 hour**
of coding and **0.5 hour** of refactoring, *use this half hour to improve your code
instead of using it to finish the main features*.

### Description
Implement a command line interpreter that does the following:
1.	Waits for a one-line command
2.	Does some processing specific to the first word of the line
3.	Outputs result
4.	Repeats the above until instructed otherwise

### Commands

| Input         | Sample output | Description                                     |
| ------------- | ------------- | ----------------------------------------------- |
| gcf 10 5      | 5             | Greatest common factor                          |
| uwc test.txt  | 4             | Count the unique words in the file specified    |
| lc test2.txt  | 6             | Count the number of lines in the file specified |
| exit          |               | Stop interpreter                                |


