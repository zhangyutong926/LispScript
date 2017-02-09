# The LispScript Open Source Project (LSOSP)

(An AGS-Microsystems Software)

```lisp
! module HelloWorld
! import-system IO

(cli-print #"Hello World!")
```

## Intention
The LSOSP is a subproject of the [CWOJ](https://github.com/CDFLS/CWOJ).  
The basic intention of it is to implement a DSL hosting language that allow us to
build a DSL for the player program judging and scoring function of the CWOJ.


## Introduction
The LSOSP is a simple and naive project targeted on implementing a universal
script and a DSL hosting platform with the power of JVM.

The LSOSP use Lisp-liked syntax and provide the following feature that Common Lisp
don't:

1. A simple Strong-typed type system
2. A better coding style for scripting and DSL
3. A better logical module system


## Language Specification
Despite of the fact that LispScript was inspired by Lisp, the syntax and critical
concepts of the LispScript is very different from the original one.

### Types and Literal Constructors
First, we're not intended to implement a typed Lisp (like typed Racket).
With this target, we designed a type system that contains only 8 basic types,

There is a literal initializing system allow you to write data directed into your
program for the basic type.

The basic types and their constructors are:

1. Rational:  
Rational means rational numbers. You may use this type to represent any rational
number. You may use the following constructors to initialize a rational number:
``#1    #0.5    #1/2    (#mkrat 1 2)``
2. Bool:
Bool type is common in programming languages, and in the LispScript, we use the
following literal constructors for the initializing of the bool values:
``#true    #false    (#mkbool true)``
3. List:
List is a varies type and it's the most important type you may find in the LispScript.
You do not have the way to actually define a type, so the only way for you to pass
complicated data throughout the script is to use a list. List in LispScript is very
different from other languages, it is actually a universal metacomplex that allows you
to contain any data you want, even if they are with different types.
``#[#1 #10 #true #false]    (#mklist #1 #10 #true #false)``
4. Character:
Character is a single utf-8 character, you may create it by the following literal
constructors:
``#'a'    #U0xC7B1    (#mkchar 0xC7B1)``
5. String:
As you may already found that in other languages you always choose to represent a
string with a char list. But considering the list in the LispScript is a representation
of a composited varies data items, we defined a brand-new type for the string.
``#"Hello World"    (#mkstr "Hello World")``
6. Function:
7. Object:
8. Side Effect Abstraction:

(Working in progress)

### Bindings and Names
Binding is another important concept in a functional language. It is a name-value
mapping that allows you to designate a alias to a complicated value.

You should define data bindings by using the predefined key statement ``defval``.  
Here's some basic examples:
```lisp
(defval $a #1)
(defval $b #[#1 $a "Hello World" #true #'a'])
```
And you may also noticed that the binding name always started with a dollar character,
that's because this way could avoid ambiguous.

The name of bingding and function can be letters, numbers (not the first character),
dashes ("-") and underlines ("_"). And it can be the same as the system predefined symbols
such as ``$defval`` or ``$defun``.

### Functions, Closures and Anonymous Functions

(Working in progress)
