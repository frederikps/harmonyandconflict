javac drawgraph.java
java drawgraph < samples/$1.in ; dot -Tpng harmony.txt -Gsize=20,20\! -Gdpi=100 -o harmony$1.png
