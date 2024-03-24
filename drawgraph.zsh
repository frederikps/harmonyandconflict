# use: zsh drawgraph.zsh 1.in 
# javac drawgraph.java
java drawgraph < input/$1 ; dot -Tpng output/$1.txt -Gsize=20,20\! -Gdpi=100 -o output/$1.png
