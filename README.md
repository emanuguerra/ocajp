# Ocajp notes

Notes for the OCAJP exam.

## Java building blocks

A wildcard used in an import statement means to import all classes included in the package.

The \* wildcard doesn't import **included sub packages**.

In import statements, you can only use wildcard when it is the last character of the statement (before the semicolon).

Java lang package doesn't need to be imported.

Numeric literals are allowed to begin with 0 :

* 0 for octal
* 0x or 0X  for hexadecimal
* 0b or 0B for binary

Identifiers may contain letters, numbers, $ and _ signs.

Identifier should not start with a number.

## Operators and statements

### Operators precedence

1. Post unary operators : exp++, exp--
2. Pre unary operators : ++exp, --exp
3. Other unary operators : +,-,!
4. Multiplication, division, modulus : *,/,%
5. Addition, Substraction : +,-
6. Shift operators : <<, >>, <<<
7. Relational operators : <, >, <=, >=, instanceof
8. Equal to/not equal to : ==, !=
9. Logical operators : &, ^, |
10. Short-circuit logical operators : &&, ||
11. Ternary operators Assignment operators : boolean expression ? expression1 : expression2 
12. Assignment operators : =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=

### Numeric promotion

* Automatic promotion to the larger of the two data types
* Integral values are promoted to floated point
* Byte, short and char are promoted to int any time they're used with binary arithmetic operators
* The resulting value takes the type of the promoted operands

Examples :

    int x = 1;
    long y = 2;
    x * y is long
    
    float f = 2.1; => does not compile (floating point literals are assumed to be double unless postfixed with f
    float f = 2.1f; => compiles
    
    short x = 10;
    short y = 3;
    // Promotion to int - prints ou 3
    System.out.println(x / y);

    int x = 3; 
    int y = ++x * 5 / x-- + --x;
    // x value is 2 and y is 7
    
    int x = 1.0;  // Does not compile (double)
    short y = 1921222;  // Does not compile (too large for short)
    int z = 9f;  // Does not compile (9f is a float)
    long t = 192301398193810323;  // Does not compile (192301398193810323 is treated as a too large integer)
    
    int x = (int) 1.0; // Compiles
    short y = (short)1921222;  // Compiles, is stored as 20678
    int z = (int)9f;  // Compiles
    long t = 192301398193810323L;  // Compiles
 
    short x = 10; 
    short y = 3; 
    short z = x * y; // Does not compile
    
    short x = 10; 
    short y = 3; 
    short z = (short)(x * y); // Compiles ok









