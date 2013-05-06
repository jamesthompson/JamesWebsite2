package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def about = Action {
  	Ok(views.html.about())
  }

  def cv = Action {
  	Ok(views.html.cv())
  }

  def contact = Action {
  	Ok(views.html.contact())
  }

  def science = Action {
    Ok(views.html.science())
  }

  def computing = Action {
    Ok(views.html.computing())
  }

  def hobbies = Action {
    Ok(views.html.hobbies())
  }
  
}