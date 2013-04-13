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
    'av' INT 	# av
  | 're' INT	# re
  | 'td' INT 	# td
  | 'tg' INT	# tg
  | 'lc'		# lc
  | 'bc'		# bc
  | 've'		# ve
  | 'fcc' INT	# fcc
  | 'fpos' INT INT # fpos
  
;  
   