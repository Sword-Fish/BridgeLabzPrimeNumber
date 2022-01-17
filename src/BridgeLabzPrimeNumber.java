import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BridgeLabzPrimeNumber {

	public static void main(String[] args) {
		List<Integer> alOriginalList = new ArrayList();
		List<Integer> alPrimeList = new ArrayList();

		alOriginalList.add(5);
		alOriginalList.add(6);
		alOriginalList.add(7);
		alOriginalList.add(8);

		alPrimeList = alOriginalList.stream().filter(BridgeLabzPrimeNumber::isPrime).collect(Collectors.toList());
		System.out.println(alPrimeList);

	}

	public static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}

}
