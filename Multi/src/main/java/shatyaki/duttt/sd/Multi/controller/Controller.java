package shatyaki.duttt.sd.Multi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shatyaki.duttt.sd.Multi.service.CallableExample;

@RestController
@RequestMapping("/multi/test")
public class Controller {

	@RequestMapping("/run")
	public Object test() throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		Callable<Object> callable = new CallableExample();

		Future<Object> future = executor.submit(callable);
		// list.add(future);

		while (!future.isDone()) {
			System.out.println("Calculating...");
			Thread.sleep(300);
		}

		List<String> lista = (List<String>) future.get();
		if (lista.size() == 4)
			return lista;
		else
			return "not completed" + lista;

	}

}
