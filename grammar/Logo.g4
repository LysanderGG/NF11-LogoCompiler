grammar Logo; 

@header {
  package logoparsing;
}

BOOL 	: 'true' | 'false';
INT 	: '0' | [1-9][0-9]* ;
WS 		: [ \t\r\n]+ -> skip ;

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
; 

arithmeticExpression :
    'hasard' arithmeticExpression					# rand
  | arithmeticExpression '*' arithmeticExpression	# mul
  | arithmeticExpression '/' arithmeticExpression 	# div
  | arithmeticExpression '+' arithmeticExpression	# sum
  |	arithmeticExpression '-' arithmeticExpression 	# sub
  | '(' arithmeticExpression ')'					# parenthesis
  | INT												# arithmeticExpressionInt
;

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

