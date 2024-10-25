package com.forsale.app.datalayer.database;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataPowerPinsSettings.kt */
/* loaded from: classes2.dex */
public final class MasterDataPowerPinsSettings {
    public static final String POWER_PINS_ADD_ENABLED_LOCATIONS = "power_pins_add_enabled_locations";
    public static final String POWER_PINS_TUTORIAL_URL_AR = "tutorial_url_ar";
    public static final String POWER_PINS_TUTORIAL_URL_EN = "tutorial_url_en";
    public static final String POWER_PINS_VIEW_ENABLED_LOCATIONS = "power_pins_view_enabled_locations";
    public static final String POWER_PIN_IMAGE_DURATION_IN_MS = "power_pin_image_duration_in_ms";
    @c(POWER_PIN_IMAGE_DURATION_IN_MS)
    private final int powerPinImageDurationInMs;
    @c(POWER_PINS_ADD_ENABLED_LOCATIONS)
    private final List<String> powerPinsAddEnabledLocations;
    @c(POWER_PINS_TUTORIAL_URL_AR)
    private final String powerPinsTutorialUrlAr;
    @c(POWER_PINS_TUTORIAL_URL_EN)
    private final String powerPinsTutorialUrlEn;
    @c(POWER_PINS_VIEW_ENABLED_LOCATIONS)
    private final List<String> powerPinsViewEnabledLocations;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MasterDataPowerPinsSettings.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataPowerPinsSettings(List<String> powerPinsViewEnabledLocations, List<String> powerPinsAddEnabledLocations, int i11, String powerPinsTutorialUrlEn, String powerPinsTutorialUrlAr) {
        o.i(powerPinsViewEnabledLocations, "powerPinsViewEnabledLocations");
        o.i(powerPinsAddEnabledLocations, "powerPinsAddEnabledLocations");
        o.i(powerPinsTutorialUrlEn, "powerPinsTutorialUrlEn");
        o.i(powerPinsTutorialUrlAr, "powerPinsTutorialUrlAr");
        this.powerPinsViewEnabledLocations = powerPinsViewEnabledLocations;
        this.powerPinsAddEnabledLocations = powerPinsAddEnabledLocations;
        this.powerPinImageDurationInMs = i11;
        this.powerPinsTutorialUrlEn = powerPinsTutorialUrlEn;
        this.powerPinsTutorialUrlAr = powerPinsTutorialUrlAr;
    }

    public static /* synthetic */ MasterDataPowerPinsSettings copy$default(MasterDataPowerPinsSettings masterDataPowerPinsSettings, List list, List list2, int i11, String str, String str2, int i12, Object obj) {
        List<String> list3 = list;
        if ((i12 & 1) != 0) {
            list3 = masterDataPowerPinsSettings.powerPinsViewEnabledLocations;
        }
        List<String> list4 = list2;
        if ((i12 & 2) != 0) {
            list4 = masterDataPowerPinsSettings.powerPinsAddEnabledLocations;
        }
        List list5 = list4;
        if ((i12 & 4) != 0) {
            i11 = masterDataPowerPinsSettings.powerPinImageDurationInMs;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str = masterDataPowerPinsSettings.powerPinsTutorialUrlEn;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            str2 = masterDataPowerPinsSettings.powerPinsTutorialUrlAr;
        }
        return masterDataPowerPinsSettings.copy(list3, list5, i13, str3, str2);
    }

    public final List<String> component1() {
        return this.powerPinsViewEnabledLocations;
    }

    public final List<String> component2() {
        return this.powerPinsAddEnabledLocations;
    }

    public final int component3() {
        return this.powerPinImageDurationInMs;
    }

    public final String component4() {
        return this.powerPinsTutorialUrlEn;
    }

    public final String component5() {
        return this.powerPinsTutorialUrlAr;
    }

    public final MasterDataPowerPinsSettings copy(List<String> powerPinsViewEnabledLocations, List<String> powerPinsAddEnabledLocations, int i11, String powerPinsTutorialUrlEn, String powerPinsTutorialUrlAr) {
        o.i(powerPinsViewEnabledLocations, "powerPinsViewEnabledLocations");
        o.i(powerPinsAddEnabledLocations, "powerPinsAddEnabledLocations");
        o.i(powerPinsTutorialUrlEn, "powerPinsTutorialUrlEn");
        o.i(powerPinsTutorialUrlAr, "powerPinsTutorialUrlAr");
        return new MasterDataPowerPinsSettings(powerPinsViewEnabledLocations, powerPinsAddEnabledLocations, i11, powerPinsTutorialUrlEn, powerPinsTutorialUrlAr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataPowerPinsSettings)) {
            return false;
        }
        MasterDataPowerPinsSettings masterDataPowerPinsSettings = (MasterDataPowerPinsSettings) obj;
        if (o.d(this.powerPinsViewEnabledLocations, masterDataPowerPinsSettings.powerPinsViewEnabledLocations) && o.d(this.powerPinsAddEnabledLocations, masterDataPowerPinsSettings.powerPinsAddEnabledLocations) && this.powerPinImageDurationInMs == masterDataPowerPinsSettings.powerPinImageDurationInMs && o.d(this.powerPinsTutorialUrlEn, masterDataPowerPinsSettings.powerPinsTutorialUrlEn) && o.d(this.powerPinsTutorialUrlAr, masterDataPowerPinsSettings.powerPinsTutorialUrlAr)) {
            return true;
        }
        return false;
    }

    public final int getPowerPinImageDurationInMs() {
        return this.powerPinImageDurationInMs;
    }

    public final List<String> getPowerPinsAddEnabledLocations() {
        return this.powerPinsAddEnabledLocations;
    }

    public final String getPowerPinsTutorialUrlAr() {
        return this.powerPinsTutorialUrlAr;
    }

    public final String getPowerPinsTutorialUrlEn() {
        return this.powerPinsTutorialUrlEn;
    }

    public final List<String> getPowerPinsViewEnabledLocations() {
        return this.powerPinsViewEnabledLocations;
    }

    public int hashCode() {
        return (((((((this.powerPinsViewEnabledLocations.hashCode() * 31) + this.powerPinsAddEnabledLocations.hashCode()) * 31) + Integer.hashCode(this.powerPinImageDurationInMs)) * 31) + this.powerPinsTutorialUrlEn.hashCode()) * 31) + this.powerPinsTutorialUrlAr.hashCode();
    }

    public String toString() {
        List<String> list = this.powerPinsViewEnabledLocations;
        List<String> list2 = this.powerPinsAddEnabledLocations;
        int i11 = this.powerPinImageDurationInMs;
        String str = this.powerPinsTutorialUrlEn;
        String str2 = this.powerPinsTutorialUrlAr;
        return "MasterDataPowerPinsSettings(powerPinsViewEnabledLocations=" + list + ", powerPinsAddEnabledLocations=" + list2 + ", powerPinImageDurationInMs=" + i11 + ", powerPinsTutorialUrlEn=" + str + ", powerPinsTutorialUrlAr=" + str2 + ")";
    }
}
