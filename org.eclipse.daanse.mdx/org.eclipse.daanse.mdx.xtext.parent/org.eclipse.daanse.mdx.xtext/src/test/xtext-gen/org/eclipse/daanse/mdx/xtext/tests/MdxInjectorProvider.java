/*
 * generated by Xtext 2.28.0
 */
package org.eclipse.daanse.mdx.xtext.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.daanse.mdx.xtext.MdxRuntimeModule;
import org.eclipse.daanse.mdx.xtext.MdxStandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class MdxInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

  protected GlobalStateMemento stateBeforeInjectorCreation;
  protected GlobalStateMemento stateAfterInjectorCreation;
  protected Injector injector;

  static {
    GlobalRegistries.initializeDefaults();
  }

  @Override
  public Injector getInjector() {
    if (injector == null) {
      this.injector = internalCreateInjector();
      stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    }
    return injector;
  }

  protected Injector internalCreateInjector() {
    return new MdxStandaloneSetup() {
      @Override
      public Injector createInjector() {
        return Guice.createInjector(createRuntimeModule());
      }
    }.createInjectorAndDoEMFRegistration();
  }

  protected MdxRuntimeModule createRuntimeModule() {
    // make it work also with Maven/Tycho and OSGI
    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
    return new MdxRuntimeModule() {
      @Override
      public ClassLoader bindClassLoaderToInstance() {
        return MdxInjectorProvider.class.getClassLoader();
      }
    };
  }

  @Override
  public void restoreRegistry() {
    stateBeforeInjectorCreation.restoreGlobalState();
    stateBeforeInjectorCreation = null;
  }

  @Override
  public void setupRegistry() {
    stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    if (injector == null) {
      getInjector();
    }
    stateAfterInjectorCreation.restoreGlobalState();
  }
}
