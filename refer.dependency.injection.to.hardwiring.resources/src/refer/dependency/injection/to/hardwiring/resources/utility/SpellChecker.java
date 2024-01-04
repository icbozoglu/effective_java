package refer.dependency.injection.to.hardwiring.resources.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import refer.dependency.injection.to.hardwiring.resources.model.Lexicon;

//Dependency injection provides flexibility and testability
public class SpellChecker {
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isValid(String word) { 
		return false;
	}

	public List<String> suggestions(String typo) {
		return new ArrayList<>();
	}
}
