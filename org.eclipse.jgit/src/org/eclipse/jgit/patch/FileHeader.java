import org.eclipse.jgit.internal.JGitText;
			throw new IllegalArgumentException(MessageFormat.format(
					JGitText.get().expectedCharacterEncodingGuesses,
					Integer.valueOf(getParentCount() + 1)));