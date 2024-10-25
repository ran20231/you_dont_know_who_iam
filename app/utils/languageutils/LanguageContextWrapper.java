package com.forsale.app.utils.languageutils;

import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.z0;
import zz.a;
/* compiled from: LanguageContextWrapper.kt */
/* loaded from: classes3.dex */
public final class LanguageContextWrapper extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f40333a = new Companion(null);

    /* compiled from: LanguageContextWrapper.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object b(Companion companion, Context context, String str, a aVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "KWT";
            }
            return companion.a(context, str, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(android.content.Context r5, java.lang.String r6, zz.a<? super com.forsale.app.utils.languageutils.LanguageContextWrapper> r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion$wrap$1
                if (r0 == 0) goto L13
                r0 = r7
                com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion$wrap$1 r0 = (com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion$wrap$1) r0
                int r1 = r0.f40338e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40338e = r1
                goto L18
            L13:
                com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion$wrap$1 r0 = new com.forsale.app.utils.languageutils.LanguageContextWrapper$Companion$wrap$1
                r0.<init>(r4, r7)
            L18:
                java.lang.Object r7 = r0.f40336c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f40338e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r5 = r0.f40335b
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r5 = r0.f40334a
                android.content.Context r5 = (android.content.Context) r5
                kotlin.f.b(r7)
                goto L4c
            L32:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3a:
                kotlin.f.b(r7)
                com.forsale.app.utils.LocaleManager r7 = com.forsale.app.utils.LocaleManager.f39597a
                r0.f40334a = r5
                r0.f40335b = r6
                r0.f40338e = r3
                java.lang.Object r7 = r7.h(r0)
                if (r7 != r1) goto L4c
                return r1
            L4c:
                java.lang.String r7 = (java.lang.String) r7
                java.util.Locale r0 = new java.util.Locale
                r0.<init>(r7, r6)
                android.content.res.Resources r6 = r5.getResources()
                android.content.res.Configuration r6 = r6.getConfiguration()
                java.util.Locale.setDefault(r0)
                r6.setLocale(r0)
                r6.setLayoutDirection(r0)
                android.content.res.Resources r7 = r5.getResources()
                android.content.res.Resources r0 = r5.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                r7.updateConfiguration(r6, r0)
                android.content.Context r7 = r5.getApplicationContext()
                android.content.res.Resources r7 = r7.getResources()
                android.content.Context r0 = r5.getApplicationContext()
                android.content.res.Resources r0 = r0.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                r7.updateConfiguration(r6, r0)
                android.content.Context r5 = r5.createConfigurationContext(r6)
                java.lang.String r6 = "createConfigurationContext(...)"
                kotlin.jvm.internal.o.h(r5, r6)
                com.forsale.app.utils.languageutils.LanguageContextWrapper r6 = new com.forsale.app.utils.languageutils.LanguageContextWrapper
                r7 = 0
                r6.<init>(r5, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.languageutils.LanguageContextWrapper.Companion.a(android.content.Context, java.lang.String, zz.a):java.lang.Object");
        }
    }

    public /* synthetic */ LanguageContextWrapper(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private LanguageContextWrapper(Context context) {
        super(context, z0.f70794d);
    }
}
