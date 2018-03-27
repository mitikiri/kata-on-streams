# Kata About Streams

Level of Difficulty: Easy

## Rules we cannot break
1) Test Driven Development. Using the "RED-GREEN-REFACTOR" principle
2) If applicable have both positive and negative test cases
3) Have fun !!!
4) Did we mention TDD already

## Rules that are optional
1) Streams - This Kata can also be accomplished without the use of streams
2) Don't read steps ahead

### Stage 1: MostMethodsAreInThisClass
1) Create a class called MostMethodsAreInThisClass
2) Create a method in Thing named as willConvertToUpperCase which will take a list of String as input and it will 
output a list of Strings
3) The method willConvertToUpperCase should be able to return all the objects in the list in UPPERCASE

### Stage 2: 
1) In the class MostMethodsAreInThisClass
2) Create a method named getPlacesMoreThanTenCharLong which will take a list of String as input and it 
will output a list of Strings 
3) The method getPlacesMoreThanTenCharLong should be able to return all the objects in the list which are more than 
10 character long

### Stage 3: 
1) In the class MostMethodsAreInThisClass
2) Create a method named flattenSomeCollections which will take lists of Strings as input and it 
   will output a list of Strings
3) The method flattenSomeCollections should be able to take objects from these multiple lists and combine it all into 
one list.

### Stage 4:
1) In the class MostMethodsAreInThisClass
2) Create a method called summaryStats which will take a list of Integers as input and will return 
a double
3) The method summaryStats should be able to                                                                         
    a) return the sum of numbers                                                                         
    b) return the number of numbers in the list                                                                         
    c) return the minimum of the numbers in the list                                                                         
    d) return the maximum of the numbers in the list                                                                         
    e) return the average of the numbers in the list

### Stage 5:
1) Create a class called Name
2) This class takes a couple of input parameters named firstname and age
3) Create a method in this class named getAdults which will take a list of Names as the input and will output a list 
of Strings
4) The method getAdults should be able to return all the distinct adults (>=18) in the list.

_**Suggestion: If you are up for it, try lombok **
  
 ### Stage 6: 
 1) This is an Optional step
 2) If you have done stages 1 through 5 using streams create a new package and repeat those steps without using 
 streams. Skip step 3
 3) If you have done stages 1 through 5 without using streams create a new package and repeat those steps using 
 streams.

 ### Stage 7: 
 1) This is an Optional step
 2) Now assume that a evil genius has taken over one of your class and is intent on modifying the method signatures.
 3) Your mission if you wish to accept it is to thwart the evil genius from doing so. 
 **MAY THE INTERFACE BE WITH YOU !!**