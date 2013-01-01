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
	<th></th>
</tr>

<tr>
	<td>"twelve plus one"</td>
	<td>2886</td>
	<td>3</td>
	<td>1.355s</td>
	<td></td>
</tr>

<tr>
	<td>"twelve plus one"</td>
	<td>20004</td>
	<td>2</td>
	<td>2.218s</td>
	<td></td>
</tr>

<tr>
	<td>"anagram solver"</td>
	<td>8241</td>
	<td>3</td>
	<td>1.590s</td>
	<td></td>
</tr>

<tr>
	<td>"anagram solver"</td>
	<td>68016</td>
	<td>2</td>
	<td>3.751s</td>
	<td></td>
</tr>

<tr>
	<td>"astronomers"</td>
	<td>2848</td>
	<td>3</td>
	<td>1.143s</td>
	<td></td>
</tr>

<tr>
	<td>"astronomers"</td>
	<td>20279</td>
	<td>2</td>
	<td>1.904s</td>
	<td></td>
</tr>

<tr>
	<td>"a decimal point"</td>
	<td>41249</td>
	<td>3</td>
	<td>3.272s</td>
	<td></td>
</tr>

<tr>
	<td>"a decimal point"</td>
	<td>452695</td>
	<td>2</td>
	<td>18.094s</td>
	<td>ran this with -Xmx 2048m</td>
</tr>
</table>