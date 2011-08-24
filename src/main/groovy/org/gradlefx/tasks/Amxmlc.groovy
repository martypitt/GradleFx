package org.gradlefx.tasks

/**
 * Created by IntelliJ IDEA.
 * User: martypitt
 * Date: 25/08/11
 * Time: 8:02 AM
 * To change this template use File | Settings | File Templates.
 */
class Amxmlc extends Mxmlc{

     @Override
     protected List createCompilerArguments() {
         List arguments = super.createCompilerArguments()
         arguments.add(0,"+configname=air")
         return arguments
     }
}
