package net.datafaker.providers.base;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class BaseFakerLocaleTest extends ProviderListLocaleTest<BaseFaker> {

    protected static final List<Locale> LOCALES = List.of(
        new Locale("uk", "UA"),
        new Locale("uz", "UZ"),
        new Locale("en", "IE"),
        new Locale("de", "CH"),
        new Locale("pt", "BR"),
        new Locale("da", "DK"),
        new Locale("ja", "JP"),
        new Locale("be", "BY"),
        new Locale("cs", "CZ"),
        new Locale("de", "DE"),
        new Locale("hu", "HU"),
        new Locale("hy", "AM"),
        new Locale("ko", "KR"),
        new Locale("pt", "PT"),
        new Locale("ru", "RU"),
        new Locale("sv", "SE"),
        new Locale("th", "TH"),
        new Locale("tr", "TR"),
        new Locale("ca", "CA"),
        new Locale("fr", "FR"),
        new Locale("ar"));

    protected static final Map<Locale, BaseFaker> FAKERS_MAP = LOCALES.stream().collect(Collectors.toMap(Function.identity(), BaseFaker::new));

}
