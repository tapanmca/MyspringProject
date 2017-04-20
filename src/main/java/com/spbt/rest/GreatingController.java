package com.spbt.rest;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class GreatingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public   Greeting  greeting( @RequestParam(value="name", defaultValue="Kumar Tapan Rout") String name)
    {
    	//return "KUMAR TAPAN cdvf skrt ";
   return new Greeting (counter.incrementAndGet(), String.format(template, name));
      }
   // @RequestMapping("*")
   //
    @RequestMapping(value="/ad",method=RequestMethod.POST) 
    @ResponseBody
   // @Consumes(MediaType.APPLICATION_JSON)
    public String  Postdat(@RequestBody Greeting  grt)
    {
    	return "KUMAR -TAPAN  "+"ROUT- RAY"+"RAGHU- NATH PUR :"+grt.getId();
   
      }
}
