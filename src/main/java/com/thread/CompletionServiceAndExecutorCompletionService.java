package com.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Auther kejiefu
 * @Date 2019/9/27 0027
 */
public class CompletionServiceAndExecutorCompletionService {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool);
        for (int i = 1; i <= 10; i++) {
            final int seq = i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(new Random().nextInt(5000));
                    return seq;
                }
            });
        }
        for (int i = 0; i < 10; i++) {
            try {
                // 取出并移除表示下一个已完成任务的 Future，如果目前不存在这样的任务，则等待。
                Integer seq = completionService.take().get();
                System.out.println("第" + seq + "个任务返回");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("over...");
    }
}
