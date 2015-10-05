package nz.co.doltech.databind.classinfo;

import java.util.Set;

public interface IClassInfo {
    /**
     * Obtain a runtime type information on a class.<br/><br/>
     * <p/>
     * Throws a RuntimeException if the type information provider is not found.
     *
     * @param clazz The class object for which type information is required
     * @return The runtime information interface
     */
    <T> Clazz<T> clazz(Class<T> clazz);

    /**
     * Register a runtime type information provider
     *
     * @param clazz
     */
    <T> void registerClazz(Clazz<T> clazz);

    /**
     * Obtain a runtime type information on a class.
     *
     * @param name Name of the class for which type information is required
     * @return The runtime information interface
     */
    Clazz<?> findClazz(String name);

    /**
     * Obtain a runtime type information on a class.
     *
     * @param clazz The class object for which type information is required
     * @return The runtime information interface
     */
    <T> Clazz<T> findClazz(Class<T> clazz);

    /**
     * Retrieve the set of registered type information providers
     *
     * @return
     */
    Set<Class<?>> getRegisteredClazz();
}
