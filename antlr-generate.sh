#!/bin/bash

java -jar lib/antlr-4.0-rc-1-complete.jar  -visitor -o src/logoparsing  grammar/Logo.g4
mv src/logoparsing/grammar/* src/logoparsing/
rmdir src/logoparsing/grammar
