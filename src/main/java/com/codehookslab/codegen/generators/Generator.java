package com.codehookslab.codegen.generators;

import com.codehookslab.codegen.types.Extensions;

public abstract class Generator {

    public abstract void generate(Extensions ext);
    public abstract Boolean createPackagesByLayerWise();
    public abstract void createPackagesByEntityWise();
}
