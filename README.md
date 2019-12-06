# cisc3130-assignment3
Instructor: Katherine Chuang 
Section: TY2 
Brooklyn College

## Objective: WordCount.java
1)Read a text file which contain lyrics of a song.

2)Break down lyrics into unique words (ignore case and symbol)

3)Place words and its frequency into desirale Data Structure

4)output frequency of each unique word into text file.

Sample Input:

Nobody cried (Cried, cried, cried, cried)

Sample Output:

 nobody : 1
 
 cried : 5
 

## My implementation

There are two methods in WordCount.java.

1) setData() function will generate a HashSet called wordlist (it will contain all the unique word from the lyrics) and a HashMap called frequencyList(it will contain all the unique word and it's frequecy).  setData() method will extract words from a text file and put each of them into a String.  Check input Strings make sure it contains only lower case letter or digits.  Using HashSet as main data structure to count the frequency of each unique word because it doesn't allow duplicaite elements in a set structure.  Using HashMap as main data structure for frequency List.  Therefore, HashMap provides constant-time performance for the basic operations such as get() and put().  It's going to help reduce runtime when reading data from HashMap Structure.  Each key element in Hashmap are paired to a unique value.  It's perfect structure for word and it's frequency.  As setData() read in a input String, it will try to add input a into wordList by using add() method that associated with HashSet.  Add() method return a boolean value.  If input element isn't in the wordList, add() method will add the element into wordList and return ture.  Else, add() method will return false.  When add("input") is ture, setData() method will call put() method that associated with HashMap to add input and 1 into frequencyList.  When add("input") is false, setData() method will call get() method to get respective frequency for that "input".  Increment its frequency by 1.  Then update its new frequency by using replace() method.  repeat the steps over until there is no more data in text file.     

2) printData() function will create a PrintWriter which export output into a text file and a iterator from wordList.  Iterator contain all the elements from wordList.  Creating a for loop, using next() method that from iterator to get one element.  Finding the paired frequency value in frequencyList by get().  Using println() method output result into textfile.  Repeat the step over until there is no more elements in iterator.   


