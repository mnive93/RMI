A java  program to establish connectivity between server and client using RMI(Remote Method Invocation)
To compile the program type in this order!
javac Calculator.java
javac Calcserver.java
javac Server.java
javac Client.java
rmic Calcserver
rmiregistry &
java Server
java Client