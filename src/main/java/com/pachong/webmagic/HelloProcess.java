package com.pachong.webmagic;

import com.pachong.jdbc.JdbcDemo;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/4/25 15:54
 */
public class HelloProcess implements PageProcessor {
    private Site site=Site.me().setSleepTime(100).setRetryTimes(3).setCharset("utf-8");
    @Override
    public void process(Page page) {

        List<String> cname=page.getHtml().xpath("div[@name='product-wrap']/div[@class='product-list clearfix']/ul[@class='general clearfix']/li/div[@class='item-bg']/div[@class='product-box']/div[@class='res-img']/div[@class='img-block']/a/img/@src").all();
        //List<String> introduce =page.getHtml().xpath("div[@class='nbody']/form[@name='form1']/div[@class='cxcom']/ul/li/p/text()").all();
        //List<String> logo =page.getHtml().xpath("div[@class='nbody']/form[@name='form1']/div[@class='cxcom']/ul/li/a/img/@src").all();

        for(int i=0;i<cname.size();i++){
            System.err.println("公司名："+cname.get(i));
//            System.err.println("公司介绍："+introduce.get(i));
//            System.err.println("公司徽标："+logo.get(i));
//            int index = milliliter.get(i).indexOf("ml");
//            if(index == -1){
//                continue;
//            }
//            String mi = milliliter.get(i).substring(index - 3, index);
//            if(mi.equals("加50")){
//                mi ="50";
//            }
//            System.err.println("单瓶酒含量："+mi);


           //new JdbcDemo().testInsert( image.get(i),Integer.parseInt(mi));
            //new JdbcDemo().testInsert(cname.get(i),introduce.get(i),logo.get(i));

        }
       System.err.println("---->"+cname.size());
//        if(page.getUrl().get().equals("http://china.huanqiu.com/local/?agt=15438")){
//
//            //如果当前为第一页的内容，需要抓取其他也的内容
//            List<String> pages=page.getHtml().xpath("div[@id='pages']/a/text()").all();
//            System.err.println(pages);
//            String last=pages.get(pages.size()-2);
//            //组装对应分页的路径
//            List<String> targets=new ArrayList<>();
//            for(int i=2;i<=Integer.parseInt(last);i++){
//                targets.add("http://china.huanqiu.com/local/"+i+".html?agt=15438");
//            }
//            //设置继承抓取的网址
//            page.addTargetRequests(targets);
//        }
    }

    //站点信息  请求网站的信息设置
    @Override
    public Site getSite() {
        return site;
    }
}
