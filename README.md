# JodaTimeTesting
## Automated Software Testing, Assignment 4

##### Generate the new PIT report:
```
mvn compile
mvn test
mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage
```

It will appear in a target/pit-reports folder.

The first PIT report without our tests can be found in a folder Original_PIT_report_201703232250, it's read only (don't modify it).


##### The new tests should be placed in the folders:
```
src/test/java/testsPavel/
src/test/java/testsRustam/
src/test/java/testsSherafgan/
src/test/java/testsYuliya/
```
Depending on the contributor.

The name of the test classe must begin from "Test".

If you added the new tests, you can check that it is work by the command:
`mvn test`

If the new tests is correct, then you can regenerate PIT report, and check if the mutants were killed.

##### Work with JDart
In order to test some function with JDart you should prepare two things: 

1. Write a class with the main(String[] args) method and from this method to invoke the function you want to test.
For this goal the following classes should be used:
```
src/main/java/DriverPavel.java
src/main/java/DriverRustam.java
src/main/java/DriverSherafgan.java
src/main/java/DriverYuliya.java
```
2. Prepare a file <config-name>.jpf (where <config-name> is any name of the file). 
These files should be placed int the folders:
```
JPF_Files/Pavel/
JPF_Files/Rustam/
JPF_Files/Sherafgan/
JPF_Files/Yuliya/
```
Depending on the contributor.