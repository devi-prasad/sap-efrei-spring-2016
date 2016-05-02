rm -f *.class

javac -cp .:json.jar INameBuilder.java NameBuilder.java Name.java \
                     NameCatalog.java \
                     StringNameBuilder.java JSONNameBuilder.java \
                     Client.java

