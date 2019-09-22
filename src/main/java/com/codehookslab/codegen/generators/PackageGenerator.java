package com.codehookslab.codegen.generators;

import com.codehookslab.codegen.types.Extensions;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PackageGenerator extends Generator {

    @Override
    public void generate(Extensions ext) {

    }

    @Override
    public Boolean createPackagesByLayerWise() {
        Package controllers = new Package("D:\\code-gen-demo\\packages\\controllers");
        Package services = new Package("D:\\code-gen-demo\\packages\\services");
        Package repositories = new Package("D:\\code-gen-demo\\packages\\repositories");

            controllers.mkdirs();
            services.mkdirs();
            repositories.mkdirs();
        return controllers.exists() && services.exists() && repositories.exists();
    }

    @Override
    public void createPackagesByEntityWise() {

    }
}
