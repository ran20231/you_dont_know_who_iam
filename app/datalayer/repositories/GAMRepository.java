package com.forsale.app.datalayer.repositories;

import com.forsale.app.features.categories.listings.ListingScreenID;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.leanplum.core.BuildConfig;
import g00.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import wz.p;
/* compiled from: GAMRepository.kt */
/* loaded from: classes2.dex */
public final class GAMRepository {
    private static final String CAT_ID = "cat_id";
    private static final String DISTRICT_ID = "district_id";
    private static final String GENDER_ID = "gender_id";
    private static final String LANG_ID = "lang_id";
    private static final String POSITION = "pos";
    private static final String SCREEN_ID = "screen_id";
    private static final String SEGMENTS = "segments";
    private final fj.b gamUtils;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GAMRepository.kt */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    private @interface AdMobDSLMarker {
    }

    /* compiled from: GAMRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GAMRepository.kt */
    /* loaded from: classes2.dex */
    public static final class LanguageId {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ LanguageId[] $VALUES;
        public static final Companion Companion;
        private final String value;
        public static final LanguageId ARABIC = new LanguageId("ARABIC", 0, BuildConfig.BUILD_NUMBER);
        public static final LanguageId ENGLISH = new LanguageId("ENGLISH", 1, "1");

        /* compiled from: GAMRepository.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {

            /* compiled from: GAMRepository.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Languages.values().length];
                    try {
                        iArr[Languages.ARABIC.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Languages.ENGLISH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LanguageId toLanguageId(Languages languages) {
                o.i(languages, "<this>");
                int i11 = WhenMappings.$EnumSwitchMapping$0[languages.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        return LanguageId.ENGLISH;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return LanguageId.ARABIC;
            }
        }

        private static final /* synthetic */ LanguageId[] $values() {
            return new LanguageId[]{ARABIC, ENGLISH};
        }

        static {
            LanguageId[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new Companion(null);
        }

        private LanguageId(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<LanguageId> getEntries() {
            return $ENTRIES;
        }

        public static LanguageId valueOf(String str) {
            return (LanguageId) Enum.valueOf(LanguageId.class, str);
        }

        public static LanguageId[] values() {
            return (LanguageId[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public GAMRepository(fj.b gamUtils) {
        o.i(gamUtils, "gamUtils");
        this.gamUtils = gamUtils;
    }

    private final void addLangTargetValue(AdManagerAdRequest.Builder builder) {
        builder.addCustomTargeting(LANG_ID, LocaleManager.f39597a.j().getValue());
    }

    public static /* synthetic */ AdManagerAdRequest buildForCategory$default(GAMRepository gAMRepository, Integer num, fj.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return gAMRepository.buildForCategory(num, aVar);
    }

    public static /* synthetic */ AdManagerAdRequest buildForCategoryAndPosition$default(GAMRepository gAMRepository, Integer num, Integer num2, fj.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return gAMRepository.buildForCategoryAndPosition(num, num2, aVar);
    }

    @AdMobDSLMarker
    private final AdManagerAdRequest buildRequest(l<? super AdManagerAdRequest.Builder, p> lVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        lVar.invoke(builder);
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        return build;
    }

    public final AdManagerAdRequest buildBasicGeneral() {
        AdManagerAdRequest build = new AdManagerAdRequest.Builder().build();
        o.h(build, "run(...)");
        return build;
    }

    public final AdManagerAdRequest buildForCategoriesAndDistricts(Integer num, Integer num2, fj.a aVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (num != null) {
            builder.addCustomTargeting("cat_id", num.toString());
        }
        if (num2 != null) {
            builder.addCustomTargeting("district_id", num2.toString());
        }
        if (aVar != null) {
            builder.setContentUrl(this.gamUtils.b(aVar));
            List<String> c11 = aVar.c();
            if (c11 != null) {
                builder.addCustomTargeting(SEGMENTS, c11);
            }
        }
        addLangTargetValue(builder);
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        x10.a.b(build.getCustomTargeting().toString(), new Object[0]);
        return build;
    }

    public final AdManagerAdRequest buildForCategory(Integer num, fj.a aVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (num != null) {
            builder.addCustomTargeting("cat_id", String.valueOf(num.intValue()));
        }
        addLangTargetValue(builder);
        if (aVar != null) {
            builder.setContentUrl(this.gamUtils.b(aVar));
            List<String> c11 = aVar.c();
            if (c11 != null) {
                builder.addCustomTargeting(SEGMENTS, c11);
            }
        }
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        return build;
    }

    public final AdManagerAdRequest buildForCategoryAndPosition(Integer num, Integer num2, fj.a aVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (num != null) {
            builder.addCustomTargeting("cat_id", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            num2.intValue();
            builder.addCustomTargeting(POSITION, num2.toString());
        }
        addLangTargetValue(builder);
        if (aVar != null) {
            builder.setContentUrl(this.gamUtils.b(aVar));
            List<String> c11 = aVar.c();
            if (c11 != null) {
                builder.addCustomTargeting(SEGMENTS, c11);
            }
        }
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        return build;
    }

    public final Object buildForInterstitialForCategory(int i11, fj.a aVar, zz.a<? super AdManagerAdRequest> aVar2) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GAMRepository$buildForInterstitialForCategory$2(this, i11, aVar, null), aVar2);
    }

    public final AdManagerAdRequest buildForInterstitialForDeepLink() {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        addLangTargetValue(builder);
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        return build;
    }

    public final AdManagerAdRequest buildForMidBanner(Integer num, Integer num2, int i11, fj.a aVar, ListingScreenID listingScreenID) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (num != null) {
            builder.addCustomTargeting("cat_id", num.toString());
        }
        if (num2 != null) {
            builder.addCustomTargeting("district_id", num2.toString());
        }
        builder.addCustomTargeting(POSITION, String.valueOf(i11));
        if (listingScreenID != null) {
            builder.addCustomTargeting(SCREEN_ID, listingScreenID.getValue());
        }
        if (aVar != null) {
            builder.setContentUrl(this.gamUtils.b(aVar));
            List<String> c11 = aVar.c();
            if (c11 != null) {
                builder.addCustomTargeting(SEGMENTS, c11);
            }
        }
        addLangTargetValue(builder);
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        x10.a.b(build.getCustomTargeting().toString(), new Object[0]);
        return build;
    }

    public final AdManagerAdRequest buildForSearchHome() {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        addLangTargetValue(builder);
        AdManagerAdRequest build = builder.build();
        o.h(build, "run(...)");
        return build;
    }
}
