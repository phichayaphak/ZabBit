package controllers;

import play.api.templates.Html;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public static Result main(Html content){
        return ok(main.render(content));
    }

    public static Result index() {
        //return ok(index.render("Your new application is ready."));
        return main(home.render());
    }




}
