# JodaTimeTesting
### Automated Software Testing, Assignment 4

##### Generate the new PIT report:
```
mvn compile
mvn test
mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage
```

It will appear in a target/pit-reports folder.

The first PIT report without our tests can be found in a folder `Original_PIT_report_201703232250`, it's read only (don't modify it).


##### The new tests are placed in the folders:
```
src/test/java/testsPavel/
src/test/java/testsRustam/
src/test/java/testsSherafgan/
src/test/java/testsYuliya/
```
Depending on the contributor.

The name of the test classes *must* begin with substring "Test".

New tests can check that it is work by the command:
`mvn test`

If tests are correct, then you can regenerate PIT report, and check if the mutants were killed.

##### Work with JDart

1. Сlasses with the main(String[] args) method and from this method to invoke the function you want to test.
For this goal the following classes are used:
```
src/main/java/DriverPavel.java
src/main/java/DriverRustam.java
src/main/java/DriverSherafgan.java
src/main/java/DriverYuliya.java
```
2. Files *config-name*.jpf (where *config-name* is any name of the file). 
These files should be placed int the folders:
```
JPF_Files/Pavel/
JPF_Files/Rustam/
JPF_Files/Sherafgan/
JPF_Files/Yuliya/
```
Depending on the contributor.
