package reflectionapi;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;

public class ReflectionClass {

  public static void main(String[] args) {
    try {
      Class cl = Class.forName("reflectionapi.RandomInterface");
      System.out.println(getInterface(cl));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

  protected static String getInterface(Class input) {
    StringBuilder code = new StringBuilder();

    //code.append(input.getModifiers());
    code.append("interface ");
    code.append(input.getName());
    if (input.getInterfaces().length > 0) {
      code.append(" extends ");
      for (int i = 0; i < input.getInterfaces().length; i++) {
        code.append(input.getInterfaces()[i].getName());
        if (i < input.getInterfaces().length - 1) {
          code.append(",");
        }
      }
    }
    code.append("{\n");

    Method[] methods = input.getMethods();

    for (int i = 0; i < methods.length; i++) {
//      code.append(methods[i].getModifiers()); //TODO: check what 1025 is
//      code.append(" ");

      code.append(methods[i].getReturnType().getName());
      code.append(" ");
      code.append(methods[i].getName());
      code.append("(");
      Parameter[] parameters = methods[i].getParameters();

      for (int j = 0; j < parameters.length; j++) {
        code.append(parameters[j].getType().getCanonicalName());
        code.append(" ");
        code.append(parameters[j].getName());
        if (j < parameters.length - 1) {
          code.append(",");
        }
      }
      code.append(")");

      if (methods[i].getExceptionTypes().length > 0) {
        code.append(" throws ");
        for (int j = 0; j < methods[i].getExceptionTypes().length; j++) {
          code.append(methods[i].getExceptionTypes()[j].getName());
          if (j < methods[i].getExceptionTypes().length - 1) {
            code.append(",");
          }
          else {
            code.append(";");
            code.append("\n");
          }
        }
      } else {
        code.append(";");
        code.append("\n");
      }
    }
    code.append("}");
    return code.toString();
  }

  public static String saveFile() {
    return null;

  }


}
