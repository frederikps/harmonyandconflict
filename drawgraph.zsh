# use: zsh drawgraph.zsh 
javac drawgraph.java
java drawgraph < input/1.in  ; dot -Tpng drawgraph.txt -Gsize=20,20\! -Gdpi=100 -o output/1.in.png
java drawgraph < input/2.in  ; dot -Tpng drawgraph.txt -Gsize=20,20\! -Gdpi=100 -o output/2.in.png
java drawgraph < input/3.in  ; dot -Tpng drawgraph.txt -Gsize=20,20\! -Gdpi=100 -o output/3.in.png
java drawgraph < input/4.in  ; dot -Tpng drawgraph.txt -Gsize=20,20\! -Gdpi=100 -o output/4.in.png
