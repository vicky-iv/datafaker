package net.datafaker.providers.base;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


public class ColorLocaleTest extends BaseFakerLocaleTest {

    @Override
    protected Stream<Arguments> localeProviderListTest() {
        return FAKERS_MAP.values().stream()
            .map(baseFaker -> TestSpec.of(() -> baseFaker.color().name(), "colr.name"))
            .map(Arguments::of);
    }
}
