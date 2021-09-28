package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills(){
        return "<html>" + "<body>" +
                "<h1>"+"Skills Tracker" +"</h1>"+
                "<h2>"+ "<ol>" +
                "<li>" + "Java" + "</li>"+
                "<li>" +"Ruby" + "</li>"+
                "<li>" +"JavaScript" + "</li>"+
                "</ol>"+"</h2>"+
                "</body>"+ "</html>";

    }


    @GetMapping("form")
    @ResponseBody
    public String form() {
        String s = "<html> <form  action='complete'>" +
                "Name: " +
                "<input type='text' name='name'> </input>" +"<br>"+ "<p>My favorite language</p>"+
                "<select name = 'options' id='options'/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "</select>"+
                "<p>My second favorite language</p><br>"+
                "<select name = 'options2' id='options'/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "</select><br>"+
                "<p>My third favorite language</p><br>"+
                "<select name = 'options3' id='options'/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "</select><br>"+
                "<input type = 'submit' value = 'submit'/>"+"</form>"+
                "</html>"

                ;

        return s;
        // method code here ...
    }

    @GetMapping("complete")
    @ResponseBody
    public String completeWithQueryParam(@RequestParam String name,@RequestParam String options,@RequestParam String options2,@RequestParam String options3 ) {
        return "<h1>Hello, "+name+"!</h1><br>" +
                "<h2>First Favorite: " + options + "</h2>"+
                "<h2>Second Favorite: " + options2 + "</h2>"+
                "<h2>Third favorite: "+ options3 +"</h2>" ;
    }
}
