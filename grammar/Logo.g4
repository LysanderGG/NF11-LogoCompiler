grammar Logo; 

@header {
  package logoparsing;
}

BOOL 	: 'true' | 'false';
INT 	: '0' | [1-9][0-9]* ;
WS 		: [ \t\r\n]+ -> skip ;
VAR		: [a-zA-Z][a-zA-Z0-9_\-]*;

programme : liste_instructions 
;

liste_instructions :
  (instruction)+   
;

instruction :
	'lc'							# lc
  | 'bc'							# bc
  | 've'							# ve
  | 'av'  arithmeticExpression 		# av
  | 're'  arithmeticExpression		# re
  | 'td'  arithmeticExpression 		# td
  | 'tg'  arithmeticExpression		# tg
  | 'fcc' arithmeticExpression		# fcc
  | 'fpos' arithmeticExpression arithmeticExpression 	# fpos
  | 'si' booleanExpression block elseBlock				# ifExpression
  | 'repete' arithmeticExpression block					# repeatExpression
  | 'tantque' booleanExpression block					# whileExpression
  | 'donne' '"' VAR arithmeticExpression					# affectationExpression
; 

arithmeticExpression :
    'hasard' arithmeticExpression					# rand
  | arithmeticExpression '*' arithmeticExpression	# mul
  | arithmeticExpression '/' arithmeticExpression 	# div
  | arithmeticExpression '+' arithmeticExpression	# sum
  |	arithmeticExpression '-' arithmeticExpression 	# sub
  | '(' arithmeticExpression ')'					# parenthesis
  | ':' VAR											# arithmeticExpressionVar
  | INT												# arithmeticExpressionInt
;

// Fin Seance 2

booleanExpression :
    booleanExpression '&&' booleanExpression		# and
  | booleanExpression '||' booleanExpression  		# or
  | arithmeticExpression '=' arithmeticExpression	# eq
  | arithmeticExpression '<' arithmeticExpression	# inf
  | arithmeticExpression '<=' arithmeticExpression	# infEq
  | arithmeticExpression '>' arithmeticExpression	# sup
  | arithmeticExpression '>=' arithmeticExpression	# supEq
  |	BOOL 											# bool
;

block : '[' liste_instructions ']';

elseBlock : block 	
			| 
			; 
