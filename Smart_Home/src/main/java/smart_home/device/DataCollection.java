package smart_home.device;

import java.util.EnumSet;

/**
 * Interface Data Collection serves as an API for getting consumption data.
 */
public interface DataCollection {
    
    /**
     * Method getResources retrieves consumption data from devices.
     * @return EnumSet
     */
    public EnumSet<Resources> getResources();
    
}
