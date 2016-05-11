all:
	mkdir -p bin
	cp adapter/calc/*.java bin
	cp  *.java bin
	cd bin; javac *.java; cd ..

run:
	cd bin; java -ea EasyMathLogger

clean:
	cd bin; rm -f *.class; cd ..; rm -f *.class
