package com.diksha.StreamApi.client;


import java.util.*;

import com.diksha.StreamApi.model.News;


public class MyNews {
public static void main(String[] args) {
	List<News> news=new ArrayList<News>();
	
	news.add(new News(101, "Lokmat", "Hello Thane", "News"));
	
	//HashMap<String, String> hm=new HashMap<String, String>();
	HashMap<String, String> hm=new HashMap();
	hm.put(news.get(0).getCommentByUser(), news.get(0).getComment());
	hm.put("Rahul", "Awesome News");
	hm.put("Mahesh","gjgjgjh");
	HashMap<Integer, HashMap<String, String>> news1=new HashMap();
	news1.put(news.get(0).getNewsId(),hm );
	System.out.println(news1);
	
	
}
}
