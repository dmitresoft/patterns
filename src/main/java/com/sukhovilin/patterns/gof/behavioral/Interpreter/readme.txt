definition
	Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

participants

    The classes and/or objects participating in this pattern are:

    * AbstractExpression  (Expression)
          o declares an interface for executing an operation
    * TerminalExpression  ( ThousandExpression, HundredExpression, TenExpression, OneExpression )
          o implements an Interpret operation associated with terminal symbols in the grammar.
          o an instance is required for every terminal symbol in the sentence.
    * NonterminalExpression  ( not used )
          o one such class is required for every rule R ::= R1R2...Rn in the grammar
          o maintains instance variables of type AbstractExpression for each of the symbols R1 through Rn.
          o implements an Interpret operation for nonterminal symbols in the grammar. Interpret typically calls itself recursively on the variables representing R1 through Rn.
    * Context  (Context)
          o contains information that is global to the interpreter
    * Client  (InterpreterApp)
          o builds (or is given) an abstract syntax tree representing a particular sentence in the language that the grammar defines. The abstract syntax tree is assembled from instances of the NonterminalExpression and TerminalExpression classes
          o invokes the Interpret operation