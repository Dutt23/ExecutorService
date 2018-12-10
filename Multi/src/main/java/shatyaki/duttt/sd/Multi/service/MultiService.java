package shatyaki.duttt.sd.Multi.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.stereotype.Service;

@Service
public class MultiService {

	private ExecutorService executor = Executors.newFixedThreadPool(4);

	public Future<String> test1() {

		return executor.submit(() -> {
			return "ONE";
		});
	}

	public Future<String> test2() {

		return executor.submit(() -> {

			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");

			return "TWO";
		});

	}

	public Future<String> test3() {

		return executor.submit(() -> {
			System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");

			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");
			 System.out.println("HERE WAIT");

			return "THREE";
		});

	}

	public String test4() {

		return "FOUR";
	}

}