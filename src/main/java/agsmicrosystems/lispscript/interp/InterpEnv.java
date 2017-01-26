package agsmicrosystems.lispscript.interp;

import agsmicrosystems.lispscript.jinterface.meta.JinterClassMetadata;

import java.io.File;
import java.util.*;

/**
 * Created by zhangyutong926 on 1/25/17.
 * Instantiate one and only one in Main
 */
public class InterpEnv {

    /**
     * Where to find system modules
     */
    private List<File> modulePathList = new ArrayList<>();

    /**
     * UUID -> LispScript
     */
    private Map<String, LispScript> uuidScriptMap = new HashMap<>();

    /**
     * UUID -> Interface Metadata
     */
    private Map<String, JinterClassMetadata> uuidJinterMap = new HashMap<>();

    /**
     * Module Name -> [UUIDs]
     */
    private Map<String, List<String>> moduleScriptMap = new HashMap<>();

    public List<File> getModulePathList() {
        return modulePathList;
    }

    public Map<String, LispScript> getUuidScriptMap() {
        return uuidScriptMap;
    }

    public Map<String, JinterClassMetadata> getUuidJinterMap() {
        return uuidJinterMap;
    }

    public Map<String, List<String>> getModuleScriptMap() {
        return moduleScriptMap;
    }
}
