package generation.ui.view.hn75136279;

import com.mia.formation.mvc.*;
import com.mia.metamodel.*;
import com.mia.openapi.*;
import com.mia.openapi.refactoring.model.*;
import com.mia.openapi.reflect.*;
import com.mia.resource.*;
import java.io.*;
import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;

@SuppressWarnings({"unused","unchecked","rawtypes","nls","serial",})
public class mvc_Action__UIButton_N1716966559 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_Action__UIButton_N1716966559() {
		//Do nothing
	}

	//For internal use only
	mvc_Action__UIButton_N1716966559(int anyInt, List anyList) {
		List<java.lang.Integer> otherList = anyList;
		throw new java.lang.UnsupportedOperationException();
	}

	private static <T> T __check_arg__(java.lang.Class<T> expectedClass, Object argument) {
		T result = null;
		if (java.lang.Integer.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Integer(((Double) argument).intValue());
		} else if (java.lang.Float.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Float(((Double) argument).floatValue());
		} else {
			try {			
				result = expectedClass.cast(argument);
			} catch(Throwable ex) {
				throw new IllegalArgumentException(
						String.format(
								"Bad parameter type in call to %s. Found '%s' when expected '%s'.",
								"UIButton", argument.getClass().getName(),
								expectedClass.getName()));
			}
		}
		return result;
	}


	public java.lang.Object evaluate(java.lang.Object[] _action_parameters) {
		return runAction(_action_parameters);
	}

	public String runAction(java.lang.Object[] _action_parameters) {
		if (_action_parameters.length != 3)
			throw new IllegalArgumentException("Wrong number of parameters in call to ''UIButton''");

		final com.mia.formation.mvc.Action current = __check_arg__(com.mia.formation.mvc.Action.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.Action current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("		btn");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" = new Button(grpButtons, SWT.NONE);");
_template_buffer.append('\n');
_template_buffer.append("		btn");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));");
_template_buffer.append('\n');
_template_buffer.append("		btn");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".setText(\"");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("\");");
_template_buffer.append('\n');
_template_buffer.append("		btn");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".addSelectionListener(new SelectionAdapter(){");
_template_buffer.append('\n');
_template_buffer.append("		        public void widgetSelected(SelectionEvent event)");
_template_buffer.append('\n');
_template_buffer.append("		        {");
_template_buffer.append('\n');
_template_buffer.append("		          ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("();");
_template_buffer.append('\n');
_template_buffer.append("		        }");
_template_buffer.append('\n');
_template_buffer.append("		      });");
_template_buffer.append('\n');
_template_buffer.append("		      ");
_template_buffer.append('\n');
_template_buffer.append("		      ");
return _template_buffer.toString();

}
}
