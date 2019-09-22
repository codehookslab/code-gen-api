package com.codehookslab.codegen.generators;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PackageGeneratorTest {

    @TestConfiguration
    static class PackageGeneratorTestConfiguration {
        @Bean
        public PackageGenerator packageGenerator() {
            return new PackageGenerator();
        }
    }

    @Autowired
    PackageGenerator packageGenerator;

    @Test
    public void createPackages_LayerWise() {
        Boolean result = packageGenerator.createPackagesByLayerWise();
        Assert.assertTrue(result);
    }
}
