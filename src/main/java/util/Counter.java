package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
        if (_ctr % 2 != 0) {
            _ctr++;
        }
    }


	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
        if (_ctr % 2 != 0) {
            _ctr--;
        } else {
            _ctr -= 2;
        }
    }

	public void incrementToPrime() {
        _ctr = findNextPrime(_ctr + 1);
    }

	private int findNextPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

	public void decrementToPrime() {
        if (_ctr > 2) {
            _ctr = findPreviousPrime(_ctr - 1);
        } else {
            _ctr = 2; // 2 is the smallest prime number
        }
    }
	 // Helper method to find the previous prime number
	 private int findPreviousPrime(int num) {
        while (!isPrime(num)) {
            num--;
        }
        return num;
    }
    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = 0;  // Initialize the counter to zero
		String[] words = sentence.toLowerCase().split("\\s+");  // Split sentence into words (case-insensitive)
	
		for (String currentWord : words) {
			if (currentWord.equals(word.toLowerCase())) {  // Compare words in lowercase
				_ctr++;
			}
		}
	}
	

}
