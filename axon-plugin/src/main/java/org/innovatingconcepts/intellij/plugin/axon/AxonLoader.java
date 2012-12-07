package org.innovatingconcepts.intellij.plugin.axon;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.BuildNumber;

public class AxonLoader implements ApplicationComponent {
    private static final Logger LOG = Logger.getInstance(AxonLoader.class.getName());

    public AxonLoader() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "Axon plugin for IntelliJ";
    }

    @Override
    public void initComponent() {
        final BuildNumber buildNumber = ApplicationInfo.getInstance().getBuild();
        LOG.info("Axon plugin started for IntelliJ IDEA " + buildNumber.asString());

        // TODO: Register on ExtensionRegister
    }

    @Override
    public void disposeComponent() {

        // TODO: Register on ExtensionRegister
  }
}
