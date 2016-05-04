all:
	mkdir -p build
	cp -f factory/*.java build
	cp -f image/*.java build
	cp -f player/*.java build
	cp -f messenger/*.java build
	cp -f utils/*.java build
	cp -f client/*.java build

	cd build; javac *.java; cd ..

test:
	cd build; java -ea Client; cd ..

clean:
	rm -rf build
