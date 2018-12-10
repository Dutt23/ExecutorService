package shatyaki.duttt.sd.Multi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CallableExample implements Callable<Object> {

	@Autowired
	MultiService multiService;

	private ExecutorService executor = Executors.newFixedThreadPool(4);

	@Override
	public Object call() throws Exception {
		Callable call;
		MultiService multiService = new MultiService();
		List<String> list = new ArrayList<String>();

		// list.add(multiService.test1());
		// list.add(multiService.test2());
		// list.add(multiService.test3());
		// list.add(multiService.test4());

		// executor.submit(() -> {
		//
		// list.add(multiService.test1());
		// list.add(multiService.test2());
		// list.add(multiService.test3());
		// list.add(multiService.test4());
		//
		// });

		//
		executor.submit(() -> {

			try {
				Future<String> answerOne = multiService.test1();
				list.add(answerOne.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		executor.submit(() -> {

			try {
				Future<String> answerTwo = multiService.test2();
				list.add(answerTwo.get());
			} catch (Exception e) {

			}

		});
		executor.submit(() -> {

			try {
				Future<String> answerThree = multiService.test3();
				list.add(answerThree.get());
			} catch (Exception e) {

			}

		});

		executor.submit(() -> {

			list.add(multiService.test4());

		});

		return list;
	}

}
