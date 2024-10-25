package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: LocalizationSharedPrefs.kt */
/* loaded from: classes3.dex */
public final class LocalizationSharedPrefs {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40453d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f40454e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final c<h3.a> f40455a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0641a<Integer> f40456b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0641a<String> f40457c;

    /* compiled from: LocalizationSharedPrefs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocalizationSharedPrefs(c<h3.a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40455a = dataStore;
        this.f40456b = h3.c.d(AdvancedSearchBody.TRANSLATION);
        this.f40457c = h3.c.f("current_language");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TranslationRepository.Translation e(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return TranslationRepository.Translation.ARABIC;
                }
                String simpleName = TranslationRepository.Translation.class.getSimpleName();
                throw new IllegalArgumentException(i11 + " value does not have any corresponding value in " + simpleName + " Enum");
            }
            return TranslationRepository.Translation.ENGLISH;
        }
        return TranslationRepository.Translation.ORIGINAL;
    }

    public final Object b(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40455a, this.f40457c, Languages.ENGLISH.getValue(), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zz.a<? super com.forsale.app.datalayer.repositories.TranslationRepository.Translation> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs$getTranslation$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs$getTranslation$1 r0 = (com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs$getTranslation$1) r0
            int r1 = r0.f40468d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40468d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs$getTranslation$1 r0 = new com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs$getTranslation$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40466b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40468d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f40465a
            com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs r0 = (com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs) r0
            kotlin.f.b(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.f.b(r6)
            d3.c<h3.a> r6 = r5.f40455a
            h3.a$a<java.lang.Integer> r2 = r5.f40456b
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r4 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ORIGINAL
            int r4 = r4.getKey()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            r0.f40465a = r5
            r0.f40468d = r3
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.a(r6, r2, r4, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r6 = r0.e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs.c(zz.a):java.lang.Object");
    }

    public final Flow<TranslationRepository.Translation> d() {
        return new LocalizationSharedPrefs$getTranslationAsFlow$$inlined$map$1(DataStoreExtensionsKt.b(this.f40455a, this.f40456b, Integer.valueOf(TranslationRepository.Translation.ORIGINAL.getKey())), this);
    }

    public final Object f(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40455a, this.f40457c, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object g(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40455a, this.f40456b, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
