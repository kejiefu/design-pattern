package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。
 * <p>
 * Future类位于java.util.concurrent包下，它是一个接口：
 *
 * @Auther kejiefu
 * @Date 2019/9/27 0027
 */
public class CallableAndFuture {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future =
                threadPool.submit(
                        new Callable<String>() {
                            public String call() throws Exception {
                                Thread.sleep(2000);
                                return "hello world";
                            }
                        }
                );
        System.out.println("等待结果");
        try {
            System.out.println("拿到结果：" + future.get());
            System.out.println("over...");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
