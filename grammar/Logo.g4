grammar Logo; 

@header {
  package logoparsing;
}

INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;

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
	arithmeticExpression '+' arithmeticExpression	# sum
  |	arithmeticExpression '-' arithmeticExpression 	# sub
  | arithmeticExpression '*' arithmeticExpression	# mul
  | arithmeticExpression '/' arithmeticExpression 	# div
  | '(' arithmeticExpression ')'					# parenthesis
  | 'hasard' INT									# rand
  | INT												# arithmeticExpressionInt
;

  