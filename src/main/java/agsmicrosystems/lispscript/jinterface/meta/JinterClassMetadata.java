package agsmicrosystems.lispscript.jinterface.meta;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyutong926 on 1/26/17.
 * Class -> Module in LispScript
 */
public class JinterClassMetadata {

    private String className;
    private Class clazz;
    private String moduleName;

    /**
     * (Annotated) Dynamic Binding Name (in the annotation, not Field Name) -> Metadata
     */
    private Map<String, JinterDyBindingMetadata> annotatedDyBindingMap = new HashMap<>();

    /**
     * (Annotated) Function Name (in the annotation, not Method Name) -> Metadata
     */
    private Map<String, JinterMethodMetadata> annotatedMethodMap = new HashMap<>();
}
