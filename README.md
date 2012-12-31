# Anagram Solver
A multi word anagram solver

# Build
git clone https://github.com/parekhparth/AnagramSolver.git

cd AnagramSolver

mvn clean install
(above command runs the test and builds the 1.0-SNAPSHOT jar)

# Execute
after you build the jar, below is the usage details:

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

Programs first loads only those words in dictionary that are subsets of the words for which all the anagrams are to be found
After that it iterates through each word from dictionary key and does a forward lookup to see if any valid anagram is found for that key
Once you find a set of valid keys that form anagram, merge all the words that correspond to those keys

(this solver will only list unique anagrams i.e. "eleven plus two" and "two plus eleven" are similar and it will only list one of them)
