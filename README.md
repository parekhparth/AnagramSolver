# Anagram Solver
A multi word anagram solver

# Build
git clone https://github.com/parekhparth/AnagramSolver.git

cd AnagramSolver

mvn clean install
(above command runs the test and builds the 1.0-SNAPSHOT jar)

# Execute
after you build the jar, you can run the anagram solver using following:

Usage:
java -cp AnagramSolver.jar com.parthparekh.algorithms.AnagramSolver <absolute_path_to_wordlist_file> <min_word_length> <words_for_anagram_search>

for e.g. if you want to find all the anagrams for "eleven plus two" with minimum 3 letter words, and wordlist file under /tmp/wordlist.txt, you need to run:

java -cp AnagramSolver.jar com.parthparekh.algorithms.AnagramSolver /tmp/wordlist.txt 3 eleven plus two

(you can download the wordlist from here => http://www.sil.org/linguistics/wordlists/english/)

# Logic

## Word Dictionary
(refer SortedWordDictionary.java for this)

Dictionary is a Map with sorted characters as key and all the corresponding words as value (Set of strings)

## Anagram Solver
(refer AnagramSolver.java for this)

Programs first loads only those words in dictionary that are subsets of the words for which all the anagrams are to be found.
After that it iterates through each word from dictionary key and does a recursive forward lookup to see if any valid anagram is found for that key.
It will only do forward lookup because, anagrams for all the words that have already been traversed, should have already been found.
Once you find a set of valid keys that form anagram, merge all the words that correspond to those keys.

(this solver will only list unique anagrams i.e. "eleven plus two" and "two plus eleven" are similar and it will only list one of them)


# Stats

Below time stats are taken from my MacBook Air (8G memory, Intel core i7)
<table border="0">
<tr>
	<th>Words</th>
	<th>Total number of unique anagrams</th>
	<th>Minimum anagram word length</th>
	<th>Time taken (real)</th>
	<th>Comments</th>
</tr>

<tr>
	<td>"twelve plus one"</th>
	<td>2886</th>
	<td>3</th>
	<td>1.355s</th>
</tr>

<tr>
	<td>"twelve plus one"</th>
	<td>20004</th>
	<td>2</th>
	<td>2.218s</th>
</tr>

<tr>
	<td>"anagram solver"</th>
	<td>8241</th>
	<td>3</th>
	<td>1.590s</th>
</tr>

<tr>
	<td>"anagram solver"</th>
	<td>68016</th>
	<td>2</th>
	<td>3.751s</th>
</tr>

<tr>
	<td>"astronomers"</th>
	<td>2848</th>
	<td>3</th>
	<td>1.143s</th>
</tr>

<tr>
	<td>"astronomers"</th>
	<td>20279</th>
	<td>2</th>
	<td>1.904s</th>
</tr>

<tr>
	<td>"a decimal point"</th>
	<td>41249</th>
	<td>3</th>
	<td>3.272s</th>
</tr>

<tr>
	<td>"a decimal point"</th>
	<td>452695</th>
	<td>2</th>
	<td>18.094s</th>
	<td>ran this with -Xmx 2048m</th>
</tr>
</table>