//======= HOW TO COMPILE AND RUN =======//
Generate: antlr4 project1.g4 -visitor
Compile: javac *.java
Run: java Main ../tests/[testname].pas

Assumptions:
1.) We assumed that you are unable to print string literals because it was too difficult to set up the grammer with
    everything
2.) We assumed that you cannot perform modifications on the variable that pertains to the for loop. So if it says
    a := 10 to 20 you cant perform any operations on the loop other than print the variable
3.) We assumed that all bodies of if statements start with a 'begin' and finish with and 'end', even though that is optional
    in actual pascal language. This made parsing and scoping much easier.
4.) Lastly, we assumed that all programs used for testing were input with correct syntax. Since there was no easy way to alert
    the user that their syntax was incorrect, we simply only tested with working code

Shortcomings:
1.) We were unable to perform the actions for user-defined functions and procedures. We spent countless hours trying to figure
    this out and came to the conclusion that we simply did not have the skills to get this done. We added grammer upon grammer
    to try to parse out all the information. But after put 40+ hours into this project we simply had enough and threw in the
    towel. Although it will certainly result in deduction of point, it should be known we gave it our honest best attempt. We
    even were able to parse a function perfectly, and it can be demonstrated using grun on the FunctionTest.pas test. 

2.) We were also unable to implement scoping. We toyed around with many different ways to do it including using inheritance as
    well as a hashmap with a parent and all different kinds of situations but in the end came up short. We simply could not
    figure it out. We also thought about maybe trying to use a different kind of wrapper to hold all the information and then
    maybe check that wrapper object to determine if the varaibles are present then they are therefore in that scope. But that
    also seemed to work on paper but not in practice.

Accomplishments:
We were however able to accomplish many things, even if we fell short on the final project. We were able to complete all
functionality from the previous project, as well as the for and while loop functionalities in this new project. We were also
able to implement the break and continue statements within the loop as well. All of these functionalities can be tested using
the provided test cases, each named appropriately for which test they perform. Therefor the project was not a complete waste,
as we were able to learn how to implement the java backend of the code that our parsing created. The purpose of each test is
listed below but as previously mentioned, the title likely explains what it is it tests for.

Tests:
AddTest.pas
This test checks the ability to add two variables together and produce the correct result

AddTestNoVar.pas
This test checks the ability to add two numbers together and produce the correct result

AndTest.pas
This test checks the ability to AND two variables correctly

BreakWhileTest.pas
This test checks the ability to perform a break statement within a while and proves that it functions correctly

ContinueWhileTest.pas
This test checks the ability to perform a continue statement within a while and proves that it functions correctly

CosTest.pas
This test checks the ability to perform a cosine test on a number and produce the correct result

DeclarationTest.pas
This test checks the ability to declare variables and correctly put them into memory

DivTest.pas
This test checks the ability to divide two variables together and produce the correct result

ElseTest.pas
This test checks the ability to enter an else statement after failing an if test and executing the code within the else

EqualTest.pas
This test checks the ability to see if two variables have the same value

ExpTes.pas
This test checks the ability to do an exp expression on a value

ForBreakTest.pas
This test checks the ability to perform a break statement within a for and proves that it functions correctly

ForContinueTest.pas
This test checks the ability to perform a continue statement within a for and proves that it functions correctly

ForLoopTest.pas
This test checks the ability to perform a for loop and proves that it functions correctly

FunctionTest.pas
This test checks the ability to test functions. WAS UNABLE TO EXECUTE CODE BUT COULD PARSE USING GRUN

GramarTest.pas
This test checks the ability to parse all tested information. MUST TEST THIS ONE WITH GRUN

GreatEqTest.pas
This test checks the ability to compare two variables to be greater than or equal to 

GreaterThanTest.pas
This test checks the ability to compare two variables to be greater than

IfTest.pas
This test checks the ability to check a boolean on an if statement and execute its code

LessThanTest.pas
This test checks the ability to compare two variables to be less than

LessEqTest.pas
This test checks the ability to compare two variables to be less than or equal to

LogTest.pas
This test checks the ability to log a number and produce correct results

ModTest.pas
This test checks the ability to modulo two variables together and produce the correct result

MultTest.pas
This test checks the ability to add two variables together and produce the correct result

NegateTest.pas
This test checks the ability to multiply two variables together and produce the correct result

NotTest.pas
This test checks the ability to NOT two variables together and produce the correct result

OrTest.pas
This test checks the ability to OR two variables together and produce the correct result

ReadTestBoolean.pas
This test checks the ability to read for user input and store its value as boolean

ReadTestFloat.pas
This test checks the ability to read for user input and store its value as float

SinTest.pas
This test checks the ability to use sine on a number and produce the correct result

SqrtTest.pas
This test checks the ability to use sqrt on a number and produce the correct result

SubTest.pas
This test checks the ability to subtract two variables together and produce the correct result

WhileTest.pas
This test checks the ability to use a while loop and correctly execute the code within the loop

WriteTest.pas
This test checks the ability to print a statement to the console


