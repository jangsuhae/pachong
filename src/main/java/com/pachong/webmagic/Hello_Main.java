package com.pachong.webmagic;

        import us.codecraft.webmagic.Spider;
        import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 *@Author feri
 *@Date Created in 2019/4/25 15:56
 */
public class Hello_Main {
    public static void main(String[] args) {
        //创建爬虫对象并设置要爬取的内容
        new Spider(new HelloProcess()).addUrl("https://search.suning.com/%E6%B4%97%E7%83%98%E4%B8%80%E4%BD%93%E6%9C%BA/")
                .addPipeline(new ConsolePipeline()).thread(5).start();

    }
}
