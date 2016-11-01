package com.ivanNadin;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class Ttask {



    public static void main(String[] args) throws InterruptedException {
        int j = 4;
        int k=0;

        PriorityQueue<Element4Work> pList = new PriorityQueue<Element4Work>(new Comparator<Element4Work>() {
            @Override
            public int compare(Element4Work o1, Element4Work o2) {
                int result = Integer.valueOf(o1.getItemId()).compareTo(o2.getItemId());
                if (result != 0) return (int)(result/Math.abs(result));
                result = Integer.valueOf(o1.getGroupId()).compareTo(o2.getGroupId());
                if (result != 0) return (int)(result/Math.abs(result));
                return (result != 0) ? (int)(result/Math.abs(result)) : 0;
            }
        });
        System.out.println("Enter a group number");
        Scanner in = new Scanner(System.in);
        j=in.nextInt();

        Random rand = new Random();
        for (k=0;k<j ; k++)  {
            for (int i = 1; i < 10; i++) {
                pList.offer(new Element4Work(rand.nextInt(i + 9), k));
            }
        }

        ExecutorService exec = Executors.newFixedThreadPool(2);
        while (!pList.isEmpty()) {

                exec.execute(new Working((pList.remove())));

        }
    }

}
