# LispScript - Language Design and Specification

Author: Yoto Chang (and AGS Microsystems)  
Date: Fri., Feb. 10th, 2017  
Note: This is my first compiler/interpreter/language production and I know there's a lot of optimization windows that I don't know or fully understand. I'll try my best.

## Introduction to the LispScript
LispScript is a simple script language that targeted on simple implementation with semi-academic purpose and semi-engineering purpose. Our goal is to build a more generic and beginner-friendly programming language based on S-Expression. And that is also where the name LispScript come from.

There's two plans about the implementation, one targeted on JVM and one targeted on Native Languages. The Java implementation of the language interpreter in being working in progress, and once that was finished and start iteration update, the native language implementation of the interpreter will be put on the schedule. Please follow my GitHub account for that update and more detail information.

## Preface Features
The following features are the most important and brilliant ones of the LispScript. And it will be commonly used as a propaganda slogan:

1. Simple type system
2. Great cohesion with Java and other native interfaces
3. Extremely beginner-friendly
4. Handful and useful in your daily life
5. Data-only prototype based data structure definition

## Warning
**Just like JavaScript is not Java, LispScript was not, is not and won't be, a Lisp dialect.** By remembering that (such as avoiding using Lisp syntax instinct), you can make your coding experience more comfortable.

And also, LispScript cannot be considered as a pure functional programming language, the reason is that although we highly recommend not to modify the value binding and to separate pure and impure code, the problem is still there: LispScript is a script language, there's no way avoiding interaction with the external environment. We will talk about this in the chapter about puritification.

## Type System
There're 8 different fundamental type concept in the LispScript, and if you choose to write a pure program, then there's only 7 ones you may want to concern. We will state the nature of those types one-by-one.

But before that, I want to tell you something about the literal constructors: what are they and what's its purpose.

### Fundamental Type - Literal Constructors and Correspond Sugar Syntax
In computer programs, literal value is the way you embeding data into your source code. There's 7 different kinds of literal constructors(the constructor of literal value) in the LispScript. All fundamental values except SideEffectUnit have its own specific literal constructor.

The constructor is not separatable. It is the basic semantic element, and its purpose and function is to construct a value of fundamental type. The parser of the interpreter will not separate them, instead of that, it will be handled as special cases. For more detail about these special cases, please refer to the developer's guide.

There's also some sugar syntaxes that allows you to embed a value more quickly and simpler rather than write redundant code.

### Fundamental Type - Bool
Bool is always the simplest concrete type that a programing language would provide(except Unit type), so we'll start from it.  
The contructor of Bool values can be in either forms:  
1. ``(#mkbool true)`` or ``(#mkbool false)`` (These represent the two different values of bool type)
2. ``#true`` or ``#false`` (syntactic sugar, in the future versions of the LispScript, we may also add the support of ``true`` and ``false`` as a direct constructor)

### Fundamental Type - Rational Number
Rational Number is a type that represent all the rational numbers, which is a number that can be represented as the ratio of two integers.  
The constructor of Rational Number values can be in either forms:  
1. ``(#mkrat 1)``, ``(#mkrat 1/2)`` or ``(#mkrat 0.1)`` and so on
2. ``#1``, ``#1/2`` or ``#0.1`` and so on

### Fundamental Type - List